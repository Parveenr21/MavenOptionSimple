
package pack_testNG;


import org.testng.*;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;


@Listeners(Methodrun_testNG_d1_listeners.class)
public class Methodrun_testNG_d1_listeners implements ITestListener, ISuiteListener {

	//TestNG default method run is is alphabetic order..so to make it in order.. we have to either use depends on attribute with test annotation or
	//other ways are in the xml..specify it in specific order by having an include statement.
	SoftAssert softAss=new SoftAssert();

	@Test
	public void met1(){


		System.out.println("method 1 called" + System.currentTimeMillis());
		Reporter.log("String logged from reporter.log apis of testng");
	}


	@Test
public void met2(){


		System.out.println("method 2 called");
//Assert.assertEquals(1,2);
	}


	@Test
	public void met4(){


			System.out.println("method 4 called");

		softAss.assertEquals(1,2);

	}

	@Test
	@Parameters("browser")
	public void met3(String browser){


			System.out.println("method 3 called with browser name" + browser);
		}




	@BeforeSuite
	public void Suitestart(){

		System.out.println("**************Before suite method of first Methodrun_testNG ");


	}


	@AfterSuite
	public void SuiteEND(){

		System.out.println("**************After suite method of first Methodrun_testNG ");
softAss.assertAll();

	}


@BeforeClass

	public void beforeclass2_Methodrun_testNG2()
	{

		System.out.println("Before class method for the class name Methodrun_testNG");

	}

@AfterClass

	public void afterclass2_Methodrun_testNG2()
	{

		System.out.println("After class method for the class name Methodrun_testNG");

	}




@BeforeTest

	public void beforeclass_Methodrun_testNG2()
	{

		System.out.println("Before test method for the class name Methodrun_testNG");

	}

@AfterTest

	public void afterclass_Methodrun_testNG2()
	{

		System.out.println("After test method for the class name Methodrun_testNG");

	}


	public void onTestStart(ITestResult result) {

	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("TEST passed BRO .. hurray");
	}

	public void onTestFailure(ITestResult result) {

	}

	public void onTestSkipped(ITestResult result) {

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onStart(ITestContext context) {

	}

	public void onFinish(ITestContext context) {

	}

	public void onStart(ISuite suite) {

		System.out.println("Before suite using listener");
	}

	public void onFinish(ISuite suite) {

	}
}