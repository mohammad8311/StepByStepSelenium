package SeleniumLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day05UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.xpath("//div[text()='1 Adult']")).click();
		Thread.sleep(2000L);
		
		int i=1;
		while(i<5)
		{
			
			driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click(); //4 times
			i++;
		}
		
		for (i=0; i<3; i++)
		{
			driver.findElement(By.xpath("//div[@data-testid='Children-testID-plus-one-cta']")).click(); //4 times
		}
		
		System.out.println(driver.findElement(By.xpath("//div[text()='Done']")).getText());
		driver.findElement(By.cssSelector(".css-1dbjc4n.r-1awozwy.r-19m6qjp.r-z2wwpe.r-1loqt21.r-18u37iz.r-1777fci.r-d9fdf6.r-1w50u8q.r-ah5dr5.r-1otgn73")).click();
		Thread.sleep(2000L);
		
		//driver.findElement(By.xpath("//div[@data-testid='home-page-travellers-done-cta']/div[2]")).click();
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//WebElement doneButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Done']")));
		//doneButton.click();
		
		

	}

}
