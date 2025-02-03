package Day47;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	WebDriver driver;
	
	//constructor
	LoginPage (WebDriver driver)
	{
		this.driver=driver;
	}
		
	//Locators 
	
    By txt_username_loc=By.xpath("//input[@placeholder='Username']");
    By txt_password_loc=By.xpath("//input[@placeholder='Password']");
    By btn_login_loc=By.xpath("//button[normalize-space()='Login']");
    By mainpag_Logo=By.xpath("//img[@alt='company-branding']");
  /*  By account_Logo=By.xpath(" //img[@alt='client brand banner']");
    By account_dwn=By.xpath("//span[@class='oxd-userdropdown-tab']");
    By account_logout =By.xpath("//a[normalize-space()='Logout']");  */

    //Action

    public void  username (String user)
    {
    	driver.findElement(txt_username_loc).sendKeys(user);
    }
    
    public void  password (String passwd)
    {
    	driver.findElement(txt_password_loc).sendKeys(passwd);
    }
    
    public void  login ()
    {
    	driver.findElement(btn_login_loc).click();
    }
    
   /* public WebElement mainlogoverify ()
    {  
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	System.out.println("this is inside LoginPage");
        return wait.until(ExpectedConditions.visibilityOfElementLocated(mainpag_Logo));
    	//return mainpag_Logo;

    }*/
    
    /*
    public By accountlogoverify ()
    {  
    	return account_Logo;
    }
    
    public By [] accountdropdwn ()
    {  
        return new By[] { account_dwn, account_logout };  // Return array of By locators
    }
       */
}
