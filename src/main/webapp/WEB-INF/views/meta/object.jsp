<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/common.jsp"%>
<html lang="zh-CN" ng-app="phonecatApp">
  <head>
    <meta charset="utf-8">
    <title>元数据-对象</title>
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
  <body ng-controller="PhoneListCtrl">
  	
    <div class="container-fluid">
    <div class="row">
      <div class="col-md-2">
        Search: <input ng-model="query">
		  Sort by:
		  <select ng-model="orderProp">
		    <option value="name">Alphabetical</option>
		    <option value="age">Newest</option>
		  </select>

      </div>
      <div class="col-md-10">
        <!--Body content-->

        <ul class="phones">
	    <li ng-repeat="phone in phones | filter:query | orderBy:orderProp">
	      <span>{{phone.name}}</span>
	      <p>{{phone.snippet}}</p>
	    </li>
	  </ul>

      </div>
    </div>
  </div>
    <!-- /.container -->


    <!-- jQuery (necessary for Flat UI's JavaScript plugins) -->
    <script src="${contextPath }/static/Flat-UI/js/vendor/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="${contextPath }/static/Flat-UI/js/vendor/video.js"></script>
    <script src="${contextPath }/static/Flat-UI/js/flat-ui.min.js"></script>
	<!-- angularjs -->
	<script src="${contextPath }/static/angularjs/angular.min.js"></script>
	<script src="${contextPath }/static/views/meta/object.js"></script>
  </body>
</html>
