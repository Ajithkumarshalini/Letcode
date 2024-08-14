package homeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons {

	public static void main(String[] args) {



		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://letcode.in/buttons");	

		//		click()
		//		driver navigation commands
		//		getLocation()
		//		getCss()
		//		getSize()
		//		isEnabled()


		driver.findElement(By.xpath("//button[@id='home']")).click();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.navigate().back();


		Point location = driver.findElement(By.xpath("//button[@id='position']")).getLocation();
		System.out.println(location.getX());
		System.out.println(location.getY());

		String color = driver.findElement(By.xpath("//button[@id='color']")).getCssValue("background-color");
		System.out.println(color);



		Dimension dimesion	= driver.findElement(By.xpath("//button[@id='property']")).getSize();
		System.out.println(dimesion.getHeight());
		System.out.println(dimesion.getWidth());

		Boolean statement = driver.findElement(By.xpath("//div[5]//div[1]//button[1]")).isEnabled();
		System.out.println(statement);

		driver.quit();
	}

}
