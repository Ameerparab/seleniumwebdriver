package Day30;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class GooglePopup {

	public static void main(String[] args) {

     WebDriver driver = new EdgeDriver ();
     driver.get("https://google.com");
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     WebElement rejectAllButton = driver.findElement(By.xpath("//button//div[text()='Reject all']"));
     rejectAllButton.click();
     WebElement search=driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
     search.sendKeys("Selenium",Keys.ENTER);
   /*  
     List <WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
		////div//ul[@role='listbox']//li
		
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().equals("selenium"))
			{
				list.get(i).click();
				break;
			}
		}

     */
	}

}
