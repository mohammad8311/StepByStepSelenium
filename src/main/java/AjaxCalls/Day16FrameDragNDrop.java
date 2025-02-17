package AjaxCalls;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day16FrameDragNDrop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		Actions a = new Actions(driver);
		//driver.switchTo().frame(1); //switch to frame by index e.g. 0, 1,....
		int frameSize = driver.findElements(By.tagName("iframe")).size();
		System.out.println(frameSize);
		
		driver.switchTo().frame(0);
		//driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement destination = driver.findElement(By.id("droppable"));
		a.dragAndDrop(source, destination).build().perform();
		driver.switchTo().defaultContent(); //After completing the work in frame have to switch webpage
		

	}

}
