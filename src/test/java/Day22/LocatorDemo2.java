package Day22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo2 {

	public static void main(String[] args) {
        WebDriver driver1=new ChromeDriver (); 

		try {
		// TODO Auto-generated method stub
		driver1.get("https://demoblaze.com/index.html");
		

       // WebDriverWait wait = new WebDriverWait(driver1, Duration.ofSeconds(20));
        //WebElement desktopsLink = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Desktops")));
        //desktopsLink.click();
	  //link text and partial link text  for using only links  	 
		driver1.findElement(By.linkText("Laptops")).click();
		Thread.sleep(5000);
		driver1.findElement(By.partialLinkText("tors")).click();

		Thread.sleep(5000);
		List<WebElement> classname1=driver1.findElements(By.className("list-group-item"));
		System.out.println(classname1.size());
		//System.out.println(classname1);
		
		Thread.sleep(5000);
		List<WebElement> tag1=driver1.findElements(By.tagName("a"));
		System.out.println(tag1.size());
		
		Thread.sleep(5000);
		List<WebElement> tag2=driver1.findElements(By.tagName("img"));
		System.out.println(tag2.size());
		
       /* WebElement contactUsLink = Wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Contact Us")));
        ((JavascriptExecutor) driver1).executeScript("arguments[0].scrollIntoView(true);", contactUsLink);
        contactUsLink = wait.until(ExpectedConditions.elementToBeClickable(contactUsLink));
        contactUsLink.click();  */
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			driver1.quit();
        }
		
	}
}
