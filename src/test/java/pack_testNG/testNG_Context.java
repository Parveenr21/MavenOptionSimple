package pack_testNG;

import org.testng.ITestContext;
import org.testng.annotations.Test;




public class testNG_Context {

	
	

	
	@Test
	public  void test11(ITestContext context)
	{

		
/*
		 Assertion hardAssert = new Assertion();
		   SoftAssert softAssert = new SoftAssert();
		   
*/		   
		   
		
		
		System.out.println(context.getCurrentXmlTest().getParameter("narendra"));
		
		
		
		//This will not work as this ITTestContext needs listeners to be set for that		
	
		
		//softAssertion.assertTrue(1==2, "dddd");
		
		
		
		
		System.out.println("statement 1");
		
		
		/*try{
		Assert.assertTrue(1==2);
		}
		
		catch(AssertionError e)			//This is the AssertionError class...Exception class can not be used and it will not catch this exception.
		{
		System.out.println("statement 1");
		}*/
		
		
	
		
		
		
		System.out.println("statement 2");
	}
	
	/*
	
	@Test(expectedExceptions =ArithmeticException.class) 
	public void testPrintMessage()
	{ 
		System.out.println("Inside  message"); 
		
	}
	*/
	
	
	@Test(dependsOnMethods ={"test111"})
	public void test990(){
		
		System.out.println("firstly called ..");
	}
	
	
	@Test()
	public void test111(){
		
		System.out.println("secondly called ..");
	}

	
	
	
	
	
	/*@Test()
	@Parameters(value ={"x","y","z"})
	public void test44(String a, String b, String c ){
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	
		
		
	}	*/
	
}
