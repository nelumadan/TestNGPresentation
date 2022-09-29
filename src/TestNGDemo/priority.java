package TestNGDemo;

import org.testng.annotations.Test;

public class priority
{
	@Test  
	public void mango()  
	{  
	System.out.println("I am Mango");  
	} 
	
	@Test(priority=2)  
	public void apple()  
	{  
	System.out.println("I am Apple");  
	}  
	
	@Test(priority=1)  
	public void watermelon()  
	{  
	System.out.println("I am Watermelon");  
	}  
}
/*
 * In the above code, the default priority of mango() test method is 0, so it
 * will be executed first. The watermelon() test method will run after mango()
 * method as the priority of watermelon() test method is 1. The apple() test
 * method has the highest priority 2, so it will be executed last.
 */