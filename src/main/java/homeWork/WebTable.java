package homeWork;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\332843\\eclipse-workspace\\Letcode\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://letcode.in/table");
		
		WebElement table = driver.findElement(By.id("simpletable"));
		List<WebElement> headers = table.findElements(By.tagName("th"));
		System.out.println(headers.size());
		for(WebElement header: headers) {
			System.out.println(header.getText());
		}
		
		List<WebElement> rows = table.findElements(By.xpath("//table[@Id='simpletable']/tbody/tr"));
		int size = rows.size();
		System.out.println(size);

		if(size == 3) {
			System.out.println("passed");
		}else System.out.println("failed");
		
		
		for(int i = 0; i < size; i++) {
			
			List<WebElement> datas = rows.get(i).findElements(By.tagName("td"));
			
			for(WebElement names: datas) {
				System.out.println(names.getText());
			}
			
			System.out.println("------------------------");
			WebElement lastname = datas.get(1);
			System.out.println(lastname.getText());
			{
				if(lastname.equals("Raj"));{
					System.out.println("True");{
	
					}
				}
				datas.get(3).findElement(By.tagName("input")).click();
				break;
			}
		}
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
	}

}
