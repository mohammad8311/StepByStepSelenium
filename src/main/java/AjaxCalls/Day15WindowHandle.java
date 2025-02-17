package AjaxCalls;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day15WindowHandle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		
		driver.findElement(By.className("blinkingText")).click();
		Set<String> windows = driver.getWindowHandles(); //[ParentID, ChildID]
		Iterator<String> it = windows.iterator();
		String ParentID = it.next();
		String ChildID = it.next();
		driver.switchTo().window(ChildID);
		
		String emailInfoPara  = driver.findElement(By.cssSelector(".im-para.red")).getText();
		System.out.println(emailInfoPara);
		String email = emailInfoPara.split("at")[1].trim().split(" ")[0];
		System.out.println(email);
		
		driver.switchTo().window(ParentID);
		driver.findElement(By.id("username")).sendKeys(email);
		

	}

}
