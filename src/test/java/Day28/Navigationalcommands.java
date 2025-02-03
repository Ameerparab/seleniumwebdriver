package Day28;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Navigationalcommands {

	public static void main(String[] args) throws MalformedURLException {
		
		//with get  method
         WebDriver driver =new EdgeDriver ();
         driver.get("https:/bing.com");
         
         //with navigate and using object url format
         URL myurl=new URL("https://google.com");
         driver.navigate().to(myurl);
		
         //with navigate and using object url format
         driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
         System.out.println(driver.getCurrentUrl());
         
         //with  backward
         driver.navigate().back();
         System.out.println(driver.getCurrentUrl());
          
         //with forward 
         driver.navigate().forward();
         System.out.println(driver.getCurrentUrl());
         
         // with refresh
         driver.navigate().refresh();

	}



}
