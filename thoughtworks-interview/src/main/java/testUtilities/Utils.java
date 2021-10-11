package testUtilities;

import static org.testng.Assert.fail;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.Assert;

import io.restassured.response.Response;
import services.Service;

public class Utils {
	Service ser = new Service();

	public void verifyPostEndPoint() {
		JSONObject obj = new JSONObject();
		String name = "Thrinadh";
		String job = "QA";
		obj.put("name", name);
		obj.put("job", job);
		Response res = ser.postEndPoint(obj);
		Assert.assertEquals(res.statusCode(), 201);
		JSONObject responseJson = new JSONObject(res.asString());

		Assert.assertEquals(res.statusCode(), 201);
		Assert.assertEquals(responseJson.get("name"), name);
		Assert.assertEquals(responseJson.get("job"), job);

		String idFromResponse = responseJson.getString("id");
		System.out.println("idFromResponse : " + idFromResponse);
		try {
			int id = Integer.parseInt(idFromResponse);
		} catch (NumberFormatException e) {
			fail("id is not a integer", e);
		}

	}

	public void verifyListUsers() {
		Response listUserRes = ser.getListUsers();
		System.out.println(" list user response : " + listUserRes.asString());
		JSONObject lisJsonObj = new JSONObject(listUserRes.asString());
		int per_page = lisJsonObj.getInt("per_page");

		JSONArray data = lisJsonObj.getJSONArray("data");
		int size = data.length();
		for (int i = 0; i < size; i++) {
			System.out.println("email list " + i + " : " + data.getJSONObject(i).getString("email"));

		}
	}

}
