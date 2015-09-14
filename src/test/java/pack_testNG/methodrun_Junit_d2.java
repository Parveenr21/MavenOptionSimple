
package pack_testNG;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;


//THIS ANNOTATION FOR TEST CLASS IS POVIDED IN JUNIT 4.11..othere wise ..random execution is there..
	

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
 

public class methodrun_Junit_d2{
	
	
	@Test
	public void met1(){
		
		
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