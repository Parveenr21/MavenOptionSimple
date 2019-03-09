
package pack_testNG;


import org.testng.Reporter;
import org.testng.annotations.*;


public class Methodrun_testNG{

	//TestNG default method run is is alphabetic order..so to make it in order.. we have to either use depends on attribute with test annotation or
	//other ways are in the xml..specify it in specific order by having an include statement.



	// d comes before m**** so databasemethod*** come beofe m... also M** method come before m***

	@Test
	public void met1(){


		System.out.println("method 1 called" + System.currentTimeMillis());
		Reporter.log("String logged from reporter.log apis of testng");
	}


	@Test
public void met2(){


		System.out.println("method 2 called");
	}


	@Test
	public void met4(){


			System.out.println("method 4 called");
		}

	@Test(groups="Databasetest")
	public void database1(){


			System.out.println("database 1 called");
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

@Test(groups="Databasetest")
public void mongo1(){


		System.out.println("Mongo 1 called");
	}


	@BeforeMethod

	public void prepMethod()
	{

		System.out.println("BeforeMethod is call before every TEST method");

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



}