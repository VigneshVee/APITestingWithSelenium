package com.api.rest;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class restAPI {
@Test
public void testRestAPI()throws Throwable{
	//WebDriver driver = new InternetExplorerDriver();
	
	Response response = RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
	System.out.println("Status Code : "+response.getStatusCode());
	System.out.println("Content : "+response.asString());
	assertEquals(response.getStatusCode(), 200);
}
}
