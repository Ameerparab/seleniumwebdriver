package Day27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitwait {
	
	public static void main ( String args []) {
	
	  // WebDriver driver =new ChromeDriver ();
		//get url
    //  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    //  driver.manage().window().maximize();
	//  try {
	//	Thread.sleep(5000);
	//    driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");

	 //   driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
     //   driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	 //   
	//} catch (InterruptedException e) {
		// TODO Auto-generated catch block
	//	e.printStackTrace();
	//	
		
	  WebDriver driver =new ChromeDriver ();
			//get implicit wait
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().window().maximize();
      driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	  driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();		
	}
}
