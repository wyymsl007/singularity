<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<title>首页</title>
		<meta charset="utf-8" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/css/style2.css" />
		<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery-1.11.1.min.js"></script>
		<script type="text/javascript">
			// 获取图片
		// 
		 function imgPreview(fileDom){
        //判断是否支持FileReader
        if (window.FileReader) {
            var reader = new FileReader();
        } else {
            alert("您的设备不支持图片预览功能，如需该功能请升级您的设备！");
        }

        //获取文件
        var file = fileDom.files[0];
        var imageType = /^image\//;
        //是否是图片
        if (!imageType.test(file.type)) {
            alert("请选择图片！");
            return;
        }
        //读取完成
 		
        reader.onload = function(e) {
            //获取图片dom
            var img = document.getElementById("preview");
            //图片路径设置为读取的图片
            img.src = e.target.result;
        };
        reader.readAsDataURL(file);
        document.getElementById("div1").innerHTML = "";
        }
		</script>
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
			<div class="top">
				<h1>个人中心</h1>
			</div>
			<div class="down">
				<div class="down_left">
					<div class="down_left1">
						<br><br><br><br>
						<h1 class="title">我承接的任务</h1>
					</div>
					<div class="down_left2">
						<br><br><br><br>
						<h1 class="title">我收藏的任务</h1>
					</div>
					<div class="down_left3">
						<br><br><br><br>
						<h1 class="title">消息中心</h1>
					</div>
				</div>
				<div class="down_right">
					<div class="head">
						<div class="head1">
							<br><br><br>
							<img  src="${pageContext.request.contextPath }/static/image/shangchuan.png">
							<img id="preview" />
							<input type="file" name="file"  value="修改头像" onchange="imgPreview(this)"  />
						</div>
					</div>
					<div class="idmess">
						<br>
						姓名： <br><br>
						手机号： <br><br>
						邮箱： <br><br>
						注册时间： <br>
					</div>
					<div class="hgrd">
						<br>
						&nbsp&nbsp&nbsp<img src="${pageContext.request.contextPath }/static/image/hgrad.jpg">
						<br>
						&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
						中标任务数： <br><br>
						&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
						完成任务数：<br><br>
						&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
						好评率：
					</div>
				</div>
			</div>
			
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