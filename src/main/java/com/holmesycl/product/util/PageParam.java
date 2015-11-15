package com.holmesycl.product.util;

import java.io.Serializable;

/**
 * 与分页参数
 * 
 * @author yecl
 *
 */
public class PageParam implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -908013726796577974L;

	/**
	 * 页码，从1开始
	 */
	private int pageNum;
	/**
	 * 页面大小
	 */
	private int pageSize;

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

}
