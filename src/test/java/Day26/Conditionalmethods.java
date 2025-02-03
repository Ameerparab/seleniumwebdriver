package Day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Conditionalmethods {

	public static void main (String args []) throws InterruptedException
	{
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.nopcommerce.com/");
	driver.manage().window().maximize();
	
	//isDiaplayed
	
	WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
    System.out.println(logo.isDisplayed());
    
    //second approach
    boolean logo1= driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
    System.out.println(logo1);

    //isEnabled
    
	WebElement txt=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
    System.out.println(txt.isEnabled());
    
    //   is Selected
    driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
    Thread.sleep(5000);
    WebElement malerd=driver.findElement(By.xpath("//input[@id='gender-male']"));
    WebElement femalerd=driver.findElement(By.xpath("//input[@id='gender-male']"));
    System.out.println("the raidio male button" +malerd.isSelected()); 
    System.out.println("the raidio female button" +femalerd.isSelected()); 
    driver.findElement(By.xpath("//input[@id='gender-male']")).click();
    System.out.println("the raidio male button" +malerd.isSelected()); 
	driver.quit();

	}
	
}
