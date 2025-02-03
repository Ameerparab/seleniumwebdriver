package Day36;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Silder {
	
	public static void main ( String args []) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver ();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		//mimimum slider
		Actions act=new Actions(driver);
		WebElement minslider=driver.findElement(By.xpath("//div[@id='slider-range']//span[1]"));
		//minslider.getLocation(); //
		System.out.println("before moving the slider "+minslider.getLocation()); //
		Thread.sleep(2000);
		act.dragAndDropBy(minslider, 100, 250).perform();
		System.out.println("after moving the slider "+minslider.getLocation());
		//maximimum slider
		WebElement maxslider=driver.findElement(By.xpath("//div[@id='slider-range']//span[2]"));
		//Thread.sleep(2000);
		System.out.println("before moving the slider "+	maxslider.getLocation());
		act.dragAndDropBy(maxslider, -100, 293).perform();
		System.out.println("after moving the slider "+	maxslider.getLocation());
		
	}

}
