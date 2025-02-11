package SeleniumLocators;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day13AddingItemEcomOpt {


	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		WebDriverWait exWait = new WebDriverWait(driver , Duration.ofSeconds(6));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.manage().window().maximize();
		
		int j = 0;
		//Add to cart items
		String[] neededItem = {"Brocolli", "Cucumber", "Beetroot", "Capsicum"};
		addItemsToCart(neededItem, driver);
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//div[@class='cart-preview active']//button[@type='button']")).click(); //div[@class='cart-preview active']//button[@type='button']
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		exWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		String promoCodeMessage = driver.findElement(By.cssSelector("span.promoInfo")).getText();
		System.out.println(promoCodeMessage);
		

	}
	
	public static void addItemsToCart(String[] neededItem, WebDriver driver){
		
		int j=0;
		
		//All product
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0; i<products.size(); i++) {
			
			String[] itemName =  products.get(i).getText().split("-"); //Splitted the Brcolli - 1 Kg by "-" 
			
			String fromattedItemName =  itemName[0].trim(); //trimmed space from the "Brocolli "
			
			List<String> neededItemList = Arrays.asList(neededItem); //Array converted to ArrayList- List <listName> = Arrays.asList(<arrayName>);
			
			if(neededItemList.contains(fromattedItemName)) {
				j++;
				//Add to cart
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j == neededItemList.size()) {
					break;
				}
			}
			
		}
		
	}

}
