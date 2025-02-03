package Day30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HandlingFrames {
	
	public static void main (String args [])
	{
		WebDriver driver = new EdgeDriver ();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		//Frame 1
		WebElement frame1=driver.findElement(By.xpath("//frame[1][@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Welcome");
		
		driver.switchTo().defaultContent(); //switching back to default webpage
		//Frame 2
		WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("PO");
		driver.switchTo().defaultContent(); //switching back to default webpage

		//Frame 3 
		WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("AWO");
	
		 //switch to iframe  inside form
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']")).click();
		driver.findElement(By.xpath("//div[@id='i24']//div[@class='uHMk6b fsHoPb']")).click();
		//when need to come out directly do defaultcontent to come out to main page
		driver.switchTo().defaultContent(); //switching back to default webpage
		
		//frame 5
		WebElement frame5=driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
		driver.switchTo().frame(frame5);
		driver.findElement(By.xpath("(//input[@name='mytext5'])[1]")).sendKeys("5place");
		driver.findElement(By.cssSelector("a[href='https://a9t9.com']")).click();  //through css selector clciking a link
		driver.switchTo().defaultContent(); //switching back to default webpage
		driver.switchTo().frame(frame5);
		//System.out.println("You open the link");
		boolean logoDis= driver.findElement(By.xpath("//a[@id='logo']")).isDisplayed();  //through css selector clciking a link
        if (logoDis == true)
        { 
    		System.out.println("Logo is present");
        }
        else
        {    System.out.println("Logo is absent");
        }
        driver.quit();
	}

}
