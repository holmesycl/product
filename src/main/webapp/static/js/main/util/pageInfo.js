/**
 * 
 */
(function(window) {
	
	var pageInfo = {
		"pageNum" : 0, // 当前页
		"pageSize" : 0, // 每页数量
		"size" : 0, // 当前页数量
		"orderBy" : null, // 排序
		"startRow" : 0, // 当前页面第一个元素在数据库中的行号
		"endRow" : 0, // 当前页面最后一个元素在数据库中的行号
		"total" : 0, // 总记录数
		"pages" : 0, // 总页数
		"list" : [], // 结果集
		"firstPage" : 0, // 第一页
		"prePage" : 0, // 前一页
		"nextPage" : 0, // 下一页
		"lastPage" : 0, // 最后一页
		"isFirstPage" : false, // 是否为第一页
		"isLastPage" : false, // 是否为最后一页
		"hasPreviousPage" : false, // 是否有前一页
		"hasNextPage" : false, // 是否有下一页
		"navigatePages" : 0, // 导航页码数
		"navigatepageNums" : [] // 所有导航页号
	}
	
	window.pageInfo = pageInfo;
	
})(window)