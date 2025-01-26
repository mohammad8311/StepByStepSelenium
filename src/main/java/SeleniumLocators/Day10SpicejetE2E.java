package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day10SpicejetE2E {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.xpath("//div[text()='1 Adult']")).click();
		Thread.sleep(2000L);
		
		driver.findElement(By.xpath("//div[text()='From']")).click();
		driver.findElement(By.xpath("//div[text()='Chennai']")).click();
		driver.findElement(By.xpath("//div[text()='BLR']")).click();
		
		
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-156aje7 r-y47klf r-1phboty r-1d6rzhh r-1pi2tsx r-1777fci r-13qz1uu']")).click();
		
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
		
		Thread.sleep(2000L);
		driver.findElement(By.cssSelector(".css-1dbjc4n.r-1awozwy.r-19m6qjp.r-z2wwpe.r-1loqt21.r-18u37iz.r-1777fci.r-d9fdf6.r-1w50u8q.r-ah5dr5.r-1otgn73")).click();
		
		
		driver.findElement(By.xpath("//div[text()='Family & Friends']")).click();
		//driver.findElement(By.xpath("//div[@css='188']")).click();
		
		driver.findElement(By.cssSelector(".css-1dbjc4n.r-1awozwy.r-z2wwpe.r-1loqt21.r-18u37iz.r-1777fci.r-1g94qm0.r-d9fdf6.r-1w50u8q.r-ah5dr5.r-1otgn73")).click();
		
		driver.close();

		
	}

}
