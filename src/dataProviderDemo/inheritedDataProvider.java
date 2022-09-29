package dataProviderDemo;

import org.testng.annotations.Test;

public class inheritedDataProvider
{
	@Test (dataProvider = "data-provider", dataProviderClass = DP.class)
    public void myTest (String val)
	{
      System.out.println("Current Status : " + val);
    }
}

/*
 * Since I told this method that my dataprovider class is DP.class, I will create
 * another file DP.java and write my dataprovider code there.
 */

//Run the test file and see if the output is "Value Passed" or not.