<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/common.jsp"%>
<html lang="zh-CN">
  <head>
    <meta charset="utf-8">
    <title>模板</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Loading Bootstrap -->
    <link href="${contextPath }/static/Flat-UI/css/vendor/bootstrap.min.css" rel="stylesheet">
    <!-- Loading Flat UI -->
    <link href="${contextPath }/static/Flat-UI/css/flat-ui.min.css" rel="stylesheet">
    
    <link href="${contextPath }/static/Font-Awesome/css/font-awesome.min.css" rel="stylesheet">
    
    <link rel="shortcut icon" href="${contextPath }/static/Flat-UI/img/favicon.ico">
    <!-- HTML5 shim, for IE6-8 support of HTML5 elements. All other JS at the end of file. -->
    <!--[if lt IE 9]>
      <script src="${contextPath }/static/Flat-UI/js/vendor/html5shiv.js"></script>
      <script src="${contextPath }/static/Flat-UI/js/vendor/respond.min.js"></script>
    <![endif]-->
  </head>
  <body>

    <div class="container">
    	<div class="row">
    		<div class="col-md-6">
    			<div id="tree"></div>
    		</div>
    	</div>
  	</div>
    <!-- /.container -->

    <!-- jQuery (necessary for Flat UI's JavaScript plugins) -->
    <script src="${contextPath }/static/Flat-UI/js/vendor/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="${contextPath }/static/Flat-UI/js/flat-ui.min.js"></script>
    <script src="${contextPath }/static/js/lib/bootstrap-treeview.js"></script>
    
    <script type="text/javascript">
    	
    	var baseUrl = "${contextPath }/ui/template";
    	
		$.get(baseUrl + "/tree?name=策划",function(data){
			$('#tree').treeview({data: data});
    	});
    
    </script>
  </body>
</html>
