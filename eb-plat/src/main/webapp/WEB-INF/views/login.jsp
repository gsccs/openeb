﻿<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>欢迎登录电商管理系统</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/style.css" />
<script language="JavaScript" src="${pageContext.request.contextPath}/static/js/jquery.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/cloud.js"></script>

<script language="javascript">
	$(function(){
    $('.loginbox').css({'position':'absolute','left':($(window).width()-692)/2});
	$(window).resize(function(){  
    $('.loginbox').css({'position':'absolute','left':($(window).width()-692)/2});
    })  
});  
</script>

</head>

<body
	style="background-color: #1c77ac; background-image: url(../images/light.png); background-repeat: no-repeat; background-position: center top; overflow: hidden;">

	<div id="mainBody">
		<div id="cloud1" class="cloud"></div>
		<div id="cloud2" class="cloud"></div>
	</div>


	<div class="logintop">
		<span>欢迎登录后台管理界面平台</span>
		<ul>
			<li><a href="#">回首页</a></li>
			<li><a href="#">帮助</a></li>
			<li><a href="#">关于</a></li>
		</ul>
	</div>

	<div class="loginbody">

		<span class="systemlogo"></span>

		<div class="loginbox">
			<form action="${pageContext.request.contextPath}/login" method="post">
			<ul>
				<li class="logoerror">${error}</li>
				<li><input name="username" type="text" class="loginuser" value="admin"
					onclick="JavaScript:this.value=''" /></li>
				<li><input name="password" type="text" class="loginpwd" value="123456"
					onclick="JavaScript:this.value=''" /></li>
				<li><input name="" type="submit" class="loginbtn" value="登录"
					/><label>
					<input name="rememberMe" type="checkbox" value="" checked="checked" />记住密码</label><label><a
						href="#">忘记密码？</a></label>
				</li>
			</ul>
			</form>


		</div>

	</div>



	<div class="loginbm">
		版权所有 2015 <a href="#">甘肃中通申信科技有限公司</a>
	</div>


</body>

</html>
