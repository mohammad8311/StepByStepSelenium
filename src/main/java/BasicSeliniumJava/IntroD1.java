package BasicSeliniumJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IntroD1 {

	public static void main(String[] args) {
		
		
		//Chrome
		System.setProperty("Webdrive.chrome.driver", "/path.....");
		WebDriver driver0 = new ChromeDriver();
		
		//Microsoft Edge
		System.setProperty("Webdriver.edge.drover", "/path.....");
		WebDriver driver1 = new EdgeDriver();
		
		//Firefox
		System.setProperty("Webdriver.gecko.drover.", "/path.....");
		WebDriver driver2 = new FirefoxDriver();
		
		WebDriver driver = new ChromeDriver();

	}

}
