package homeWork;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShot {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://letcode.in/buttons");
		
		
		// File        -> class -> import in java
		// FileHnadler -> class -> import in selenium
		// getScreenshotAs -> method -> (OutputType.FILE)
		// copy            -> method
		// driver.getScreenshotAs(OutputType.FILE);
		// driver.findElementById("home").getScreenshotAs(OutputType.FILE);
		
		File srcdriver = driver.getScreenshotAs(OutputType.FILE);
		File destdriver = new File("C:\\Users\\332843\\eclipse-workspace\\Letcode\\Screenshot/img.png");
		FileHandler.copy(srcdriver, destdriver);
		

		File src = driver.findElementById("home").getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\332843\\eclipse-workspace\\Letcode\\Screenshot/img1.png");
		FileHandler.copy(src, dest);
		driver.quit();
		
		
	}

}
