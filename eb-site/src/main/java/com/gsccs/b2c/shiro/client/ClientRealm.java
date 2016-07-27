package com.gsccs.b2c.shiro.client;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ByteSource;

import com.gsccs.b2c.api.domain.User;
import com.gsccs.b2c.api.exception.ApiException;
import com.gsccs.b2c.api.service.BuyerServiceI;

/**
 * 
 */
public class ClientRealm extends AuthorizingRealm {

	private BuyerServiceI buyerAPI;
	private String appKey;

	
	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}
	public BuyerServiceI getBuyerAPI() {
		return buyerAPI;
	}

	public void setBuyerAPI(BuyerServiceI buyerAPI) {
		this.buyerAPI = buyerAPI;
	}

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(
			PrincipalCollection principals) {
		String username = (String) principals.getPrimaryPrincipal();
		SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
		/*PermissionContext context = permissionAPI.getPermissions(appKey,
				username);*/
		//authorizationInfo.setRoles(context.getRoles());
		//authorizationInfo.setStringPermissions(context.getPermissions());
		return authorizationInfo;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken token) throws AuthenticationException {
		SimpleAuthenticationInfo authenticationInfo = null;
		UserPwdSiteToken ctoken = (UserPwdSiteToken) token;
		String username = (String) ctoken.getPrincipal();
		Long sid = ctoken.getSite();
		
		try {
			User user = buyerAPI.findByAccount(sid, username);
			if (user == null) {
				throw new UnknownAccountException();// 没找到帐号
			}
			if (Boolean.TRUE.equals(user.getLocked())) {
				throw new LockedAccountException(); // 帐号锁定
			}
			
			Subject subject = SecurityUtils.getSubject();
			subject.getSession().setAttribute("siteId", sid);
			subject.getSession().setAttribute("userId", user.getUserId());
			
			// 交给AuthenticatingRealm使用CredentialsMatcher进行密码匹配，如果觉得人家的不好可以自定义实现
			authenticationInfo = new SimpleAuthenticationInfo(
					user.getAccount(), 			// 用户名
					user.getPassword(), 		// 密码
					ByteSource.Util.bytes(user.getAccount()+user.getSalt()),// salt=username+salt
					getName() 					// realm name
			);
		} catch (ApiException e) {
			e.printStackTrace();
		}

		return authenticationInfo;
	}
}
