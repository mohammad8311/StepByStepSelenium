package SeleniumLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;



public class Day02Locators {

	public static void main(String[] args) throws InterruptedException {

		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String password = getPassword(driver);
		String name = "didar";
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.id("chkboxTwo")).click();
		driver.findElement(By.className("signInBtn")).click();

		
		Thread.sleep(2000);
		String getName = driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText();
		System.out.println(getName);
		
		String loginStatus = driver.findElement(By.tagName("p")).getText();
		System.out.println("The login status is: " + loginStatus);
		
		
		//Assert.assertEquals(getName, "Hello didar,");
		Assert.assertEquals(getName, "Hello "+name+",");
		Assert.assertEquals(loginStatus, "You are successfully logged in.");
		
		//WebElement logout = driver.findElement(By.xpath("//button[text()='Log Out']"));
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		
		driver.close();
		
		

	}
	


	public static String getPassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
		String  passwordText = driver.findElement(By.cssSelector("form p")).getText();
		//driver.findElement(By.cssSelector(".go-to-login-btn"));
		
		//Please use temporary password 'rahulshettyacademy' to Login.
		
		//temporary password 'rahulshettyacademy' to login
		String[] passwordArray = passwordText.split("'");
		
		//index [0] = Please use temporary password and index[1] = rahulshettyacademy' to Login.
		//String[] passwordArray2 = passwordArray[1].split("'");
		//String password = passwordArray2[0];
		String password = passwordArray[1].split("'")[0];
		return password;
		
	}

}
