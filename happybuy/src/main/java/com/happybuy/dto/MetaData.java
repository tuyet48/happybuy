package com.happybuy.dto;

import com.happybuy.reference.ESortType;

public class MetaData {
	private int pageNumber;
	private int pageSize;
	private ESortType sortType; //type of sorting DESCENDING or ASCENDING
	private String sortValue; //column will be sorted, ex: quantiy, name,...

	//getter and setter
	
	public ESortType getSortType() {
		return sortType;
	}

	public void setSortType(ESortType sortType) {
		this.sortType = sortType;
	}

	public String getSortValue() {
		return sortValue;
	}

	public void setSortValue(String sortValue) {
		this.sortValue = sortValue;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

}
