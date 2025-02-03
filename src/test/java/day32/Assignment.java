package day32;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
         WebDriver driver=new EdgeDriver ();
         driver.get("https://blazedemo.com/");
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.manage().window().maximize();
         driver.findElement(By.xpath("//select[@name='fromPort']")).click();
         driver.findElement(By.xpath("//select[@name='fromPort']//option[@value='Paris']")).click();
         driver.findElement(By.xpath("//select[@name='toPort']")).click();
         driver.findElement(By.xpath("//select[@name='toPort']//option[@value='New York']")).click();
         driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
         
         WebElement fromto=driver.findElement(By.xpath("//h3[normalize-space()='Flights from Paris to New York:']"));
         System.out.println(fromto.getText());
         
         if(fromto.getText().contains("Paris"))
         {
        	 System.out.println("Eveything is correct");
         }
         
 		int row=driver.findElements(By.xpath("//table[@class='table']//tbody/tr")).size();
 		System.out.println("the number of rows "+row); 
        List<String> myList = new ArrayList<>();

     	 for (int r=1; r<=row;r++)
		 {

			String priceText =driver.findElement(By.xpath("//table[@class='table']//tbody/tr["+r+"]//td[6]")).getText();
           // double price = Double.parseDouble(priceText.replace("$", "")); // Remove "$" and convert to double

			//List<WebElement> prices = driver.findElements(By.xpath("//table[@class='table']//tbody/tr/td[6]"));

			System.out.println(priceText);
			//System.out.println(prices.toString());
			myList.add(priceText);
	     }
  		System.out.println("the number of rows "+myList);
  	     String minValue = Collections.min(myList);
         System.out.println("The minimum value in the list: " + minValue);
         int minIndex = myList.indexOf(minValue) + 1; // Adding 1 for table row (1-based index)
         System.out.println("Index of minimum value: Row " + minIndex);

  		//System.out.println(myList2.get(0));
  		//System.out.println("the number of rows "+myList);

         driver.findElement(By.xpath("//table[@class='table']//tbody/tr["+minIndex+"]/td[1]")).click();
         }

	
}