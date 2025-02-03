package Day27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sleep {
	
	public static void main ( String args []) {
	
	  WebDriver driver =new ChromeDriver ();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    driver.manage().window().maximize();
	  try {
		Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");

	    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	   
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	//	
		
	
	}
}
}