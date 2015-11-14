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
    <div class="container">
	
		<div ng-init="qty=1;cost=2">
		  <b>订单:</b>
		  <div>
			数量: <input type="number" ng-model="qty" required >
		  </div>
		  <div>
			单价: <input type="number" ng-model="cost" required >
		  </div>
		  <div>
			<b>总价:{{qty * cost | currency}}</b> 
		  </div>
		</div>
		
	</div>
    <!-- /.container -->


    <!-- jQuery (necessary for Flat UI's JavaScript plugins) -->
    <script src=".${contextPath }/static/Flat-UI/js/vendor/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="${contextPath }/static/Flat-UI/js/vendor/video.js"></script>
    <script src="${contextPath }/static/Flat-UI/js/flat-ui.min.js"></script>
	<!-- angularjs -->
	<script src="${contextPath }/static/angularjs/angular.min.js"></script>
  </body>
</html>
