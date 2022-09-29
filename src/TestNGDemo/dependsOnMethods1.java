package TestNGDemo;

import org.testng.annotations.Test;

public class dependsOnMethods1
{
	@Test  
	public void WebStudentLogin()  
	{  
	System.out.println("Student login through web");  
	} 
	
	@Test  
	public void MobileStudentLogin()  
	{  
	System.out.println("Student login through mobile");  
	}  
	
	@Test(dependsOnMethods= {"WebStudentLogin"})  
	public void APIStudentLogin()  
	{  
	System.out.println("Student login through API");  
	}  
}
/*
 * In the above output, MobileStudentLogin() runs before the WebStudentLogin()
 * method as TestNG runs the test methods in an alphabetical order.
 */