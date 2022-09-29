package listenersTestNGDemo;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listenersTestNGDemo.listener.class) 
public class listenerTest1
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
