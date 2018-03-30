<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>首页</title>
		<meta charset="utf-8" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/css/style.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/css/index.css" />
	</head>
	<body>
	<div id="mybody">
		<!--网页头部-->
		<div id="header">
			<!--logo-->
			<div id="banner">
			    <div class="re">客服热线：010-1111111</div>
				<div class="deng"><a href="#">个人中心</a>&nbsp;<a href="#">注册</a>&nbsp;<a href="#">登录</a></div>
			</div>
			<!--导航栏和搜索栏-->
			<div id="nav">
				<!--导航栏-->
				<div class="content">
					<ul>
						<li><a href="index.html">首页</a></li>
						<li><a href="${pageContext.request.contextPath }/user-taskHall.jsp">任务大厅</a></li>
						<li><a href="list.html">任务流程介绍</a></li>
					</ul>
				</div>
				
			</div>
			<!--大图-->
			
		</div>
		<!--网页主体部分-->
	<div id="content">
		    
	</div>
		<!--网页尾部-->
	<div id="footer">
		<div class="f1">
			   <div class="hezi">
			    	<a href="#">关于我们</a>
			    	<a href="#">意见反馈</a>
			    	<a href="#">广告及服务</a>
			    	<a href="#">友情链接</a>
			    	<a href="#">网站地图</a>
			    </div>	
		</div>
		<div class="f2">
				联系电话：86-571-88210600&nbsp;传真：86-571-88210350
		</div>
	</div>

	
	
	</body>
</html>