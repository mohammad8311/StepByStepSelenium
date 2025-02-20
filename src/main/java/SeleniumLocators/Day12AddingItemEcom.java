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
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.manage().window().maximize();
		
		int j = 0;
		//Add to cart items
		String[] neededItem = {"Brocolli", "Cucumber", "Beetroot", "Capsicum"};
		
		//All product
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0; i<products.size(); i++) {
			
			//Format it to get actual vegetable name 
			//e.g. Brocolli - 1 Kg
			//target = Brocolli, 1 Kg
			String[] itemName =  products.get(i).getText().split("-"); //Splitted the Brcolli - 1 Kg by "-" 
			
			//itemName[0]="Brocolli " and itemName[1]=" 1 Kg"
			String fromattedItemName =  itemName[0].trim(); //trimmed space from the "Brocolli "
			
			//Convert array into arrayList - for easy search
			//Check whether the name that extracted is present in the list or not-
			
			List<String> neededItemList = Arrays.asList(neededItem); //Array converted to ArrayList- List <listName> = Arrays.asList(<arrayName>);
			
			if(neededItemList.contains(fromattedItemName)) {
				j++;
				//Add to cart
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j == neededItemList.size()) {	//break the condition after getting three items //if(j == neededItem.length)
					break;			//if (neededItemList.size() == neededItemList.indexOf(formattedItemName) + 1)
				}
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
