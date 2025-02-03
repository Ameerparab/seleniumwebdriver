package day42;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeLogin {
	WebDriver driver;
	
  @Test (priority=1)
  public void loginApp() {
	  
	  driver=new ChromeDriver ();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
      driver.manage().window().maximize();
  }
  
  @Test (priority=2)
  public void logoVerify() {
      boolean statuslog=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
       // System.out.println("Logo is displayed"+statuslog); 	//div[@class='orangehrm-login-branding']  ////img[@alt='company-branding']	  
        if (statuslog==true)
        {
            System.out.println("Logo is displayed"); 		  

        }
        else
        {
            System.out.println("Logo is not displayed"); 		  

        }
      }
        
    @Test (priority=3)
    public void setuser(){
        	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
        }
      
    @Test (priority=4)
    public void setpass(){
    	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
       }
    @Test (priority=5)
    public void loginbut(){
    	driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

       }
    @Test (priority=6)
    public void verifylogin(){
       boolean logodis=	driver.findElement(By.xpath("//img[@alt='client brand banner']")).isDisplayed();
       if (logodis==true)
       {
           System.out.println("Logo is displayed inside login page"); 		  

       }
       else
       {
           System.out.println("Logo is not displayed  inside login page"); 		  

       }
       }
     
    @Test (priority=7)
    public void logout(){
    	driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
    	driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
       }
    @Test (priority=8)
    public void verifylogout(){
    	logoVerify ();
    	System.out.println("logout succsffuly");
       }
    
    @Test (priority=9)
    public void clsebrw(){
    	driver.quit();   
    	}
     
}
