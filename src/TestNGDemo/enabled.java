package TestNGDemo;

import org.testng.annotations.Test;

public class enabled
{
	@Test  
	public void c_language()  
	{  
	System.out.println("C language");  
	}  
	
	@Test(enabled=false)  
	public void jira()  
	{  
	System.out.println("JIRA is a testing tool");  
	}  
	
	@Test  
	public void java()  
	{  
	System.out.println("JAVA language");  
	}  
}
//In the above code, the value of the enabled attribute in jira() test method is false, so this method will not be invoked.