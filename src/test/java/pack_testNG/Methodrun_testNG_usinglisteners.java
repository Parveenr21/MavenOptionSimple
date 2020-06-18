
package pack_testNG;


import org.testng.Reporter;
import org.testng.annotations.*;

@Listeners(Methodrun_testNG_d1_listeners.class)
public class Methodrun_testNG_usinglisteners {

	//TestNG default method run is is alphabetic order..so to make it in order.. we have to either use depends on attribute with test annotation or
	//other ways are in the xml..specify it in specific order by having an include statement.



	// d comes before m**** so databasemethod*** come beofe m... also M** method come before m***

	@Test
	
	public void met1(){


		System.out.println("method 1 called" + System.currentTimeMillis());
		Reporter.log("String logged from reporter.log apis of testng");
	}




}