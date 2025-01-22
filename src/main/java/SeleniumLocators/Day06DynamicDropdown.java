package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day06DynamicDropdown {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		//div[text()='Chennai']
		//div[text()='BLR']
		
		driver.findElement(By.xpath("//div[text()='From']")).click();
		driver.findElement(By.xpath("//div[text()='Chennai']")).click();
		driver.findElement(By.xpath("//div[text()='BLR']")).click();
		
		// Parent-Child Xpath: //div[@class='css-1dbjc4n'] //div[text()='Chennai'] = Parent: //div[@class='css-1dbjc4n'] and Child: //div[text()='Chennai']
		//driver.findElement(By.xpath("//div[@class='css-1dbjc4n'] //div[text()='Chennai']")).click();

	}

}
