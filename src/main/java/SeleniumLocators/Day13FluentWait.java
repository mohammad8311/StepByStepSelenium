package SeleniumLocators;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Day13FluentWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("[id='start'] button")).click();
		
		@SuppressWarnings("deprecation")
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
		
		final WebElement heading = driver.findElement(By.cssSelector("[id='finish'] h4"));
		
		wait.until(new Function<WebDriver, WebElement>() {
				public WebElement apply (WebDriver driver) {
					if(heading.isDisplayed()) {
						
						return heading;
					}
					else {
						return null;
					}
					
				}
		});
		
		System.out.println(heading.getText());

	}

}
