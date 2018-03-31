<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>首页</title>
		<meta charset="utf-8" />
		<link rel="stylesheet" type="text/css" href="static/css/style2.css" />
		<link rel="stylesheet" type="text/css" href="static/css/index.css" />
		<script type="text/javascript" src="static/js/jquery-1.11.1.min.js"></script>
		<script type="text/javascript">
	    function checkna(){
			na=form1.yourname.value;
		  	if( na.length <1 || na.length >12)
	  		{  	
	  			divname.innerHTML='<font class="tips_false">长度是1~12个字符</font>';
	  		     
	  		}else{  
	  		    divname.innerHTML='<font class="tips_true">输入正确</font>';
	  		   
	  		}  
	  	
	  }
	  //验证密码 
		function checkpsd1(){    
			psd1=form1.yourpass.value;  
			var flagZM=false ;
			var flagSZ=false ; 
			var flagQT=false ;
			if(psd1.length<6 || psd1.length>12){   
				divpassword1.innerHTML='<font class="tips_false">长度错误</font>';
			}else
				{   
				  for(i=0;i < psd1.length;i++)   
					{    
						if((psd1.charAt(i) >= 'A' && psd1.charAt(i)<='Z') || (psd1.charAt(i)>='a' && psd1.charAt(i)<='z')) 
						{   
							flagZM=true;
						}
						else if(psd1.charAt(i)>='0' && psd1.charAt(i)<='9')    
						{ 
							flagSZ=true;
						}else    
						{ 
							flagQT=true;
						}   
					}   
					if(!flagZM||!flagSZ||flagQT){
					divpassword1.innerHTML='<font class="tips_false">密码必须是字母数字的组合</font>'; 
					 
					}else{
						
					divpassword1.innerHTML='<font class="tips_true">输入正确</font>';
					 
					}  
				 
				}	
		}
		//验证确认密码 
		function checkpsd2(){ 
				if(form1.yourpass.value!=form1.yourpass2.value) { 
				     divpassword2.innerHTML='<font class="tips_false">您两次输入的密码不一样</font>';
				} else { 
				     divpassword2.innerHTML='<font class="tips_true">输入正确</font>';
				}
		}

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
        ////////////////身份证
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
        document.getElementById("div2").innerHTML = "";
        }

        //手机验证
        $(function  () {
	//获取短信验证码
	var validCode=true;
	$(".msgs").click (function  () {
		var time=30;
		var code=$(this);
		if (validCode) {
			validCode=false;
			code.addClass("msgs1");
		var t=setInterval(function  () {
			time--;
			code.html(time+"秒");
			if (time==0) {
				clearInterval(t);
			code.html("重新获取");
				validCode=true;
			code.removeClass("msgs1");

			}
		},1000)
		}
	})
})
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
			<h1 id="reh1">欢迎注册</h1>
			<div class="contact" >
		<form name="form1" method="post" action = "User/saveUser.do">
			<ul>
				<li>
					<label>用户名：</label>
					<input type="text" name="yourusername" placeholder="请输入用户名"  onblur="checkna()" required/><span class="tips" id="divname">长度1~12个字符</span>
				</li>
				<li>
					<label>密码：</label>
					<input type="password" name="yourpass" placeholder="请输入你的密码" onBlur="checkpsd1()" required/><span class="tips" id="divpassword1">密码必须由字母和数字组成</span>
				</li>
				<li>
					<label>确认密码：</label>
					<input type="password" name="yourpass2" placeholder="请再次输入你的密码" onBlur="checkpsd2()" required/><span class="tips" id="divpassword2">两次密码需要相同</span>
				</li>
				<li>
					<label>姓名：</label>
					<input type="text" name="yourname" placeholder="请输入你的真实姓名" " required/><span class="tips" ></span>
				</li>
				<li>
					<label>身份证号：</label>
					<input type="text"  placeholder="请输入你的身份证号" " required/><span class="tips" ></span>
				</li>
				
				<li>
					<label>支付宝账号：</label>
					<input type="text" name="youralipayId" placeholder="请输入你的账号" onBlur="checkmail()" required/><span class="tips" ></span>
				</li>
				<li>
					<label>支付宝真实姓名：</label>
					<input type="text" name="youralipayName" placeholder="请输入你的姓名" onBlur="checkmail()" required/><span class="tips" ></span>
				</li>
				<li>
					<label>个人简历:</label>
					<br>
					<textarea rows="10" cols="79" name = "personalIntroduction"></textarea>
				</li>
				<li>
					<label>个人证书:</label>
					<br/>
					<div id='div1'>
						<!-- <input id='input1' type="file" onchange="imgPreview(this)"> -->
						<img  src="pic/shangchuan.png">
        			</div>

					<img id="preview" />
					<input type="file" name="file" onchange="imgPreview(this)" />
        			
				</li>
				<li>
					<label>手持身份证正面照</label>
					<br/>
					<br/>
					<div class="div2">
						<div class='div2_left'>
						<!-- <input id='input1' type="file" onchange="imgPreview(this)"> -->
							<img  src="pic/shangchuan.png">
							<img id="preview" />
							<input type="file" name="file" onchange="imgPreview1(this)" />
        				</div>

						

						<div class="div2_right">
							<img src="pic/timg.jpg">
							<input style="width:200px" type="text" value="                       示 例">
						</div>
						<div class="clear"></div>
					</div>	
				</li>
				<li>
					<label>电话号：</label>
					<input type="text" name="yourphoneNumber" placeholder="请输入你的联系方式" onBlur="checkmail()" required/><span class="tips" ></span>
				</li>
				<li>
					<label id="phonela" style="float:left;">验&nbsp;&nbsp;证&nbsp;码</label>
					<input type="text" class="c_code_msg" style="margin-right: 10px;">
					<span class="msgs">获取短信验证码</span>
	
				</li>
			    <li>
			    	<br/><br/><br/><br/><br/><br/><br/><br/>
					<b class="btn"><input type="submit" value="立即注册"/>
				</li>
			</ul>
		</form>
	</div>
	<div style="text-align:center;">
			
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