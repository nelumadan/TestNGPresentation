package TestNGDemo;

import org.testng.annotations.Test;

public class disableTest
{
	@Test(enabled=false)
	public void WebLoginPersonalLoan()// First test case.
	{
		System.out.println("WebLoginPersonalLoan");
	}
	
	@Test
	public void MobileLoginHomeLoan()// Second test case.
	{
		System.out.println("MobileLoginHomeLoan");
	}
}
