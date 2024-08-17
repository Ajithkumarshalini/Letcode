package homeWork;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");	

		WebElement dd = driver.findElementByXPath("//select");

		Select dropDown = new Select(dd);
		dropDown.selectByValue("AFG");
		System.out.println(dropDown.getFirstSelectedOption().getText());
		List<WebElement> opt = dropDown.getOptions();
		for(WebElement ans:opt) {
			System.out.println(ans.getText());
		}

		System.out.println(dropDown.isMultiple());
		//dropDown.deselectByValue("AFG");
		// multiple drop and down only deselect options will work
		driver.quit();

	}

}
