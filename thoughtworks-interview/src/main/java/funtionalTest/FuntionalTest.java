package funtionalTest;

import org.testng.annotations.Test;

import testUtilities.ServiceUtils;

public class FuntionalTest {
	ServiceUtils su = new ServiceUtils();

	@Test
	public void test1() {
		su.verifyResponse();
	}
}
