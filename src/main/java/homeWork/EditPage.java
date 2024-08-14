package homeWork;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditPage {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/edit");

		//		sendKeys()
		//		Keyboard TAB
		//		getAttribute()
		//		clear()
		//		isEnabled()

		driver.findElementById("fullName").sendKeys("Ajithkumar");
		driver.findElementById("join").sendKeys("S",Keys.TAB);
		String txtBoxValue = driver.findElementById("getMe").getAttribute("value");
		System.out.println(txtBoxValue);
		driver.findElementById("clearMe").clear();
		boolean btnVisible = driver.findElementById("noEdit").isEnabled();
		System.out.println(btnVisible);

		String textValue = driver.findElementById("dontwrite").getAttribute("readonly");
		System.out.println(textValue);
		driver.quit();


	}

}
