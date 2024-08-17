package homeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://letcode.in/dropable");	


		WebElement src = driver.findElementByXPath("//div[@id='draggable']");
		WebElement dest = driver.findElementByXPath("//div[@id='droppable']");

		Actions act = new Actions(driver);
		act.dragAndDrop(src, dest).perform();


		driver.get("https://letcode.in/draggable");

		WebElement src1 = driver.findElementById("sample-box");
		act.dragAndDropBy(src1, 30, 45).perform();	
		
		driver.get("https://www.flipkart.com/");
		WebElement ele = driver.findElement(By.xpath("//span[.='Login']"));
		act.moveToElement(ele);
		System.out.println(ele.getText());
				
		driver.quit();

	}

}
