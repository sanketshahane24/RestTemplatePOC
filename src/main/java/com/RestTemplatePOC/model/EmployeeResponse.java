package com.RestTemplatePOC.model;

import java.util.List;

public class EmployeeResponse {

	String status;
	List<Employee> data;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<Employee> getData() {
		return data;
	}
	public void setData(List<Employee> data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "EmployeeResponse [status=" + status + ", data=" + data + "]";
	}
	
	
	
}
