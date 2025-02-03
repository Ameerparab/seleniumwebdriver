package day32;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTable {

	public static void main (String args [])
	{
		WebDriver driver=new ChromeDriver ();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//find no of rows in table
		
		int row=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		
		System.out.println("the number of rows "+row);
		//find no of columns in table

		int col=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println("the number of rows "+col);

		//getting the date field from table 
		String dataField=driver.findElement(By.xpath("//table[@name='BookTable']//tr[2]//td[1]")).getText();
		System.out.println("the data is "+dataField);

		//reading hfull data from table
		
		for (int r=2; r<=row;r++)
		{
			for (int c=1; c<=col;c++)
			{
				String indField=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
			//	System.out.println("the data is "+indField);
				System.out.print(indField+"\t");
		}
			System.out.println();

		}
		
		// selecting specific data based on condition suppose needn to find books written bymukesh
		
		for (int r=2; r<=row;r++)
		{

				String auther=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
				
            if (auther.equals("Mukesh"))	
            {
				String bkName=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
				System.out.println(bkName +"\t"+auther );

            }

		}
		
	// counting tota; price for all books
		int total=0;
		for (int r=2; r<=row;r++)
		{

				String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
				System.out.println(price );
                total=total+Integer.parseInt(price);
		}
		System.out.println( "The total the number "+total );

	}
}
