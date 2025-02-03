package Day47;

import java.util.List;

import javax.lang.model.element.Element;
import javax.lang.model.util.Elements;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {
	WebDriver driver;
	//locator
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement txt_username;
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement txt_password;
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement log_butn;
	@FindBy(xpath="//img[@alt='company-branding']")
	WebElement mainpglogo;
	@FindBy(tagName="a")
	List<WebElement> link;

//Constructor
	LoginPageFactory (WebDriver driver) {
	this.driver=driver;
	 PageFactory.initElements(driver, this);
	}
	
    
	//Action
	   public void  username (String user)
	    {
		  txt_username.sendKeys(user);
	    }
	    
	     public void  password (String passwd)
	    {
	    	txt_password.sendKeys(passwd);
	    }
	    
	   public  void  login ()
	    {
	    	log_butn.click();
	    }
	   
		public WebElement getmainLogo () 
		{
			return mainpglogo;
		}

	   
	   public  void  test ()
	    {
	    	System.out.println(link.size());
	    }
}
