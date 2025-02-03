package Day21;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Day21Class {
	public static void main (String args [])
	{
		//ChromeDriver driver = new ChromeDriver();
       // System.setProperty("webdriver.chrome.driver", "C:\\Drivers_Selenium\\chromedriver-win64\\chromedriver.exe"); // Update with the correct path
	//	WebDriver driver = new ChromeDriver();
	 //   WebDriver driver = new EdgeDriver();
	    System.setProperty("webdriver.edge.driver", "C:\\Drivers_Selenium\\edgedriver_win64\\msedgedriver.exe");
		/*EdgeOptions options =new EdgeOptions();
		  options.addArguments("--start-maximized");
	        options.addArguments("--disable-blink-features=AutomationControlled");
	        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
	        options.setExperimentalOption("useAutomationExtension", false);
	        options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/115.0.0.0 Safari/537.36 Edg/115.0.0.0");*/
	    WebDriver driver1 = new EdgeDriver();
        //System.setProperty("webdriver.gecko.driver", "C:\\Drivers_Selenium\\geckodriver-v0.34.0-win-aarch64\\geckodriver.exe"); // Update the path
        //FirefoxOptions options = new FirefoxOptions();
        //options.addPreference("general.useragent.override","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/115.0.0.0 Safari/537.36");

       // WebDriver driver = new FirefoxDriver(options);

     // ChromeOptions options = new ChromeOptions();
     // options.setBinary("C:\\Users\\aamir\\AppData\\Local\\Chromium\\Application\\chrome.exe"); // Update with the correct path to Chromium
      //WebDriver driver = new ChromeDriver(options);

		driver1.get("https://bing.com/");
//		driver1.get("https://demo.nopcommerce.com/");


		String title=driver1.getTitle();
		System.out.println("Page Title: " + driver1.getTitle());
	   // driver.quit();
		if (title.contains("Microsoft Bing"))
		{
			System.out.println("test case passed");
		}
		else 
		{
			System.out.println("test case failed");
		}
		driver1.quit();
	}

}
