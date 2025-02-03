package Day28;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {

		WebDriver driver =  new ChromeDriver ();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("selenium");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		List<WebElement> mainContainerLinks = driver.findElements(By.xpath("//div[@id='wikipedia-search-result-link']//a"));
		//List<WebElement> searchlinks=driver.findElements(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']//div/a"));
	//	System.out.println("Number of Links:"+ searchlinks.size());

		List<WebElement> mainContainerLinksmore = driver.findElements(By.xpath("//div[@id='Wikipedia1_wikipedia-search-more']//a"));
        System.out.println(mainContainerLinks.size()+mainContainerLinksmore.size());
        
        List<WebElement> mainContainerLinksfinal = driver.findElements(By.xpath("//div[@id='wikipedia-search-result-link' or @id='Wikipedia1_wikipedia-search-more']//a"));
        System.out.println(mainContainerLinksfinal.size());
        
        for (WebElement link : mainContainerLinksfinal) {
        System.out.println("Clicking on: " + link.getText());
        link.click();
    }

      /*  for (WebElement link : mainContainerLinks) {
            System.out.println("Clicking on: " + link.getText());
            link.click();
        }
        for (WebElement link2 : mainContainerLinksmore) {
                System.out.println("Clicking on: " + link2.getText());
                link2.click();
            }*/
        
	}

}
