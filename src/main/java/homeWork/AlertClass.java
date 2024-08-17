package homeWork;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertClass {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/alert");

		driver.findElementById("accept").click();
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();

		driver.findElementById("confirm").click();
		System.out.println(alt.getText());
		alt.dismiss();

		driver.findElementById("prompt").click();
		System.out.println(alt.getText());
		alt.sendKeys("Ajithkumar");
		alt.accept();
		System.out.println("Successfully loaded");
		driver.quit();


	}
}
