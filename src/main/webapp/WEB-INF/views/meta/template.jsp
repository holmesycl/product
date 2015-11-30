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
    
    <link href="${contextPath }/static/showloading/css/loading.css" rel="stylesheet">
    
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
    			<div class="row">
    				<div class="col-md-12">
    					<form class="form-inline" role="search" style="margin: 20px 0 20px 0;">
					  		<div class="form-group">
					    		<input name="searchText" type="text" class="form-control" placeholder="模板ID/模板名称">
					  		</div>
					  		<button type="submit" class="btn btn-primary">搜索</button>
						</form>
    				</div>
    			</div>
    		</div>
    	</div>
    	
    	<div class="row">
    	
    		<!-- 模板 -->
 			<div class="col-md-4">
 				<div id="temTree"></div>
 			</div>
 			
 			<!-- 对象 -->
 			<div class="col-md-4">
 				<div id="objTree"></div>
 			</div>
 			
 			<!-- 数据库表 -->
 			<div class="col-md-4">
 				<div id="valTree"></div>
 			</div>
 			
 		</div>
 		
 		
 		<!-- alert modal -->
 		<jsp:include page="/alertModal.jsp"></jsp:include>
 		
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
    		
    		// 模板URL
    		var temUrl = "${contextPath }/ui/template";
    		// 元数据对象URL
    		var objUrl = "${contextPath }/meta/object";
    		// 数据库表URL
    		var valUrl = "${contextPath }/meta/ivalue/";
    		
    		// 模板树
    		var $temTree = $('#temTree');
    		// 元素据对象树
    		var $objTree = $('#objTree');
    		// 数据库表树
    		var $valTree = $('#valTree');
    		
    		// 树组件基础配置
    		var options = {
   				collapseIcon: 'icon-folder-open-alt',
   				expandIcon: 'icon-folder-close-alt',
   				emptyIcon: 'icon-file-alt',
   				showTags: true
   	    	}
    		
    		// 数据库表树形组件配置
    		var valOptions = {
            	levels: 2
            }
    		valOptions = $.extend(valOptions, options);
    		
    		// 元数据对象树形组件配置
    		var objOptions = {
    			levels: 2,
   				onNodeSelected: function(event, node) {
   					console.log(node);
   					if(!node.nodes){
   						$objTree.showLoading();
   		  				$.post(valUrl + "/tree/attr",{attrId: node.value},function(data){
   		  					$valTree.treeview('remove');
   		  					
   		  					valOptions.data = data;
   		  					$valTree.treeview(valOptions);
   		  					$objTree.hideLoading();
   		  	    			// 滚动到顶部
   		  	    			if(data.length > 0){
   		  	    				$('html,body').animate({scrollTop: 0}, 1000);
   		  	    			}
   		  	    	 	});
   					}
   				}
    		};
    		objOptions = $.extend(objOptions, options);
    		
    		// 模板树形组件配置
    		var temOptions = {
    			levels: 1,
    			onNodeSelected: function(e, node) {
    				console.log(node);
    				console.log($.inArray('辅助控件',node.tags));
   					if(!node.nodes || $.inArray('辅助控件',node.tags) > -1){
   						$temTree.showLoading();
   		  				$.post(objUrl + "/tree/component",{componentId: node.value},function(data){
   		  					// 一些清理
	   		    			$objTree.treeview('remove');
	   		    			$valTree.treeview('remove');
	   		    			
   		  					objOptions.data = data;
   		  					$objTree.treeview(objOptions);
   		  					$temTree.hideLoading();
   		  	    			// 滚动到顶部
   		  	    			if(data.length > 0){
   		  	    				$('html,body').animate({scrollTop: 0}, 1000);
   		  	    			}
   		  	    	 	});
   					}
   				}
    		};
    		temOptions = $.extend(temOptions, options);
    		
    		
    		$("form:first").submit(function(e){
    			// 阻止表单提交
    			e.preventDefault();
    			// 获取查询输入框的值
    			var searchText = $(this).find('input[name="searchText"]').val();
    			if($.trim(searchText) === ""){
    				$('#alertModal').modal('toggle');
    				return;
    			}
    			$(this).showLoading();
    			$.post(temUrl + "/tree",{searchText: searchText},function(data){
    				// 一些清理
    				$temTree.treeview('remove');
    				$objTree.treeview('remove');
    				$valTree.treeview('remove');
    				temOptions.data = data;
    				$temTree.treeview(temOptions);
    				$(this).hideLoading();
    	    	});
    		});
    		
    		// alert modal 显示时触发该事件
    		$('#alertModal').on('show.bs.modal', function (e) {
    			$(this).find('.modal-body > p:first').text('查询条件不能为空。');
    		})

    		
    	})(jQuery);

    </script>
  </body>
</html>
