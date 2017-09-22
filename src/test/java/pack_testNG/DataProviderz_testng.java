package pack_testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderz_testng {
	@DataProvider(name = "data-provider")
	public Object[][] dataProviderMethod() {
		return new Object[][] { { "data one" }, { "data two" } };
	}

	@DataProvider(name = "Authentication")
	public static Object[][] credentials() {

		return new Object[][] { { "testuser_1", "Test@123" }, { "testuser_1", "Test@123" } };

	}
	
	
	//The below random does not work
	
/*	@DataProvider(name = "Zigzag")
	public static Object[][] credentials_zigzag() {

		return new Object[][] { { "testuser_1", "Test@123" }, { "testuser_1", "Test@123" },{ "testuser_1" },{ "testuser_1", "Test@123" } };

	}
*/
	@Test(dataProvider = "data-provider")
	public void testMethod1(String data) {
		System.out.println("Data is: " + data);
	}

	

	@Test(dataProvider = "Authentication")
	public void testMethod2(String username, String password) {
		System.out.println("username  is: " + username);
		System.out.println("password  is: " + password);
	}
	
	
	//This random order does not work
	
/*	@Test(dataProvider = "Zigzag")
	public void testMethod3(String username, String password) {
		System.out.println("username  is: " + username);
		//System.out.println("password  is: " + password);
	}*/
	
	
	//WE have to hold all the passed or returned parameters from data providers.
	//the no. of times test method will be called based on the size of list or array returned .
	
	
	/*
	@Test(dataProvider = "Authentication")
	public void testMethod3(String username) {
		System.out.println("username  is: " + username);
		
	}*/
	
	
}
