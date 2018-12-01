package com.weixin.utils.base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("rawtypes")
public class PaginationUtils{

	private int numPerPage = 10;// 每页大小

	private int totalCount;// 总共多少条

	private int currentPage = 1;// 当前第几页
	
	private Map<String, Object> paramMap = new HashMap<String, Object>(); // 参数
	
	private List<SortBean> sortList = new ArrayList<SortBean>(); // 排序参数
	
	private List data = new ArrayList(); // 返回数据
	
	public PaginationUtils(){
		
	}
	
	public PaginationUtils(int numPerPage, int currentPage) {
		super();
		this.numPerPage = numPerPage;
		this.currentPage = currentPage;
	}

	public int getTotalPage() {
		return this.totalCount % this.numPerPage == 0 ? this.totalCount
				/ this.numPerPage : this.totalCount / this.numPerPage + 1;
	}

	public int getStartIndex() {
		return currentPage==0?0:(currentPage-1)*this.numPerPage;
	}

	public int getNumPerPage() {
		return numPerPage;
	}

	public void setNumPerPage(int numPerPage) {
		this.numPerPage = numPerPage;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public Map<String, Object> getParamMap() {
		return paramMap;
	}

	public void setParamMap(Map<String, Object> paramMap) {
		this.paramMap = paramMap;
	}

	public List getData() {
		return data;
	}

	public void setData(List data) {
		this.data = data;
	}

	public List<SortBean> getSortList() {
		return sortList;
	}

	public void setSortList(List<SortBean> sortList) {
		this.sortList = sortList;
	}

	public static class SortBean{
		private String field;
		private String order;
		
		public SortBean(String field, String order) {
			super();
			this.field = field;
			this.order = order;
		}
		public String getField() {
			return field;
		}
		public void setField(String field) {
			this.field = field;
		}
		public String getOrder() {
			return order;
		}
		public void setOrder(String order) {
			this.order = order;
		}
	}
	
}
