package SeleniumLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day03Locators {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		// Sibling - Child to parent traverse
		//header/div/button[1]/following-sibling::button[1]
		
		driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).click();
		driver.findElement(By.xpath("//header/div/button[1]/parent::div/parent::header/a")).click(); 

	}


}
