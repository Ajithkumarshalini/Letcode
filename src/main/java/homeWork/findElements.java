package homeWork;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElements {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\332843\\eclipse-workspace\\Letcode\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("Goat", Keys.ENTER);
		List<WebElement> goat =driver.findElementsByXPath("//*[contains(text(),'goat') or contains(text(),'Goat')]");	
		int goatCOunt = goat.size();
		System.out.println(goatCOunt);
		for(WebElement words: goat) {
			System.out.println(words.getText());
		}
		
		System.out.println((goat.size()-1));
		driver.quit();
	}

}
