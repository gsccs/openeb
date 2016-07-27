<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>系统用户表单</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/easyui/themes/icon.css">
</head>

<body>
	<form id="user_form" action="" method="post">
	
		<input type="hidden" name="id" value="${userInfo.id }">
		<c:if test="${opt=='update' }">
			<input type="hidden" name="password" value="${userInfo.password }">
		</c:if>
			
		<table cellspacing="0" cellpadding="0">
			<tr class="thclass" style="height: 40px">
					<th style="width: 130px;">用户名称<font style="color: red">*</font></th>
					<td><input type="text" name="title" class="easyui-validatebox"
						required="true" missingMessage="不能为空"
						value="${userInfo.title}" />
					</td>
			</tr>
			
			<tr class="thclass" style="height: 40px">
					<th style="width: 130px;">登录帐号<font style="color: red">*</font></th>
					<td><input type="text" name="username" class="easyui-validatebox"
						required="true" missingMessage="不能为空"
						value="${userInfo.username}" />
					</td>
			</tr>
			
			<c:if test="${opt=='create' }">
			<tr class="thclass" style="height: 40px">
					<th style="width: 130px;">登录密码<font style="color: red">*</font></th>
					<td><input type="text" name="password" class="easyui-validatebox"
						required="true" missingMessage="不能为空"
						value="${userInfo.password}" />
					</td>
			</tr>
			</c:if>
			
			
			
			<tr class="thclass" style="height: 40px">
				<th style="width: 130px;">所在部门<font style="color: red">*</font></th>
				<td>
					<input type="text" id="edit_orgId" name="orgid">		
				</td>
			</tr>
			
			<tr class="thclass" style="height: 40px">
				<th style="width: 130px;">帐号状态</th>
				<td>
				<select name="state">
					<option value="1" <c:if test="${userInfo.locked }"> selected="selected"</c:if>>启用</option>
					<option value="0" <c:if test="${userInfo.locked }"> selected="selected"</c:if>>禁用</option>
				</select>		
				</td>
			</tr>
			
			<tr class="thclass" style="height: 40px">
				<th style="width: 130px;">备注说明</th>
				<td><textarea rows="" cols="" name="remark"></textarea>  </td>
				</td>
			</tr>
			
		</table>
	</form>
<script type="text/javascript">
var basepath="${pageContext.request.contextPath}";
$('#edit_orgId').combotree({
    url: basepath+'/org/treegrid',
    required: true
});
</script>
</body>
</html>
