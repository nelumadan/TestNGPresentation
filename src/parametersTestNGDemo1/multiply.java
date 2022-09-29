package parametersTestNGDemo1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class multiply
{
	@Test  
	@Parameters({"a","b"})  
	public void product(int c, int d)  
	{  
		int product=c*d;  
		System.out.println("Product of two numbers : "+product);  
	}  
}
