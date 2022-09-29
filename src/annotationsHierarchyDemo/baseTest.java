package annotationsHierarchyDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class baseTest
{
	@BeforeClass
	 public void beforeClass() {
	   System.out.println("BeforeClass");
	 }
	 
	 @AfterClass
	 public void afterClass() {
	   System.out.println("AfterClass");
	 }
	 
	 @BeforeSuite
	 public void beforeSuite() {
	   System.out.println("BeforeSuite");
	 }
	 
	 @AfterSuite
	 public void afterSuite() {
	   System.out.println("AfterSuite");
	 }
}
