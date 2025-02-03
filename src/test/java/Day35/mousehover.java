package Day35;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class mousehover {
	
	public static void main (String args [])
	{
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		WebElement desktop=driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle'][normalize-space()='Desktops']"));
		WebElement mac=driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));;
		Actions act=new Actions(driver);
		//act.moveToElement(desktop).moveToElement(mac).build().perform();
		//		act.moveToElement(pc).moveToElement(mac).perform();
		act.moveToElement(desktop).moveToElement(mac).click().build().perform();

		//Action myaction=act.moveToElement(desktop).moveToElement(mac).build(); //.perform();
		//myaction.perform();

	}
}
