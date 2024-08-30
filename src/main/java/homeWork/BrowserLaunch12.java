package homeWork;

import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserLaunch12 {

	static String email ="sjuaajithkumar@gmail.com";
	static String pass = "Ajith@01";
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://letcode.in/signin");		
		driver.findElementByName("email").sendKeys(email);
		driver.findElementByName("password").sendKeys(pass);
		driver.findElementByXPath("//button[.='LOGIN']").click();
		driver.quit();
		

	}
}
