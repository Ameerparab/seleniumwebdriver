package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver ();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		driver.manage().window().maximize();
		WebElement selectDrop=driver.findElement(By.xpath("//select[@id='country-list']"));
		Select selectDroLs =new Select(selectDrop);
		selectDroLs.selectByVisibleText("India");
		
		//count number of options
		List <WebElement> listConrty= selectDroLs.getOptions();
		System.out.println("the number of countries  are "+listConrty.size());
		
		//WebElement selectDrop=driver.findElement(By.xpath("//select[@id='country-list']"));

		WebElement selectDropSt=driver.findElement(By.xpath("//select[@id='state-list']"));
		Select selectDroLsSt =new Select(selectDropSt);
		List <WebElement> listSt= selectDroLsSt.getOptions();
		System.out.println("the number of ststes are "+listConrty.size());

		selectDroLsSt.selectByValue("21");
		
		driver.quit();
		
				//setup over
				
				
				
				//Handle drop downs without using 'select' class
				//****************************************************
		WebDriver driver2 = new ChromeDriver ();
		driver2.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver2.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		driver2.manage().window().maximize();
		
		driver2.findElement(By.xpath("//select//option[@value='3']")).click();
		
	   	List <WebElement> selectDrop2 = driver2.findElements(By.xpath("//select[@id='country-list']//option"));
		System.out.println(selectDrop2.size()); // Count number of countries

		driver2.findElement(By.xpath("//select[@name='state']//option[@value='15']")).click();
        driver2.quit();
		/*
				
				
				for(WebElement opt:country) // Select country
				{
					if(opt.getText().equals("France"))
					{
						opt.click();
							break;
					}
				}
				
				Thread.sleep(3000);
				
				//Now select state
				driver.findElement(By.id("state-list")).click(); //click on Select state drop down
				List<WebElement> states=driver.findElements(By.xpath("//select[@id='state-list']//option")); // capture all states
				
				System.out.println(states.size()); // Count number of states
				
				for(WebElement opt:states) // Select country
				{
					if(opt.getText().equals("Alsace"))
					{
						opt.click();
						break;
					}
				}
				*/
					
										
				
		
	


	}

}
