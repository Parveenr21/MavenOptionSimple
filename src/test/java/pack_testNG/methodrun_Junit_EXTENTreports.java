
package pack_testNG;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.testng.log4testng.Logger;


//THIS ANNOTATION FOR TEST CLASS IS POVIDED IN JUNIT 4.11..othere wise ..random execution is there..
//Here the order would be the way..e.g
/*	method 1 called
		method 10 called
		method 11 called
		method 12 called
		method 2 called
		method 4 called*/


//@FixMethodOrder(MethodSorters.NAME_ASCENDING)


public class methodrun_Junit_EXTENTreports{

private	ExtentHtmlReporter htmlReporter;

	@Test
	public void met1(){
		htmlReporter=new ExtentHtmlReporter("extentREPORThtml.html");

		ExtentReports  reports=new ExtentReports();

		reports.attachReporter(htmlReporter);
		ExtentTest test1=reports.createTest("TEST 1");

		test1.log(Status.INFO,"Yahoo logger using XTENT reports");
		test1.pass("pass");
		test1.fail("fail");
		test1.fatal("FATAL");
		test1.error("error");
		test1.warning("warning");

		reports.flush();
		System.out.println("method 1 called");
	}


	@Test
public void met2(){


		System.out.println("method 2 called");
	}


	@Test
	public void met4(){


			System.out.println("method 4 called");
		}

	@Test
	public void met5(){


			System.out.println("method 5 called");
		}
	@Test
	public void met6(){


			System.out.println("method 6 called");
		}	@Test
	public void met7(){


			System.out.println("method 7 called");
		}	@Test
	public void met8(){


			System.out.println("method 8 called");
		}	@Test
	public void met9(){


			System.out.println("method 9 called");
		}	@Test
	public void met10(){


			System.out.println("method 10 called");
		}	@Test
	public void met11(){


			System.out.println("method 11 called");
		}	@Test
	public void met12(){


			System.out.println("method 12 called");
		}

		@Test(expected=IndexOutOfBoundsException.class)
		public void meth13()
		{
			System.out.println("method 13 called");

			throw new ArrayIndexOutOfBoundsException();
			//throw new IndexOutOfBoundsException();
			//Superclass in the expected will also work ..if the child clss exception is thrown.
		}
}