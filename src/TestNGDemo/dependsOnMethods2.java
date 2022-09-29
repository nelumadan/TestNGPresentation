package TestNGDemo;

import org.testng.annotations.Test;

public class dependsOnMethods2
{
	@Test(dependsOnMethods= {"testcase3","testcase2"})  
	 public void testcase1()  
	 {  
	     System.out.println("This is test case1");  
	 }  
	 @Test  
	 public void testcase2()  
	 {  
	     System.out.println("This is test case2");  
	 }  
	 @Test  
	 public void testcase3()  
	 {  
	     System.out.println("This is test case3");  
	 }  
}
/*
 * In the above code, testcase1() is dependent on two methods, i.e., testcase2()
 * and testcase3(), which means that these two methods will be executed before
 * the testcase1().
 */