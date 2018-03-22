<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<body>
		<ul>
			<li>用户ID：${user.userId} </li>
			<li>用户名：${user.userName }</li>
			<li>密码：${user.password }</li>
			<li>姓名：${user.name }</li>
			<li>支付宝账号：${user.alipayId }</li>
			<li>支付宝真实姓名：${user.alipayName }</li>
			<li>个人简历：${user.personalIntroduction }</li>
			<li>电话号：${user.phoneNumber }</li>
			
		</ul>
		<button  height = "1000px" width = "1000px" onclick = "succeed()" id = "succeed">审核通过</button>
		<button  height = "1000px" width = "1000px" onclick = "fail()">审核不通过</button>
</body>
<script type="text/javascript">
	//window.location.href(可以通过?参数名=参数值传参，可以使用刀乐{}获取本页面的非js代码的变量值)可以与button并用跳转传参
	function succeed(){
		window.location.href = "${pageContext.request.contextPath}/User/userSureRegist.do?userId=${user.userId}"
		
	}
</script>
</html>