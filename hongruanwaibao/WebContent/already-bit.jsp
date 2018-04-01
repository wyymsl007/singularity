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
		alert("您已参加竞标，不可重复参加！");
		window.location.href = "${pageContext.request.contextPath}/user-taskHall.jsp";
	</script>
</body>
</html>