package funtionalTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import testUtilities.Utils;

public class TestClass {
	Utils util = new Utils();

	@BeforeTest
	public void baseURI() {
		RestAssured.baseURI = "https://reqres.in";
	}

	@Test
	public void verifyCreateUser() {
		util.verifyPostEndPoint();
	}

	@Test
	public void verifyListUsers() {
		util.verifyListUsers();

	}
}
