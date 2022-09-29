package parametersTestNGDemo1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class subtract
{
	@Test  
	@Parameters({"a","b"})  
	public void difference(int c, int d)  
	{  
		int difference=c-d;  
		System.out.println("Difference between two numbers : "+difference);  
	}  
}
