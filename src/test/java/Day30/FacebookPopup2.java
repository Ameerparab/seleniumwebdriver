package Day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FacebookPopup2 {

	public static void main(String[] args) {

     WebDriver driver = new EdgeDriver ();
     driver.get("https://facebook.com");
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     JavascriptExecutor js = (JavascriptExecutor) driver;
     WebElement shadowHost = driver.findElement(By.cssSelector("shadow-host-selector"));
     WebElement shadowRoot = (WebElement) js.executeScript("return arguments[0].shadowRoot", shadowHost);
     WebElement allowCookiesButton = shadowRoot.findElement(By.cssSelector("button-selector"));
     allowCookiesButton.click();
	}

}
