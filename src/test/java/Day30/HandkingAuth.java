package Day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandkingAuth {

	public static void main(String[] args) {

	     WebDriver driver = new EdgeDriver ();
	     //WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	    // Syntax for handling authorisation alerts 
	     // https://username:password@the-internet.herokuapp.com/basic_auth
	     driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	     driver.manage().window().maximize();
	   
	     String text=driver.findElement(By.xpath("//p[contains(text(),'Congratulations! You must have the proper credenti')]")).getText();
	     if (text.contains("Congratulations!"))
	     {        System.out.println("the validation is correct" );}
	     else 
	     {         System.out.println("the validation wrong  ");}
	     driver.quit();

}
}