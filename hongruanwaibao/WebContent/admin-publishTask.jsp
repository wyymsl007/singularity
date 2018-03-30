<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html class="no-js">
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>虹软后台管理系统</title>
  <meta name="description" content="这是一个 index 页面">
  <meta name="keywords" content="index">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
  <meta name="renderer" content="webkit">
  <meta http-equiv="Cache-Control" content="no-siteapp" />
  <link rel="icon" type="image/png" href="${pageContext.request.contextPath}/static/css/assets/i/favicon.png">
  <link rel="apple-touch-icon-precomposed" href="${pageContext.request.contextPath}/static/css/assets/i/app-icon72x72@2x.png">
  <meta name="apple-mobile-web-app-title" content="Amaze UI" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/assets/css/ui.min.css"/>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/assets/css/admin.css" />
</head>
<body>
<header class="am-topbar admin-header">
  <div class="am-topbar-brand">
    <strong>虹软后台管理</strong> <small></small>
  </div>

  <button class="am-topbar-btn am-topbar-toggle am-btn am-btn-sm am-btn-success am-show-sm-only" data-am-collapse="{target: '#topbar-collapse'}"><span class="am-sr-only">导航切换</span> <span class="am-icon-bars"></span></button>

  <div class="am-collapse am-topbar-collapse" id="topbar-collapse">

    <ul class="am-nav am-nav-pills am-topbar-nav am-topbar-right admin-header-list">
      <li><a href="javascript:;"><span class="am-icon-envelope-o"></span> 收件箱 <span class="am-badge am-badge-warning">5</span></a></li>
      <li class="am-dropdown" data-am-dropdown>
        <a class="am-dropdown-toggle" data-am-dropdown-toggle href="javascript:;">
          <span class="am-icon-users"></span> 管理员 <span class="am-icon-caret-down"></span>
        </a>
        <ul class="am-dropdown-content">
          <li><a href="admin-index1.html"><span class="am-icon-user"></span> 资料</a></li>
          <li><a href="admin-index1.html"><span class="am-icon-cog"></span> 设置</a></li>
          <li><a href="admin-index1.html"><span class="am-icon-power-off"></span> 退出</a></li>
        </ul>
      </li>
    </ul>
  </div>
</header>

