<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>管理员登录窗口</h1>
	<form action = "${pageContext.request.contextPath}/Admin/checkLogin.do">
		用户名：<input type = "text" name = "adminName">
		密码：<input type = "password" name = "password">
		<input type = "submit" value = "登陆">                            
	</form>
				
	<!-- window.location.href(可以通过?参数名=参数值传参，可以使用刀乐{}获取本页面的非js代码的变量值)可以与button并用跳转传参 -->

			
</body>
</html>
