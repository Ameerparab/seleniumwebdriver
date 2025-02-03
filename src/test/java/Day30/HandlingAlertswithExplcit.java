package Day30;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingAlertswithExplcit {

	public static void main(String[] args) {

     WebDriver driver = new EdgeDriver ();
     WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
     driver.get("https://the-internet.herokuapp.com/javascript_alerts");
     driver.manage().window().maximize();
     driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();

     Alert alert1=wait.until(ExpectedConditions.alertIsPresent());


     //propmting and sending data  the alert
    // Alert alertexam2= driver.switchTo().alert();
    
     String abc=alert1.getText();
     System.out.println("the captire mesaage is "+abc);
     alert1.sendKeys("welcome");
     
     alert1.accept();
     
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
     driver.close();
	}

}
