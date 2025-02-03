package Day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class XpathDemo {
	
	public static void main (String args [])
	{
	  WebDriver driver = new ChromeDriver();
	  
      //ChromeOptions options = new ChromeOptions();
      // Disable the cookies consent banner
      // Launch Chrome in incognito mode
      //options.addArguments("--incognito");
      // Initialize the WebDriver with options
    //  WebDriver driver = new ChromeDriver();
     // driver.get("https://www.facebook.com");
	  driver.get("https://demo.nopcommerce.com/");
	  driver.manage().window().maximize();
	  //single attribut 
	 // driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Tshirt");
	  //multiple attribute 
	 // driver.findElement(By.xpath("//input[@id='small-searchterms'][@name='q']")).sendKeys("Tshirt");
	  //and/or attribute 
	 // driver.findElement(By.xpath("//input[@id='small-searchterms' or @name='b']")).sendKeys("Tshirt");
		//driver.findElement(By.xpath("//input[@id='small-searchterms' and @name='q']")).sendKeys("Tshirt");
	  
	  //Xpath  with  inner text 
	//	driver.findElement(By.xpath("//a[text ()='Build your own computer']")).click();
		//	driver.findElement(By.xpath("//*[text ()='Build your own computer']")).click();

	    String text=driver.findElement(By.xpath("//strong[text()='Featured products']")).getText();
    	System.out.println(text);

        if (text.equals("Featured products"))
        {
        	System.out.println("The expected string");
        }
        else
        {
        	System.out.println("The expected string is not macthing");

        }
        //Xpath with contains
	 //	driver.findElement(By.xpath("//select[contains (@id,'customer')]")).click();
	 	
        //Xpath with contains
	 	//driver.findElement(By.xpath("//select[starts-with (@id,'customer')]")).click();

	 	//Chained x path 
	 	driver.findElement(By.xpath("//div[@class='header-logo']/a/img"));
	}

}
