package Day30;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingAlrts {

	public static void main(String[] args) {

     WebDriver driver = new EdgeDriver ();
     driver.get("https://the-internet.herokuapp.com/javascript_alerts");
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
     Alert alertExample=driver.switchTo().alert();
     alertExample.accept();
         //    or  above two stament into single stament 
     //driver.switchTo().alert().accept();
     
     //canceling the alert
     driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
     driver.switchTo().alert().dismiss();
     
     //accepting  the alert
     driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
     driver.switchTo().alert().accept();

     //propmting and sending data  the alert
     driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
     Alert alertexam2= driver.switchTo().alert();
     String abc=alertexam2.getText();
     System.out.println("the captire mesaage is "+abc);
     alertexam2.sendKeys("welcome");
     
     alertexam2.accept();
     
     String abcd= driver.findElement(By.xpath("//p[@id='result']")).getText();
     System.out.println("the enterted mesaage is "+abcd);

     if (abcd.contains(": welcome"))
     {
         System.out.println("the validation is correct" );
     }
     else
     {
         System.out.println("the validation wrong  ");

     }
	
     WebDriver driver2 = new EdgeDriver ();
     driver2.get("https://mail.rediff.com/cgi-bin/login.cgi");
     driver2.manage().window().maximize();
     driver2.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     driver2.findElement(By.xpath("//input[@title='Sign in']")).click();
    // WebDriverWait wait=  new WebDriverWait(driver2, Duration.ofSeconds(10));
     //wait.until(ExpectedConditions.alertIsPresent());
     Alert alertExamp=driver2.switchTo().alert();
     alertExamp.accept();
	 driver.quit();
	 driver2.quit();
     System.out.println("the Test case is complete" );

	}

}
