package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day11HandleAlertPopup {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		String nameText = "Mohammad";
		
		driver.findElement(By.id("name")).sendKeys(nameText);
		driver.findElement(By.id("alertbtn")).click();
		
		String alertText = driver.switchTo().alert().getText();
		System.out.println(alertText); 
		driver.switchTo().alert().accept();
		
		driver.findElement(By.id("confirmbtn")).click();
		String alertText2 = driver.switchTo().alert().getText();
		System.out.println(alertText2); 
		driver.switchTo().alert().dismiss();

	}

}
