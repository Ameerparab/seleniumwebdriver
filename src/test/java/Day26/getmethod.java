package Day26;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getmethod {
	public static void main (String args []) throws InterruptedException
	{
	   WebDriver driver =new ChromeDriver ();
		//get url
       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   Thread.sleep(5000);

       String title =driver.getTitle();
       System.out.println(title);
       System.out.println(driver.getCurrentUrl());
       System.out.println(driver.getWindowHandle());
       driver.findElement(By.linkText("OrangeHRM, Inc")).click();
       Set <String> windowss = driver.getWindowHandles();
     //  List <String> windowsl = (List<String>) driver.getWindowHandles();
       System.out.println(windowss);
       List<String> windowsList = new ArrayList<>(windowss);

       System.out.println(windowsList);

       System.out.println(driver.getWindowHandles());
       
      // driver.quit();
       for (int i=0; i < windowsList.size(); i++)
       {
    	   System.out.println(windowsList.get(i));
    	   driver.switchTo().window(windowsList.get(i));
       }
       driver.quit();
	}
}
