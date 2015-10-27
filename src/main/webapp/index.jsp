<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="common.jsp"%>
<html ng-app>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="./resources/images/favicon.ico">

<title>主页</title>
<!-- Bootstrap core CSS -->
<link href="${contextPath }/resources/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
<script src="${contextPath }/resources/html5shiv/html5shiv.min.js"></script>
<script src="${contextPath }/resources/respond/respond.min.js"></script>
<![endif]-->
</head>
<body>
	
	Your name: <input type="text" ng-model="yourname" placeholder="World">
        <hr>
    Hello {{yourname || 'World'}}!
	
	<!-- Bootstrap core JavaScript -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="${contextPath }/resources/jquery/jquery.min.js"></script>
    <script src="${contextPath }/resources/bootstrap/js/bootstrap.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="${contextPath }/resources/ie/ie10-viewport-bug-workaround.js"></script>
	<!-- angularjs -->
	<script src="${contextPath }/resources/angularjs/angular.min.js"></script>
</body>
</html>
