package homeWork;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class frame {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://login.salesforce.com/");

		WebElement fme = driver.findElementById("marketing");

		driver.switchTo().frame(fme);

		//System.out.println("debug here");

		String txtContent = driver.findElementByXPath("//span[contains(text(),'Start my free trial')]").getText();
		System.out.println("txtContent");

		// parentFrame --> its switch to previous frame
		// defaultContentet --> its switch first frame/parent frame
		
		driver.switchTo().defaultContent();
		//driver.switchTo().parentFrame();

		driver.findElementById("username").sendKeys("ajithkumarnttdata@salesforce.com");
		driver.findElementById("password").sendKeys("Ajith@01");
		driver.findElementById("Login").click();
		System.out.println("Welcome to the " + driver.getCurrentUrl());
		System.out.println("Welcome to the " + driver.getTitle());

		Thread.sleep(50000);
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\332843\\eclipse-workspace\\Letcode\\Screenshot/sf.png");
		FileHandler.copy(src, dest);

		driver.quit();


	}

}
