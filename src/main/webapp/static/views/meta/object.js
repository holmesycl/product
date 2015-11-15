/**
 * 
 */
(function(angular){
	'use strict';
	
	var objectApp = angular.module('objectApp', ['infinite-scroll']);
	
	objectApp.controller('ObjectCtrl', ['$scope', '$http', function($scope, $http){
		
		$scope.pageInfo = window.pageInfo;
		$scope.objects = [];
		$scope.busy = false;
		
		$scope.loadObject = function(){
			var url = "search";
			var data = {
				query: $scope.query,
				pageNum: $scope.pageInfo.nextPage,
				pageSize: $scope.pageInfo.pageSize
			};
			
			var transform = function(data){
			    return $.param(data);
			}
			
			$http.post(url, data, {
				headers: { 'Content-Type': 'application/x-www-form-urlencoded; charset=UTF-8'},
			    transformRequest: transform
			}).success(function(data){
				$scope.pageInfo = data;
				for (var i = 0, len = $scope.pageInfo.list.length; i < len; i++) {
					$scope.objects.push($scope.pageInfo.list[i]);
			    }
				$scope.busy = false;
			});
		}
		
		$scope.nextPage = function(){
			if($scope.busy){
				return;
			}
			$scope.busy = true;
			$scope.loadObject();
		}
		
	}]);
})(window.angular)