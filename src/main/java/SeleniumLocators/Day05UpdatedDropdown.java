package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day05UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.xpath("//div[text()='1 Adult']")).click();
		Thread.sleep(2000L);
		
		int i=1;
		while(i<5)
		{
			
			driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click(); //4 times
			i++;
		}
		
		
		for (i=0; i<3; i++)
		{
			driver.findElement(By.xpath("//div[@data-testid='Children-testID-plus-one-cta']")).click(); //4 times
		}
		
		
		driver.findElement(By.xpath("//div[@data-testid='home-page-travellers-done-cta']/div[2]")).click();
		

	}

}
