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
    <link rel="shortcut icon" href="${contextPath }/static/Flat-UI/img/favicon.ico">
    <!-- HTML5 shim, for IE6-8 support of HTML5 elements. All other JS at the end of file. -->
    <!--[if lt IE 9]>
      <script src="${contextPath }/static/Flat-UI/js/vendor/html5shiv.js"></script>
      <script src="${contextPath }/static/Flat-UI/js/vendor/respond.min.js"></script>
    <![endif]-->
  </head>
  <body>
  	
    <div class="container-fluid">
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
    
    	function getTree() {
    	  // Some logic to retrieve, or generate tree structure
    	  var tree = [
			  {
			    text: "Parent 1",
			    nodes: [
			      {
			        text: "Child 1",
			        icon: "glyphicon glyphicon-stop",
			        selectedIcon: "glyphicon glyphicon-stop",
			        color: "#000000",
			        backColor: "#FFFFFF",
			        nodes: [
			          {
			            text: "Grandchild 1"
			          },
			          {
			            text: "Grandchild 2"
			          }
			        ]
			      },
			      {
			        text: "Child 2"
			      }
			    ]
			  },
			  {
			    text: "Parent 2"
			  },
			  {
			    text: "Parent 3"
			  },
			  {
			    text: "Parent 4"
			  },
			  {
			    text: "Parent 5"
			  }
			];
    	  return tree;
    	}

    	$('#tree').treeview({data: getTree()});
    
    </script>
  </body>
</html>
