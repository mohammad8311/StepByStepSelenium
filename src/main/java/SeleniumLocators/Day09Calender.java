package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day09Calender {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#search.aspx?mode=search");
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@text='Bengaluru (BLR)']")).click();
		
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		
		for (int  i=0; i<3; i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click(); //4 times
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		

	}

}
