package TestNGDemo;

import org.testng.annotations.Test;

public class multipleTest
{
	@Test(description="This is testcase1") 
	public void WebLoginPersonalLoan()// First test case.
	{
		System.out.println("WebLoginPersonalLoan");
	}
	
	@Test(description="This is testcase2") 
	public void MobileLoginHomeLoan()// Second test case.
	{
		System.out.println("MobileLoginHomeLoan");
	}
}
