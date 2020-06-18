
package pack_testNG;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;


public class Methodrun_testNG_HARD_SOFT_ASSERT {


	SoftAssert softAss=new SoftAssert();

	@Test
	//HARD ASS
	public void hardAssert_Method(){

		Assert.assertTrue(5<1);
		System.out.println("Assertion Failed");
		Assert.assertFalse(1<5);
		System.out.println("Assertion Failed");
		Assert.assertEquals("Passed", "Failed");
		System.out.println("Assertion Failed");

	}


	@Test
	//SOFT ASS
	public void softAssert_Method(){


		softAss.assertTrue(5<1);
		System.out.println("Assertion Failed");
		softAss.assertFalse(1<5);
		System.out.println("Assertion Failed");
		softAss.assertEquals("Passed", "Failed");
		System.out.println("Assertion Failed");
		softAss.assertAll();

	}




}