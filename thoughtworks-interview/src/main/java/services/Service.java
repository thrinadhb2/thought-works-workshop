package services;

import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Service {
	public Response postEndPoint(JSONObject bodyJson) {
		RequestSpecification request = RestAssured.given();
		request.contentType("application/json");
		request.body(bodyJson.toString());
		request.log().all();
		Response res = request.post("/api/users");
		return res;

	}

	public Response getListUsers() {
		RequestSpecification request = RestAssured.given();
		request.contentType("application/json");
		request.log().all();
		Response res = request.get("/api/users");
		return res;
	}
}
