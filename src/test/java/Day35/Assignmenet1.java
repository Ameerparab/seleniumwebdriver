package Day35;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignmenet1 {
	public static void main (String args []) throws InterruptedException
	{
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();

		WebElement srcDebCred1=driver.findElement(By.xpath("//a[normalize-space()='BANK']"));
		WebElement targeDebCred1=driver.findElement(By.xpath("//ol[@id='bank']//li[@class='placeholder']"));
		Thread.sleep(2000);

		WebElement srcAmtDeb2=driver.findElement(By.xpath("//section[@id='g-container-main']//li[4]//a[1]"));
		WebElement targetAmtDeb2=driver.findElement(By.xpath("//ol[@id='amt7']//li[@class='placeholder']"));
		Thread.sleep(2000);

		WebElement srcAccCred3=driver.findElement(By.xpath("//a[normalize-space()='SALES']"));
		WebElement targeAccCred3=driver.findElement(By.xpath("//ol[@id='loan']//li[@class='placeholder']"));
		Thread.sleep(2000);

		WebElement srcAmtCred4=driver.findElement(By.xpath("//section[@id='g-container-main']//li[2]//a[1]"));
		WebElement targetAmtCred4=driver.findElement(By.xpath("//ol[@id='amt8']//li[@class='placeholder']"));
		Thread.sleep(2000);

		Actions act=new Actions(driver);
		act.dragAndDrop(srcDebCred1, targeDebCred1).perform();
		act.dragAndDrop(srcAmtDeb2, targetAmtDeb2).perform();
		act.dragAndDrop(srcAccCred3, targeAccCred3).perform();
		act.dragAndDrop(srcAmtCred4, targetAmtCred4).perform();
		boolean Perfect=driver.findElement(By.xpath("//a[normalize-space()='Perfect!']")).isDisplayed();
		String Perfect2=driver.findElement(By.xpath("//a[normalize-space()='Perfect!']")).getText();

		System.out.println(Perfect2);

		if (Perfect== true)
		{
			System.out.println("Correct");
		}
			
		if (Perfect2.contains("!"))
		{
			System.out.println("Correct");
		}
		else
		{
			System.out.println("wrong");

		}
		//act.moveToElement(desktop).moveToElement(mac).build().perform();
		//		act.moveToElement(pc).moveToElement(mac).perform();
		//act.moveToElement(desktop).moveToElement(mac).click().build().perform();

		//Action myaction=act.moveToElement(desktop).moveToElement(mac).build(); //.perform();
		//myaction.perform();

	}

}
