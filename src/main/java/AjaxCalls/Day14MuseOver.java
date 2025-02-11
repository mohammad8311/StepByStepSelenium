package AjaxCalls;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day14MuseOver {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.alibaba.com/");
		driver.manage().window().maximize();
		WebDriverWait exWait = new WebDriverWait(driver , Duration.ofSeconds(6));
		Actions a = new Actions(driver);
		
		WebElement allCategoriesMove = driver.findElement(By.cssSelector("div[data-tnh-auto-exp='All categories']"));
		//Move to specific element
		a.moveToElement(allCategoriesMove).build().perform();
		
		//Scroll down 360px
		a.scrollByAmount(0, 350).contextClick().perform();
		
		WebElement searchBox = exWait.until(ExpectedConditions.elementToBeClickable(
			    By.xpath("//input[contains(@class, 'search-bar-input')]")));
		
		//Move to search box
		a.moveToElement(searchBox).click().keyDown(Keys.SHIFT).sendKeys("toys").doubleClick().build().perform();
		

	}

}
