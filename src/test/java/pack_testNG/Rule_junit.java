package pack_testNG;

import static org.junit.Assert.*;		//static import

import java.io.File;
import java.io.IOException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.Timeout;

public class Rule_junit {

	

		  @Rule
		  public TemporaryFolder tempFolder = new TemporaryFolder();	//default rules ..or class..setting overriding
		  public Timeout timout = new Timeout(100);	//default rules ..or class..setting overriding
		  
		  
		  public String varLoginname="rawatJi";

		  @Test
		  public void testRule() throws IOException {
		    File newFolder = tempFolder.newFolder("Temp Folder"); 
		    assertTrue(newFolder.exists());
		    System.out.println(timout);
		    System.out.println(varLoginname);
		    
		  }
		
	
}
