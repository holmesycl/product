/**
 * 
 */
(function(angular){
	'use strict';
	
	var objectApp = angular.module('objectApp', ['infinite-scroll']);
	
	objectApp.controller('ObjectCtrl', ['$scope', '$http', function($scope, $http){
		
		// 初始化
		$scope.pageInfo = window.pageInfo;
		$scope.objects = [];
		$scope.url = "search";
		
		// 查询
		$scope.searchObject = function(){
			// 清空分页信息和数据
			$scope.pageInfo = {};
			$scope.objects = [];
			// 初始化分页信息
			$scope.pageInfo.pageNum = 1; // 显示第一页
			$scope.pageInfo.pageSize = 20; // 显示20条记录
			$scope.loadObject(); // 执行查询
		}
		
		$scope.transform = function(data){
			return $.param(data);
		}
		
		// 查询
		$scope.loadObject = function(){
			$scope.busy = true;
			var param = {
				query: $scope.query,
				pageNum: $scope.pageInfo.pageNum,
				pageSize: $scope.pageInfo.pageSize
			}
			$http.post($scope.url, param, {
				headers: { 'Content-Type': 'application/x-www-form-urlencoded; charset=UTF-8'},
			    transformRequest: $scope.transform
			}).success(function(data){
				console.log(data);
				$scope.pageInfo = data;
				for (var i = 0, len = $scope.pageInfo.list.length; i < len; i++) {
					$scope.objects.push($scope.pageInfo.list[i]);
			    }
				$scope.busy = false;
			});
		}
		
		// 下一页
		$scope.nextPage = function(){
			if($scope.busy){
				return;
			}
			if($scope.pageInfo.hasNextPage){
				$scope.pageInfo.pageNum = $scope.pageInfo.nextPage;
				$scope.loadObject();
			}
		}
	}]);
})(window.angular)