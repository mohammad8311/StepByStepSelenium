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
		WebElement checkBox01 = driver.findElement(By.id("chkboxOne"));
		WebElement checkBox02 = driver.findElement(By.id("chkboxTwo"));
		WebElement submitButton = driver.findElement(By.className("signInBtn"));
		
		userName.sendKeys("didar");
		password.sendKeys("12345");
		checkBox01.click();
		submitButton.click();
		
		//Thread.sleep(1000);
		String errorMsg = driver.findElement(By.cssSelector("p.error")).getText();
		System.out.println("The error message is: " +  errorMsg);
		
		WebElement forgotPassword = driver.findElement(By.linkText("Forgot your password?"));
		
		forgotPassword.click();
		
		
		String titleName = driver.findElement(By.xpath("//div/form/h2")).getText();
		System.out.println(titleName);
		WebElement name = driver.findElement(By.xpath("//input[@placeholder='Name']"));
		WebElement email = driver.findElement(By.cssSelector("input[placeholder='Email']"));
		
		WebElement phoneNumber = driver.findElement(By.xpath("//input[@type='text'][3]"));
		//WebElement phoneNumber = driver.findElement(By.cssSelector("input[type='text']:nth-child(3)"));
		
		//WebElement resetButton = driver.findElement(By.cssSelector(".reset-pwd-btn"));
		WebElement resetButton = driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[2]"));
		
		//WebElement goToLogin = driver.findElement(By.cssSelector(".go-to-login-btn"));
		WebElement goToLogin = driver.findElement(By.xpath("//button[contains(@class, 'login')]")); 
		
		//WebElement password1 = driver.findElement(By.cssSelector("input[type*=pass]"));
		
		
		
		name.sendKeys("Mohammad");
		name.clear();
		name.sendKeys("Mohammad Didarul Alam");
		email.sendKeys("didar@gmail.com");
		phoneNumber.sendKeys("018363764272");
		resetButton.click();
		goToLogin.click();
		
		userName.sendKeys("didar");
		password.sendKeys("rahulshettyacademy");
		//checkBox01.click();
		checkBox02.click();
		submitButton.click();
		//logout.click();
		
		
		
		
	}
	


}
