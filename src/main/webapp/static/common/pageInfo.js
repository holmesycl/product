/**
 * 
 */
(function(window) {
	var pageInfo = {
		"pageNum" : 1,
		"pageSize" : 10,
		"size" : null,
		"orderBy" : null,
		"startRow" : null,
		"endRow" : null,
		"total" : null,
		"pages" : null,
		"list" : [],
		"firstPage" : 1,
		"prePage" : null,
		"nextPage" : 1,
		"lastPage" : null,
		"isFirstPage" : null,
		"isLastPage" : null,
		"hasPreviousPage" : null,
		"hasNextPage" : null,
		"navigatePages" : null,
		"navigatepageNums" : []
	}
	window.pageInfo = pageInfo;
})(window)