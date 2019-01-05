package com.happybuy.dto;

public class RequestDataDTO<T> {
	
	private T data;	
	private MetaData metadata;
	
	//getter and setter
	
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public MetaData getMetadata() {
		return metadata;
	}
	public void setMetadata(MetaData metadata) {
		this.metadata = metadata;
	}
}
