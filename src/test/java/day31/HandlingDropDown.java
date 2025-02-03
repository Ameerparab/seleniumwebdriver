package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		//select Drop down
 
		WebDriver driver = new ChromeDriver ();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement selectDrop=driver.findElement(By.xpath("//select[@id='country']"));
		Select selectDroLs =new Select(selectDrop);
		
		selectDroLs.selectByContainsVisibleText("Ch");
		//Thread.sleep(2000);
		selectDroLs.selectByIndex(2);
		//Thread.sleep(2000);
		selectDroLs.selectByValue("brazil");

		//capturing oprtions from dropdown
		List <WebElement> options   =selectDroLs.getOptions();
		System.out.println(" the list count is "+options.size());
		
		for (WebElement counntls:options)
		{
			System.out.println(" the country is "+counntls.getText());

		}
        driver.quit(); 
        
        
        //Hidden Drop down
		WebDriver driver2 = new ChromeDriver ();
		WebDriverWait wait= new WebDriverWait(driver2, Duration.ofSeconds(10));
		driver2.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver2.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver2.manage().window().maximize();
		
	    driver2.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
	    driver2.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	    driver2.findElement(By.cssSelector("button[type='submit']")).click();
        driver2.findElement(By.xpath("//span[normalize-space()='PIM']")).click();
        //wait.until(ExpectedConditions.)
        driver2.findElement(By.xpath("//body/div[@id='app']/div[@class='oxd-layout orangehrm-upgrade-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='oxd-table-filter']/div[@class='oxd-table-filter-area']/form[@class='oxd-form']/div[@class='oxd-form-row']/div[@class='oxd-grid-4 orangehrm-full-width-grid']/div[6]/div[1]/div[2]/div[1]/div[1]")).click();
        Thread.sleep(10000);

        //selecting a element from list
        //driver2.findElement(By.xpath("//span[normalize-space()='Customer Success Manager']")).click();

        //count number of options
        List <WebElement> noofelemnt= driver2.findElements(By.xpath("//div[@role='listbox']//span"));
        System.out.println("noofelement are "+noofelemnt.size());

        for (int i=0; i < noofelemnt.size(); i++)
        {
            System.out.println("list of elements are "+noofelemnt.get(i).getText());
        }
        
        for (WebElement option:noofelemnt)
        {
            System.out.println("new list of elements are "+option.getText());

        }
	}

}
