package services;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Service {

	public Response googleEndPoint() {
		RestAssured.baseURI = "https://www.google.co.in";
		RequestSpecification request = RestAssured.given();
		request.log().all();
		Response rs = request.get();
		return rs;
	}

}
