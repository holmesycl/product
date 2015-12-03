<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/common.jsp"%>
<html lang="zh-CN">
  <head>
    <meta charset="utf-8">
    <title>对象</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Loading Bootstrap -->
    <link href="${contextPath }/static/Flat-UI/css/vendor/bootstrap.min.css" rel="stylesheet">
    <!-- Loading Flat UI -->
    <link href="${contextPath }/static/Flat-UI/css/flat-ui.min.css" rel="stylesheet">
    
    <link href="${contextPath }/static/Font-Awesome/css/font-awesome.min.css" rel="stylesheet">
    
    <link href="${contextPath }/static/showloading/css/loading.css" rel="stylesheet">
    
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
   			<div class="col-md-12">
   				<ol class="breadcrumb">
				  <li><a href="../../index.jsp">首页</a></li>
				  <li><a href="../../index.jsp">AIUPC</a></li>
				  <li class="active">模板查询</li>
				</ol>
   			</div>
   		</div>
    	<div class="row">
  			<div class="col-md-12">
  				<form class="form-inline" role="search" style="margin: 20px 0 20px 0;">
			  		<div class="form-group">
			    		<input name="searchText" type="text" class="form-control" placeholder="Search">
			  		</div>
			  		<button type="submit" class="btn btn-primary">搜索</button>
				</form>
  			</div>
  		</div>
    	<div class="row">
    		<div class="col-md-6">
    			<div id="objTree"></div>
    		</div>
    		
    		<div class="col-md-6">
    			<div id="valTree"></div>
    		</div>
    	</div>
  	</div>
    <!-- /.container -->

    <!-- jQuery (necessary for Flat UI's JavaScript plugins) -->
    <script src="${contextPath }/static/Flat-UI/js/vendor/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="${contextPath }/static/Flat-UI/js/flat-ui.min.js"></script>
    <script src="${contextPath }/static/js/lib/bootstrap-treeview.js"></script>
    <script src="${contextPath }/static/showloading/js/loading.js"></script>
    
    
    <script type="text/javascript">
		
    	(function($){
    		
    		var objUrl = "${contextPath }/meta/object";
    		
    		var valUrl = "${contextPath }/meta/ivalue/";
    		
    		var options = {
   				collapseIcon: 'icon-folder-open-alt',
   				expandIcon: 'icon-folder-close-alt',
   				emptyIcon: 'icon-file-alt',
   				showTags: true,
   	    	}
    		
    		var valOptions = {
        		levels: 2
        	}
			valOptions = $.extend(valOptions, options);
    		
    		var objOptions = {
    			levels: 1,
   				onNodeSelected: function(event, node) {
   					console.log(node);
   					$('#valTree').treeview('remove');
   					if(!node.nodes){
   		  				$('#objTree').showLoading();
   		  				$.post(valUrl + "/tree/attr",{attrId: node.value},function(data){
   		  					valOptions.data = data;
   		  	    			$('#valTree').treeview(valOptions);
   		  	    			$('#objTree').hideLoading();
   		  	    			// 滚动到顶部
   		  	    			if(data.length > 0){
   		  	    				$('html,body').animate({scrollTop: 0}, 1000);
   		  	    			}
   		  	    	 	});
   					}
   				}
    		};
    		
    		objOptions = $.extend(objOptions, options);
    		
    		
    		$("form:first").submit(function(event){
    			$(this).showLoading();
    			event.preventDefault();
    			var searchText = $('input[name="searchText"]').val();
    			$.post(objUrl + "/tree",{name: searchText},function(data){
    				objOptions.data = data;
    				$('#objTree').treeview(objOptions);
    				$('#valTree').treeview('remove');
    				$(this).hideLoading();
    	    	});
    		});
    		
    	})(jQuery);

    </script>
  </body>
</html>
