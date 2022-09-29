package reportsTestNGDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class reportTestNG
{
	WebDriver driver ;
    @Test
    public void googleTitle()
    {
	   String baseUrl = "https://www.google.com/";
	   System.out.println("Launching Google Chrome browser"); 
	   driver = new ChromeDriver();
	   driver.get(baseUrl);
	  
	   Reporter.log("We used Google Chrome Ver 80 for this test");
	   
	   String testTitle = "GOOGLE";
	   String Title = driver.getTitle();
	   System.out.println("Title of the page: " +Title);
	   Assert.assertEquals(Title, testTitle);
   }
	
   @BeforeMethod
    public void beforeMethod()
   {
	System.out.println("Starting Test On Chrome Browser");
    }
	
    @AfterMethod
     public void afterMethod()
    {
	 driver.close();
	 System.out.println("Finished Test On Chrome Browser");
    }
}
