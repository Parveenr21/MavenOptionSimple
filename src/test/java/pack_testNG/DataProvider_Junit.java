package pack_testNG;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;




@RunWith(DataProviderRunner.class)			//Add this to Data Provider providing class
public class DataProvider_Junit {

    @DataProvider
    public static Object[][] data() {
        return new Object[][] {
                         { "abc", "abc" },
                         { "cba", "abc" },
         };
    }


    
    
    @Test
    @UseDataProvider("data")
    public void testSort( String input, String expected) {

    		System.out.print("firstString    " + input);
    			System.out.print("        Second String    " + expected);
    				System.out.println();
    }
}