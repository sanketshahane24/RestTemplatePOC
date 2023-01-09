package com.RestTemplatePOC.model;

public class EmployeePostResponse {

	String status;
	Employee data;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Employee getData() {
		return data;
	}
	public void setData(Employee data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "EmployeePostResponse [status=" + status + ", data=" + data + "]";
	}
}
