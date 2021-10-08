package testUtilities;

import com.ftd.automation.framework.utilities.CustomAssert;

import io.restassured.response.Response;
import services.Service;

public class ServiceUtils {
	private Service ser = new Service();

	public void verifyResponse() {
		Response rs = ser.googleEndPoint();
		CustomAssert.assertAndLog(rs.statusCode(), 200);
	}
}
