package dataProviderDemo;

import org.testng.annotations.DataProvider;

public class DP
{
	@DataProvider (name = "data-provider")
    public Object[][] dpMethod()
	{
       return new Object[][] {{"Value Passed"},{"Value Failed"}};
    } 
}