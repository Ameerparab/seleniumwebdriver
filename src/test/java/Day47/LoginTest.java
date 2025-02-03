package Day47;

import java.time.Duration;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class LoginTest {
     
	 WebDriver driver;
	
	@BeforeClass
	 void Setup ()
	{
		
		driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	
	/*
	@Test 
	public void verifyorangHRM()
	{
	    LoginPage lppage= new LoginPage(driver);
        WebElement logo = driver.findElement(lppage.mainlogoverify()); // Locate the logo
    	System.out.println("this is inside LoginTest");
    	System.out.println(logo);

        Assert.assertTrue("Logo is disaplyed", logo.isDisplayed());
	}*/
	
	@Test (priority=0)
	void verifymainlogo () throws InterruptedException
	{
	   // LoginPage lppage= new LoginPage(driver);
		Thread.sleep(5000);
	    LoginPageFactory lppage= new LoginPageFactory (driver);
	    
		WebElement mainLogo = lppage.getmainLogo();

	    // Perform actions on the WebElement (e.g., validation)
	    Assert.assertTrue( "Main Account logo is displayed.",mainLogo.isDisplayed());
        Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}


	@Test (priority=1)
	void loginpage ()
	{
	   // LoginPage lppage= new LoginPage(driver);
	    LoginPageFactory lppage= new LoginPageFactory (driver);
        lppage.username("admin");
        lppage.password("admin123");
        lppage.login();
        lppage.test();
	}

	@Test (priority=2)
	void accountPage ()
	{
		AccountPageFactory acpage= new AccountPageFactory (driver);
	    
		WebElement accountLogo = acpage.getAccountLogo();

		    // Perform actions on the WebElement (e.g., validation)
		 Assert.assertTrue( "Account logo is displayed",accountLogo.isDisplayed());
	     Assert.assertEquals(driver.getTitle(), "OrangeHRM");

		 acpage.selectDropdwn();
         acpage.logout();

	}


	@AfterClass
	 void Teardown ()
	{
		driver.quit();
	} 
	
	//this is for running through Java 
	/*public static void main (String args [])
	{
		LoginTest lgntest=new LoginTest();
	      try {
	    	  lgntest.Setup();       // Step 1: Setup the WebDriver
	    	  lgntest.testlogin();   // Step 2: Execute the login test
	        } finally {
	        	lgntest.Teardown();    // Step 3: Cleanup
	        }

	}*/

}
