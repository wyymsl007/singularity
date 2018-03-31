<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
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
				<div class="deng"><a href="${pageContext.request.contextPath }/user-self_center.jsp">个人中心</a>&nbsp;<a href="${pageContext.request.contextPath }/regist.jsp">注册</a>&nbsp;
				<c:if test = "${empty userName }">
					<a href="${pageContext.request.contextPath }/user-login.jsp">登录</a></div>
				</c:if>
				<c:if test = "${!empty userName }">
					欢迎您，${userName }
				</c:if>
			</div>
			<!--导航栏和搜索栏-->
			<div id="nav">
				<!--导航栏-->
				<div class="content">
					<ul>
						<li><a href="${pageContext.request.contextPath }/user-index.jsp">首页</a></li>
						<li><a href="${pageContext.request.contextPath }/Task/getTaskHallAllTasksList.do">任务大厅</a></li>
						<li><a href="#">任务流程介绍</a></li>
					</ul>
				</div>
				
			</div>
			<!--大图-->
			<div id="picshou">
				<img src="${pageContext.request.contextPath }/static/images/bigpicc.jpg" />
			</div>
		</div>
		<!--网页主体部分-->
		<div id="content">
		    <div id="content_left">
		        <!--公司简介-->
		    	<div class="read">
		    	    <div class="tit">
		    	    	<img class="star" src="${pageContext.request.contextPath }/static/images/star.png"/>
		    	        <span class="title">公司简介</span>
		    		    <span class="more"><a href="#">更多&gt;</a></span>
		    	    </div>
		    		<div class="content">
		    			<ul>
		    				<li>
		    				    <div class="pic"></div>
		    				    <div class="ttt">&nbsp;&nbsp;虹软（杭州）科技有限公司位于浙江省杭州市西湖区西斗门路三号天堂软件园23层,交通便利，我们属于外资企业，改革开放以来，我们企业经营一直稳中有进，主要从事：计算机应用软件开发，如有上门参观合作，请与本公司相关部门事先联系。其它关于虹软（杭州）科技有限公司的详细介绍，请进入我公司网站了解最新动态。</div>
		    				</li>
		    			</ul>
		    			
		    		</div>
		    	</div>
		    	
		    </div>
		    <!--精彩图集-->
		    <div id="content_2_tu">
		    	<div class="tit">
		    	    <img class="star" src="${pageContext.request.contextPath }/static/images/star.png"/>
		    	    <span class="title">虹软精彩图集</span>
		    		<span class="more"><a href="#">更多&gt;</a></span>
		    	</div>
		    	<div class="hang">
		    		<div class="ppp1"><img src="${pageContext.request.contextPath }/static/images/4.jpg"/></div>
		    		<img src="${pageContext.request.contextPath }/static/images/2.jpg"/>
		    		<img src="${pageContext.request.contextPath }/static/images/3.jpg"/>
		    		<img src="${pageContext.request.contextPath }/static/images/1.jpg"/>
		    	</div>
		    	<div class="hang">
		    		<div class="ppp1"><img src="${pageContext.request.contextPath }/static/images/6.jpg"/></div>
		    		<img src="${pageContext.request.contextPath }/static/images/7.jpg"/>
		    		<img src="${pageContext.request.contextPath }/static/images/11.jpg"/>
		    		<img src="${pageContext.request.contextPath }/static/images/10.jpg"/>
		    	</div>
		    	<div class="hang">
		    		<div class="ppp1"><img src="${pageContext.request.contextPath }/static/images/5.jpg"/></div>
		    		<img src="${pageContext.request.contextPath }/static/images/12.jpg"/>
		    		<img src="${pageContext.request.contextPath }/static/images/8.jpg"/>
		    		<img src="${pageContext.request.contextPath }/static/images/9.jpg"/>
		    	</div>
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