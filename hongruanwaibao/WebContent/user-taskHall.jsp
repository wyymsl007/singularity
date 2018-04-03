<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
		<title>任务列表</title>
		<meta charset="utf-8" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/css/style.css" />
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
						<li><a href="content.html">任务大厅</a></li>
						<li><a href="list.html">任务流程介绍</a></li>
					</ul>
				</div>
				
			</div>
			<!--大图-->
			<div id="task_list">
				<div class= "type1">
					<br>
					&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
					<span>任务类型：</span>
					&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
					<a href="#">图片</a>
					&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
					<a href="#">声音</a>
				</div>
				<div class="price">
					<br>
					&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
					<span>价格：</span>
					&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
					<a href="#">500以下</a>
					&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
					<a href="#">500-1000</a>
					&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
					<a href="#">1000-1500</a>
					&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
					<a href="#">1500-2000</a>
					&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
					<a href="#">2000以上</a>
				</div>
					
				<div class="number">
					<br>
					&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
					<span>任务量：</span>
					&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
					<a href="#">1000以下</a>
					&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
					<a href="#">1000-1500</a>
					&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
					<a href="#">1500-2000</a>
					&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
					<a href="#">2000以上</a>
				</div>
					
				<div class="finTime">
					<br>
					&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
					<span>任务完成时间：</span>
					&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
					<a href="#">3天以下</a>
					&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
					<a href="#">3-5天</a>
					&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
					<a href="#">5天以上</a>
				</div>
					
				<div class="situation">
					<br>
					&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
					<span>任务情况：</span>
					&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
					<a href="#">招标中</a>
					&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
					<a href="#">已选中</a>
					&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
					<a href="#">已托管</a>
					&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
					<a href="#">已完成</a>
					&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
					<a href="#">已结束</a>
				</div>
			</div>
			<div id="reseacher">
				&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<h2>搜索结果          </h2>
			</div>
			<table>
				<tr>
					<td>任务ID</td>
					<td>任务名称</td>
					<td>任务状态</td>
					<td>任务发布者</td>
					<td>任务开始时间</td>
					<td>任务结束时间</td>
					<td>任务酬劳</td>
					<td>任务介绍</td>
				</tr>
				<c:forEach var = "i" varStatus = "v"  items = "${allTasksList }"  begin = "0" end = "${allTasksList.size()-1 }">
					<tr>
						<td>${i.taskId }</td>
						<td>${i.taskName }</td>
						<td>${i.taskCondition }</td>
						<td>${i.taskAdmin }</td>
						<td>${i.taskStartTime }</td>
						<td>${i.taskEndTime }</td>
						<td>${i.taskPay }元</td>
						<td>${i.taskIntroduce }</td>
						<td><font size = "50px"><a href = "${pageContext.request.contextPath }/Task/getTaskDetial.do?taskId=${i.taskId }&taskName=${i.taskName }&taskCondition=${i.taskCondition}&taskAdmin=${i.taskAdmin }&taskStartTime=${i.taskStartTime }&taskEndTime=${i.taskEndTime }&taskPay=${i.taskPay }&taskIntroduce=${i.taskIntroduce }">查看详情</a></font></td>
					</tr>
				</c:forEach>
			</table>
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