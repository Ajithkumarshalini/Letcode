package homeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\332843\\eclipse-workspace\\Letcode\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/test");
		driver.manage().window().maximize();
		boolean signUpValidation = driver.findElementByLinkText("Sign up").isDisplayed();
		System.out.println(signUpValidation);

		System.out.println(driver.findElementByLinkText("Sign up").getAttribute("class"));
		System.out.println(driver.findElementByLinkText("Sign up").getText());
		
		
		System.out.println(driver.findElement(By.xpath("//a[.='Drop-Down']")).isEnabled());
		driver.quit();

		// isSelected used for validating the checkbox, radiobtn
		//		driver.findElement(By.xpath("")).isSelected();


	}

}
