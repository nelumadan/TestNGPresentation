package annotationsHierarchyDemo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class hierarchyTest extends baseTest
{
	@Test
	 public void testCase1() {
	   System.out.println("TestCase"); 
	 }

	 @BeforeMethod
	 public void beforeMethod() {
	   System.out.println("BeforeMethod");
	 }
	 
	 @AfterMethod
	 public void afterMethod() {
	   System.out.println("AfterMethod");
	 }
	  
	 @BeforeTest
	 public void beforeTest() {
	   System.out.println("BeforeTest");
	 }
	 
	 @AfterTest
	 public void afterTest() {
	   System.out.println("AfterTest");
	 }
	 
}
