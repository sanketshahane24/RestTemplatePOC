package com.RestTemplatePOC;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.RestTemplatePOC.model.Employee;
import com.RestTemplatePOC.model.EmployeePostResponse;
import com.RestTemplatePOC.model.EmployeeResponse;

public class POCApplication {
	
	private RestTemplate template = new RestTemplate();
	
	public void getData() throws RestClientException, URISyntaxException {
		String url = "https://dummy.restapiexample.com/api/v1/employees";
		ResponseEntity<EmployeeResponse> response = template.getForEntity(new URI(url), EmployeeResponse.class);
		if(response.getStatusCode() == HttpStatus.OK)
			System.out.println(response.toString());
	}
	
	public void postdata() throws RestClientException, URISyntaxException {
		String url = "https://dummy.restapiexample.com/api/v1/create";
		HttpHeaders headers = new HttpHeaders();
		headers.add("content-type", "application/json");
		HttpEntity<Employee> entity = new HttpEntity<Employee>(new Employee("Sanket","2000","25"),headers);
		ResponseEntity<EmployeePostResponse> response = template.exchange(new URI(url),HttpMethod.POST,entity,EmployeePostResponse.class);
		//ResponseEntity<EmployeePostResponse> response = template.postForEntity(new URI(url), new Employee("Sanket","2000","25"), EmployeePostResponse.class);
		System.out.println(response.toString());
	}
	
	public void getDataById() throws RestClientException, URISyntaxException {
		String url = "https://dummy.restapiexample.com/api/v1/employee/1";
		ResponseEntity<EmployeePostResponse> response = template.getForEntity(new URI(url), EmployeePostResponse.class );
		System.out.println(response.toString());
	}

}
