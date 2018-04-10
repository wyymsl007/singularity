<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<script type = "text/javascript">
		alert("注册成功！");
		document.write('管理员将在3天内对您的注册进行审核，届时会以短信形式通知您，请保持手机畅通！');
		window.setTimeout("window.location.href = '${pageContext.request.contextPath}/user-index.jsp'",5000); 
	</script>
	
	
</body>
</html>