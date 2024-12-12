package SeleniumLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01Locators {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		WebElement userName = driver.findElement(By.id("inputUsername"));
		WebElement password = driver.findElement(By.name("inputPassword"));
		WebElement submitButton = driver.findElement(By.className("signInBtn"));
		
		userName.sendKeys("didar");
		password.sendKeys("12345");
		submitButton.click();
		
		//Thread.sleep(1000);
		String errorMsg = driver.findElement(By.cssSelector("p.error")).getText();
		System.out.println("The error message is: " +  errorMsg);
		
		WebElement forgotPassword = driver.findElement(By.linkText("Forgot your password?"));
		
		forgotPassword.click();
		
		System.out.println("Form title: " + driver.findElement(By.xpath("//form/h2")));
		WebElement name = driver.findElement(By.xpath("//input[@placeholder='Name']"));
		WebElement email = driver.findElement(By.cssSelector("input[placeholder='Email']"));
		WebElement phoneNumber = driver.findElement(By.xpath("//input[@type='text'][3]"));
		//WebElement phoneNumber = driver.findElement(By.cssSelector("input[type='text']:nth-child(3)"));
		WebElement resetButton = driver.findElement(By.cssSelector(".reset-pwd-btn"));
		
		
		name.sendKeys("Mohammad");
		name.clear();
		name.sendKeys("Mohammad Didarul Alam");
		email.sendKeys("didar@gmail.com");
		phoneNumber.sendKeys("018363764272");
		resetButton.click();
		
		
		
		
		
		
		
		
		
		
	}

}
