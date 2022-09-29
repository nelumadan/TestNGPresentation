package listenersTestNGDemo;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class listenerTest2
{
	@Test  
	public void testToPass()  
	{  
		Assert.assertTrue(true);  
	} 
	
	@Test  
	public void testToFail()  
	{  
		Assert.assertTrue(false);  
	}  
	
	@Test
	public void testToSkip()
	{
		throw new SkipException("Skipping this exception");
	}
}
