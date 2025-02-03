package Day47;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPageFactory {
	
	WebDriver  driver;
	//locator

	 @FindBy(xpath="//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")
	 WebElement dropdown;
	 @FindBy(xpath="//a[normalize-space()='Logout']")
     WebElement logout;
	 @FindBy(xpath="//img[@alt='client brand banner']")
	 WebElement accountlogo;
	//constructor 
	AccountPageFactory (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	 //Action
	public void selectDropdwn()
	{
		dropdown.click();
	}
	
	public void logout()
	{
		logout.click();
	}
	public WebElement getAccountLogo () 
	{
		return accountlogo;
		
	}


}
