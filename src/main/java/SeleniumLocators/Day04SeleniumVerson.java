package SeleniumLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day04SeleniumVerson {
	
	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");

	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	
	}

}
