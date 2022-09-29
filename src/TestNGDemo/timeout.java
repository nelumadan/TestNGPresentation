package TestNGDemo;

import org.testng.annotations.Test;

public class timeout
{
	@Test(timeOut=200)  
	public void testcase1() throws InterruptedException  
	{  
	Thread.sleep(500);  
	System.out.println("This is testcase1");  
	}  
	
	@Test    
	public void testcaes2()  
	{  
	System.out.println("This is testcase2");  
	} 
	
	@Test  
	public void testcase3()  
	{  
	System.out.println("This is testcase3");  
	}  
}
/*
 * In the above code, inside the testcase1() method, we have Thread.sleep(500)
 * which means that the testcase1() method will be executed after 500
 * milliseconds, but we have provided timeOUT attribute with the value 200 means
 * that the testcase1() will be failed after 200 milliseconds.
 */