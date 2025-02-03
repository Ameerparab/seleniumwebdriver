package Day29;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ceckbox {

	public static void main(String[] args) {
		WebDriver driver =  new ChromeDriver ();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
        
		WebElement checkbox = driver.findElement(By.xpath("//label[normalize-space()='Sunday']"));
		boolean checkboxstatus = driver.findElement(By.xpath("//label[normalize-space()='Sunday']")).isEnabled();
		System.out.println(checkboxstatus);
		if (checkboxstatus==true)
		{
			System.out.println("Not check in");
	        checkbox.click();

		}
		else
		{
			System.out.println("Already check in");

		}
        checkbox.click();  //uncheck
		List<WebElement> Lcheckbox = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		int noLcheckbox=Lcheckbox.size();
		System.out.println("How many checkboxes" +Lcheckbox.size());
        //checking all boxes at one time with tradinoal for loop
		for (int i=0; i< Lcheckbox.size() ; i++)
		{
			Lcheckbox.get(i).click();
		}
		//unchecking with enhanced  for loop
		for (WebElement lck:Lcheckbox)
		{
			lck.click();
		}
        //checking last 3  boxes at one time with tradinoal for loop
		for (int i=6; i >= noLcheckbox-3 ; i--)
		{
			Lcheckbox.get(i).click();
		}	
        //unchecking last 3  boxes at one time with tradinoal for loop

		for (int i=6; i >= noLcheckbox-3 ; i--)
		{
			Lcheckbox.get(i).click();
		}	
		
        //checking randomly boxes at one time with tradinoal for loop

		for (int i=0; i < noLcheckbox ; i++)
		{
			if (i==1 || i==2 || i==6)
			Lcheckbox.get(i).click();
		}	
		
        //unchecking randomly  boxes at one time with tradinoal for loop

		for (int i=0; i < noLcheckbox ; i++)
		{
			if (i==1 || i==2 || i==6)
			Lcheckbox.get(i).click();
		}	
		
        //checking boxes using labels  randomly  boxes at one time with tradinoal for loop

		String Weekday="Sunday";
		switch (Weekday)
		{
		case "Sunday": driver.findElement(By.xpath("//input[@id='sunday']")).click();
		               break;
		case "Friday": driver.findElement(By.xpath("//input[@id='friday']")).click();
                        break;
		default : System.out.println("invalid weekday");
		}     
		
		//checking radio box
	//	WebElement mailrd= driver.findElement(By.xpath("//label[normalize-space()='Male']"));
		//if ()
		{
		driver.findElement(By.xpath("//input[@type='radio' and @id='male']")).click();
		}
	}

}