<div class="am-cf admin-main">
  <!-- sidebar start -->
  <div class="admin-sidebar">
    <ul class="am-list admin-sidebar-list">
       <li><a href="${pageContext.request.contextPath}/admin-index.jsp"><span class="am-icon-home"></span> 首页</a></li>
      <li class="admin-parent">
        <a class="am-cf" data-am-collapse="{target: '#collapse-nav'}"><span class="am-icon-file"></span> 任务管理 <span class="am-icon-angle-right am-fr am-margin-right"></span></a>
        <ul class="am-list am-collapse admin-sidebar-sub am-in" id="collapse-nav">
          <li><a href="${pageContext.request.contextPath}/admin-publishTask.jsp" class="am-cf"><span class="am-icon-check"></span> 发布任务<span class="am-icon-star am-fr am-margin-right admin-icon-yellow"></span></a></li>
          <li><a href="${pageContext.request.contextPath}/admin-searchTask.jsp"><span class="am-icon-puzzle-piece"></span> 查找任务</a></li>
        </ul>
      </li>
      <li><a href="###########"><span class="am-icon-table"></span>用户管理</a></li>
      <li class="admin-parent">
        <a class="am-cf" data-am-collapse="{target: '#collapse-nav'}"><span class="am-icon-file"></span> 审核通知 <span class="am-icon-angle-right am-fr am-margin-right"></span></a>
        <ul class="am-list am-collapse admin-sidebar-sub am-in" id="collapse-nav">
         <li><a href="${pageContext.request.contextPath}/User/showNewUsers.do" class="am-cf"><span class="am-icon-check"></span> 新用户审核<span class="am-icon-star am-fr am-margin-right admin-icon-yellow"></span></a></li>
          <li><a href="${pageContext.request.contextPath}/admin-bit.jsp"><span class="am-icon-puzzle-piece"></span> 竞标审核</a></li>
          <li><a href="${pageContext.request.contextPath}/admin-taskResult.jsp"><span class="am-icon-bug"></span> 任务结果审核</a></li>
        </ul>
      </li>
    </ul>

    <div class="am-panel am-panel-default admin-sidebar-panel">
      <div class="am-panel-bd">
        <p><span class="am-icon-bookmark"></span> 公告</p>
        <p>XXXXXXXXXXXXXXXXXXXXXXX    —— ArcSoft </p>
      </div>
    </div>

    <div class="am-panel am-panel-default admin-sidebar-panel">
      <div class="am-panel-bd">
        <p><span class="am-icon-tag"></span> wiki</p>
        <p>Welcome to the ArcSoft wiki!</p>
      </div>
    </div>
  </div>
  <!-- sidebar end -->

  <!-- content start -->
  <div class="admin-content">
    <div class="am-cf am-padding">
      <div class="am-fl am-cf"><strong class="am-text-primary am-text-lg">发布任务</strong> / <small>Release task</small></div>
    </div>

    <hr/>

    <div class="am-g">

      <div class="am-u-sm-12 am-u-md-4 am-u-md-push-8">
        
        <div class="am-panel am-panel-default">
          <div class="am-panel-bd">
            <div class="user-info">
              <p>等级信息</p>
              <div class="am-progress am-progress-sm">
                <div class="am-progress-bar" style="width: 60%"></div>
              </div>
              <p class="user-info-order">当前等级：<strong>LV8</strong> 活跃天数：<strong>587</strong> 距离下一级别：<strong>160</strong></p>
            </div>
            <div class="user-info">
              <p>信用信息</p>
              <div class="am-progress am-progress-sm">
                <div class="am-progress-bar am-progress-bar-success" style="width: 80%"></div>
              </div>
              <p class="user-info-order">信用等级：正常当前 信用积分：<strong>80</strong></p>
            </div>
          </div>
        </div>

      </div>

      <div class="am-u-sm-12 am-u-md-8 am-u-md-pull-4">
        <form class="am-form am-form-horizontal" method = "post" action = "${pageContext.request.contextPath }/Admin/publishTask.do">
          <div class="am-form-group">
            <label for="user-name" class="am-u-sm-3 am-form-label">任务类型/ Task </label>
            <div class="am-u-sm-9">
              <select name="class">
                <option value="one" selected="selected"> 网页设计
                </option>
                <option value="two"> app设计</option>
                <option value="three"> 广告设计</option>
                <option value="four"> 海报设计</option>
                <option value="four"> 平面手绘</option>
                <option value="four"> 软件界面设计</option>
                </select>
              <small>请选择您的任务类型</small>
            </div>
          </div>

          <div class="am-form-group">
            <label for="user-email" class="am-u-sm-3 am-form-label" >佣金设置/ Commission</label>
            <div class="am-u-sm-9">
              <input type="text" name = "money" id="user-email" placeholder="输入您的佣金 / Commission">
              <small>您希望的价格...</small>
            </div>
          </div>

          <div class="am-form-group">
            <label for="user-phone" class="am-u-sm-3 am-form-label">发布时间/Release time</label>
            <div class="am-u-sm-9">
              <input name = "taskStartTime" type="text" id="user-QQ" placeholder="输入你的开始时间">
            </div>
          </div>

          <div class="am-form-group">
            <label for="user-QQ" class="am-u-sm-3 am-form-label">截止时间/End time</label>
            <div class="am-u-sm-9">
              <input name = "taskEndTime" type="text" id="user-QQ" placeholder="输入你的截止时间">
            </div>
          </div>

          <div class="am-form-group">
            <label for="user-weibo" class="am-u-sm-3 am-form-label">发布者/ Promulgator
</label>
            <div class="am-u-sm-9">
              <input name = "taskAdmin" type="text" id="user-weibo" placeholder="输入你的名字 / Promulgator">
            </div>
          </div>

          <div class="am-form-group">
            <label for="user-intro" class="am-u-sm-3 am-form-label">任务内容 / Intro</label>
            <div class="am-u-sm-9">
              <textarea  name = "taskIntroduce" class="" rows="5" id="user-intro" placeholder="输入你的任务内容"></textarea>
              <small>请保证在250字以内哦</small>
            </div>
          </div>

          <div class="am-form-group">
            <div class="am-u-sm-9 am-u-sm-push-3">

              <input type="file" name="files"/><br/>

              <input  type="submit" class="am-btn am-btn-primary" value = "确定提交"  />
            </div>
          </div>
        </form>
      </div>
    </div>
  </div>
  <!-- content end -->
</div>

<footer>
  <hr>
  <p class="am-padding-left">© 2000 ArcSoft................</p>
</footer>
<script src="assets/js/jquery.min.js"></script>
<script src="assets/js/amazeui.min.js"></script>
<!--<![endif]-->
<script src="assets/js/app.js"></script>
</body>
</html>
