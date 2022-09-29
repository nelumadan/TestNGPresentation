package crossBrowserDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class verifyTitle
{
	WebDriver driver;
	
	@Test
	@Parameters("browser")
	public void verifyPageTitle(String browserName)
	{
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "/Users/Neelam/eclipse-workspace/TestNGPresentation/chromedriver");
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("safari"))
		{
			driver = new SafariDriver();
		}
		
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login");
		System.out.println("Title of the page is :" +driver.getTitle());
		driver.close();
	}
}
