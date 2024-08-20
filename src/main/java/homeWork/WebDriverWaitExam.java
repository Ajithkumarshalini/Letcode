package homeWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitExam {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\332843\\eclipse-workspace\\Letcode\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://letcode.in/waits");
		WebDriverWait wait = new WebDriverWait(driver, 30);

		driver.findElement(By.id("accept")).click();

		Alert until = wait.until(ExpectedConditions.alertIsPresent());
		until.accept();


		driver.get("https://letcode.in/signin");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sjuaajithkumar@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter password']")).sendKeys("Ajith@01");
		driver.findElement(By.xpath("//button[normalize-space()='LOGIN']")).click();
		WebElement toast = driver.findElement(By.xpath("//div[@aria-label='Welcome Ajithkumar']"));
		String text = toast.getText();
		wait.until(ExpectedConditions.visibilityOf(toast));
		System.out.println(text);
		wait.until(ExpectedConditions.invisibilityOf(toast));
		driver.findElement(By.xpath("//a[normalize-space()='Sign out']")).click();
		wait.until(ExpectedConditions.urlContains("letcode"));
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		driver.quit();

	}
}