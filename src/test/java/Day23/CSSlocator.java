package Day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSSlocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
	  //  WebDriver driver1=new EdgeDriver();
		//WebDriver driver2=new FirefoxDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//by using just id
		//driver.findElement(By.id("small-searchterms")).sendKeys("T-Shirt");
					//by using tag and  id  CSS selector
	 	//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-Shirt");
				//by using tag and  id but tag is not displaying
	   //	driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-Shirt");	

	
		//by using tag and  class cssselector
	 	//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-Shirt");
		//by using tag and  class but tag is not displaying
	   //	driver.findElement(By.cssSelector(".search-box-text")).sendKeys("T-Shirt");
		
		//by using tag and  attribute cssselector
	 	//driver.findElement(By.cssSelector("input[placeholder=\"Search store\"]")).sendKeys("T-Shirt");
		//by using tag and  class and different way of putting the criteria
	 	//driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("T-Shirt");
		//by using tag and  class but tag is not displaying
	 //	driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("T-Shirt");
		
		//by using tag and  class and attribute  
	 	 driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("T-Shirt");
		//by using tag and  class and attribute  without tag
	     //driver.findElement(By.cssSelector(".search-box-text[name='q']")).sendKeys("T-Shirt");
		
	}

}
