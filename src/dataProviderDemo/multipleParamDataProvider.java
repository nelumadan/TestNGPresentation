package dataProviderDemo;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class multipleParamDataProvider
{
	@DataProvider (name = "data-provider")
	public Object[][] dpMethod()
	{
		return new Object[][] {{2, 3 , 5}, {5, 7, 9}};
	}
	
      @Test (dataProvider = "data-provider")
      public void myTest (int a, int b, int result)
      {
	     int sum = a + b;
	     Assert.assertEquals(result, sum);
      }
}

//In the above code, I have passed three values a,b and result to check if the sum is equal to result or not.