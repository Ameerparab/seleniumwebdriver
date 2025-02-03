package Day28;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swtichcommand {

	public static void main(String[] args) {

		WebDriver driver =new ChromeDriver ();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		driver.manage().window().maximize();
		Set <String> windowsID= driver.getWindowHandles();   // this is set of type string
		System.out.println(windowsID);
		List <String> windowsLID =new ArrayList (windowsID);  //converting from Set to List 
		System.out.println(windowsLID);
		System.out.println(windowsLID.get(0));
		System.out.println(windowsLID.get(1));
		String window0=windowsLID.get(0);
		String window1=windowsLID.get(1);
		System.out.println(driver.getTitle());
        driver.switchTo().window(window1);
		System.out.println(driver.getTitle());
        driver.switchTo().window(window0);
		System.out.println(driver.getTitle());
		
		for ( String winID:windowsID)
		{
			driver.switchTo().window(winID);
			if (driver.getTitle().equals("OrangeHRM"))
			{
				System.out.println(driver.getTitle());
				driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
				driver.close(); //closing to specfifc url 
			}
		}

	}

}
