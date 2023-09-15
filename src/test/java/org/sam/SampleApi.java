package org.sam;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SampleApi {
	public static void main(String[] args) {
		Response response = RestAssured.get("https://dummy.restapiexample.com/api/v1/employees");
		int stscde = response.statusCode();
		String stsline = response.statusLine();
		System.out.println(stscde);
		System.out.println(stsline);
	}

}
