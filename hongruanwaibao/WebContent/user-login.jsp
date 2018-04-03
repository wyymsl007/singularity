<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<title>登录</title>
		<meta charset="utf-8" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/css/style.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/css/login.css" />
	</head>
	<body>
	<div id="mybody">
		<!--网页头部-->
		<div id="header">
			<!--logo-->
			<div id="banner">
			    <div class="re">客服热线：010-1111111</div>
				<div class="deng"><a href="#">个人中心</a>&nbsp;<a href="#">注册</a>&nbsp;<a href="login.html">登录</a></div>
			</div>
			<!--导航栏和搜索栏-->
			<div id="nav">
				<!--导航栏-->
				<div class="content">
					<ul>
						<li><a href="index.html">首页</a></li>
						<li><a href="#">任务大厅</a></li>
						<li><a href="#">任务流程介绍</a></li>
					</ul>
				</div>
				
			</div>
		</div>
		<!--网页主体部分-->
		<div id="login">
		    <div id="login_left">
		        <ul>
		            <li><img src="${pageContext.request.contextPath }/static/images/header_img.jpg"></li>
		        </ul>    
		    </div>
		    <div id="login_right">
		    <form action = "${pageContext.request.contextPath }/User/checkLogin.do">
		        <ul class="line">
		            <li>&nbsp;</li>
		            <li>用户名：&nbsp;<input type="text" style="width:200px;height:30px" value="请输入"  name = "userName"/></li>
		            <li>密&nbsp;码：&nbsp;<input type="text" style="width:200px;height:30px" value="请输入" name = "password"/></li>
		            <li><img src="${pageContext.request.contextPath }/static/images/yzm.jpg">&nbsp;&nbsp;<input type="text" value="请输入验证码" style="width:200px;height:30px" /></li>
		            <li><input type="submit" style="width:300px;height:30px" name="submit" value="提交" />
		            </li>
		        </ul>
		    </form>   
		    </div>

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
	</div>
	</body>
</html>