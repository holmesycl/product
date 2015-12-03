<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/common.jsp"%>
<html lang="zh-CN" ng-app>
  <head>
    <meta charset="utf-8">
    <title>主页</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!-- Loading Bootstrap -->
    <link href="${contextPath }/static/Flat-UI/css/vendor/bootstrap.min.css" rel="stylesheet">

    <!-- Loading Flat UI -->
    <link href="${contextPath }/static/Flat-UI/css/flat-ui.min.css" rel="stylesheet">

    <link rel="shortcut icon" href="${contextPath }/static/Flat-UI/img/favicon.ico">

    <!-- HTML5 shim, for IE6-8 support of HTML5 elements. All other JS at the end of file. -->
    <!--[if lt IE 9]>
      <script src="${contextPath }/static/Flat-UI/js/vendor/html5shiv.js"></script>
      <script src="${contextPath }/static/Flat-UI/js/vendor/respond.min.js"></script>
    <![endif]-->
  </head>
  <body>
   	
   	<!-- 导航 -->
   	<nav class="navbar navbar-inverse">
	  <div class="container-fluid">
	    <!-- Brand and toggle get grouped for better mobile display -->
	    <div class="navbar-header">
	      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
	        <span class="sr-only">Toggle navigation</span>
	        <span class="icon-bar"></span>
	        <span class="icon-bar"></span>
	        <span class="icon-bar"></span>
	      </button>
	      <a class="navbar-brand" href="${contextPath }/index.jsp">Product</a>
	    </div>
	
	    <!-- Collect the nav links, forms, and other content for toggling -->
	    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
	      <ul class="nav navbar-nav">
	        <li class="dropdown">
	          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">配置文档<span class="caret"></span></a>
	          <ul class="dropdown-menu">
	            <li><a href="${contextPath }/static/docs/attribute.html" target="_blank">属性配置</a></li>
	          </ul>
	        </li>
	      </ul>
	      <ul class="nav navbar-nav">
	        <li class="dropdown">
	          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">AIUPC<span class="caret"></span></a>
	          <ul class="dropdown-menu">
	            <li><a href="${contextPath }/ui/template/home.html" target="_blank">模板查询</a></li>
	            <li><a href="${contextPath }/meta/object/home.html" target="_blank">元素据查询</a></li>
	            <li><a href="${contextPath }/meta/ivalue/home.html" target="_blank">表对象查询</a></li>
	          </ul>
	        </li>
	      </ul>
	      <ul class="nav navbar-nav navbar-right">
	        <li class="dropdown">
	          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">你好，游客<span class="caret"></span></a>
	          <ul class="dropdown-menu">
	            <li><a href="#">无账号，注册</a></li>
	            <li><a href="#">有账号，登录</a></li>
	          </ul>
	        </li>
	      </ul>
	    </div><!-- /.navbar-collapse -->
	  </div><!-- /.container-fluid -->
	</nav>

    <!-- /.container -->

    <!-- jQuery (necessary for Flat UI's JavaScript plugins) -->
    <script src="${contextPath }/static/Flat-UI/js/vendor/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="${contextPath }/static/Flat-UI/js/vendor/video.js"></script>
    <script src="${contextPath }/static/Flat-UI/js/flat-ui.min.js"></script>
	<!-- angularjs -->
	<script src="${contextPath }/static/angularjs/angular.min.js"></script>
  </body>
</html>
