package day33;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicpage {
	
	public static void main (String args []) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver ();
		driver.get("https://demo.opencart.com/admin/index.php?route=common/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		
		String s="Showing 1 to 10 of 14673 (1468444 Pages)";
		String a= s.substring(s.indexOf("(")+1,s.indexOf("Pages")-1);
		int b=Integer.parseInt(a);
		System.out.println(s);
		System.out.println(a);

		
		/*WebElement uname= driver.findElement(By.xpath("//input[@id='input-username']"));
		uname.clear();
		uname.sendKeys("demo");
		WebElement passwd= driver.findElement(By.xpath("//input[@id='input-username']"));
		passwd.clear();
		passwd.sendKeys("demo");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		Thread.sleep(10000);

        driver.findElement(By.xpath("//a[@class='parent']")).click();
        driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();*/
         //xpath for //div[contains(text(),'Pages)')]
		//ul[@class='pagination']//*[text()=1]
		//ul[@class='pagination']//li["+variable+"]
	}

}
