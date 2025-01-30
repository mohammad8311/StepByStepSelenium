package SeleniumLocators;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day12AddingItemEcom {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		
		//Add to cart items
		String[] neededItem = {"Brocolli", "Cucumber"};
		
		//All product
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0; i<products.size(); i++) {
			String itemName =  products.get(i).getText();
			//Convert array into arrayList - for easy search
			//Check whether the name that extracted is present in the list or not-
			
			List neededItemList = Arrays.asList(neededItem); //Array converted to ArrayList- List <listName> = Arrays.asList(<arrayName>);
			
			if(neededItemList.contains(itemName)) {
				//Add to cart
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
			}
			
			/*
			//For single item
			for(int i=0; i<products.size(); i++) {
			String itemName =  products.get(i).getText();
			
			if(itemName.contains("Cucumber")) {
				//Add to cart
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
			}
			 */
			
		}

	}

}
