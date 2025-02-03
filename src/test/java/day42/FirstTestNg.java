package day42;

import org.testng.annotations.Test;

public class FirstTestNg {
	
	@Test (priority=1)
	void openapp()
	{
		System.out.println("this is first open app" );
	}
	
	@Test (priority=2)
	void runtest ()
	{
		System.out.println("this is running  app" );
	}
	@Test (priority=3)
	void closeapp ()
	{
		System.out.println("this is closing  app" );
	}

}
