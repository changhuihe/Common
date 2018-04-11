<%@page pageEncoding="utf-8" contentType="text/html;charset=utf-8"%>
<%@include file="/WEB-INF/jsp/include/taglib.jsp"%>
<%@include file="/WEB-INF/jsp/include/head.jsp"%>
<html>
<head>
<meta charset="UTF-8">
<title>登录</title>
<link rel="stylesheet" href="${path}/static/css/loginCss/login.css">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/js/loginJs/login.js"></script>
</head>
<body>
	<div class="login_box">
		<h3>Personal space</h3>
		<form action="${path}/login" method="post" autocomplete="off">
			<div class="input_outer user_input">
				<span class="user_ico"></span> <input name="username"
					id="nameOremail" class="text" placeholder="输入用户名或邮箱登录" type="text" />
			</div>
			<div class="input_outer password_input">
				<span class="password_ico"></span> <input name="password"
					id="password" class="text password_text" placeholder="输入密码"
					type="password" />
			</div>
			<div class="remember_forget">
				<input id="check-box" class="checkbox" type="checkbox" value="0"
					name="rememberMe" /><span>记住我</span> <a href="#"
					class="login-fgetpwd">忘记密码？</a>
			</div>
			<div class="login_register">
				<input type="submit"
					class="layui-btn layui-btn-radius layui-btn-normal" id="loginBtn"
					value="登录"
					style="height: 10.1%; width: 40%; margin-top: 8%; margin-left: 4%; font-size: 20px" />
				<input type="button" class="layui-btn layui-btn-radius"
					id="registerBtn" value="注册" onclick="registerOnclick()"
					style="height: 10.1%; width: 40%; margin-top: 8%; margin-left: 11%; font-size: 20px" />
			</div>
		</form>
	</div>
	<div class="register_box">
		<h3>注&nbsp;&nbsp;册</h3>
		<div class="input_outer user_input2">
			<span class="user_ico"></span> <input path="name" name="logname"
				id="logname" class="text" placeholder='输入用户名(3-20位)' maxlength="20"
				type="text" onkeyup="maxCheck()" onchange="minCheck()"
				autocomplete="off" />
		</div>
		<div class="input_outer email_input">
			<span class="email_ico"></span> <input path="email" name="logemail"
				id="logemail" class="text" placeholder="输入邮箱" type="text"
				autocomplete="off" />
		</div>
		<div class="input_outer password_input2">
			<span class="password_ico"></span> <input name="logpass" id="logpass"
				class="text password_text" placeholder="输入密码(6-12位字母或数字)"
				onkeyup="maxCheck()" onchange="minCheck()" maxlength="12"
				type="password" autocomplete="off" />
		</div>
		<div class="input_outer password_input">
			<span class="password_ico"></span> <input name="logpass"
				id="logpass2" class="text password_text"
				placeholder="确认密码(6-12位字母或数字)" maxlength="12" type="password"
				onkeyup="maxCheck()" onchange="minCheck()" autocomplete="off" />
		</div>
		<div class="login_register">
			<input type="button" id="registerConfirm"
				class="layui-btn layui-btn-radius layui-btn-normal" value="确定"
				onclick="confirmOnclick()"
				style="height: 10.1%; width: 40%; margin-top: 8%; margin-left: 4%; font-size: 20px" />
			<input type="button" id="registerBack"
				class="layui-btn layui-btn-radius" value="返回"
				onclick="backOnclick()"
				style="height: 10.1%; width: 40%; margin-top: 8%; margin-left: 11%; font-size: 20px" />
		</div>
	</div>
</body>
</html>