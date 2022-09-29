package parametersTestNGDemo2;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class fruits
{
	@Test  
	@Parameters("fruit1")  
	public void mango(String f1)  
	{  
		System.out.println("Fruits names are:  ");  
		System.out.println(f1);  
	} 
	
	@Test  
	@Parameters("fruit2")  
	public void orange(String f2)  
	{  
		System.out.println(f2);  
	}  
}
