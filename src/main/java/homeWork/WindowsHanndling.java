package homeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHanndling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\332843\\eclipse-workspace\\Letcode\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://letcode.in/windows");

	/*	
		Click on the home button
		Goto the newly opened tab
		Print the title of the page
		Close the parent window
		Close the child window
		Click on the Muiltiple windows button
		Print all the window title
		Close all the windows*/
		
		driver.findElementById("home").click();
		Thread.sleep(3000);
		Set<String> parentWindow = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(parentWindow);
		Thread.sleep(3000);
		driver.switchTo().window(list.get(1));
		System.out.println(driver.getTitle());
		System.out.println(driver.findElementByTagName("h1").getText());
		driver.close();
		driver.switchTo().window(list.get(0));
		list.clear();
		Thread.sleep(3000);
		driver.findElementById("multi").click();
		Thread.sleep(3000);
		Set<String> parentWindow11 = driver.getWindowHandles();
		List<String> list1 = new ArrayList<String>(parentWindow11);
/*		driver.switchTo().window(list1.get(0));
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(list1.get(1));
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(list1.get(2));
		System.out.println(driver.getCurrentUrl());
		*/
		
		for(   String res:list1) {
			driver.switchTo().window(res);
			System.out.println(driver.getCurrentUrl());
		}
		
		driver.quit();
			
	}

}
