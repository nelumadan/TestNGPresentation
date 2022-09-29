package parametersTestNGDemo2;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class vegetables
{
	@Test  
	@Parameters("veg1")  
	public void c(String v1)  
	{  
		System.out.println("---------------------");
		System.out.println("Vegetable names are :");  
		System.out.println(v1);  
	}  
	
	@Test  
	@Parameters("veg2")  
	public void orange(String v2)  
	{  
		System.out.println(v2);  
	}  
}
