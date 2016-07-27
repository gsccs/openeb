package com.gsccs.b2c.plat.buyer.service;

import java.util.List;

import com.gsccs.b2c.plat.buyer.model.BuyerAccount;
import com.gsccs.b2c.plat.shop.model.BuyerLevelT;
import com.gsccs.eb.api.domain.buyer.Points;

/**
 * 
 * @author x.d zhang
 * 
 */
public interface BuyerService {

	public Long addBuyer(Long sid, BuyerAccount account);

	public BuyerAccount loginAccount(Long sid, String account, String pwd);

	public BuyerAccount getBuyerAccount(Long uid, Long sid);

	public List<BuyerAccount> getAllAcountBySid(Long sid);

	public BuyerAccount getBuyerAccount(Long sid, String account);

	public List<BuyerLevelT> findBuyerLevels(Long sid);

	// 添加会员积分
	public void insert(Long sid, Points record);

	// 查询会员积分列表
	public List<Points> getBuyerScores(Long sid, Points record,
			int page, int rows);

	public int getBuyerScore(Long sid, Long userid);

}
