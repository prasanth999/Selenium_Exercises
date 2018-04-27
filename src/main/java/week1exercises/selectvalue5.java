package week1exercises;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectvalue5 {

	public static void main(String[] args) {
	

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://leafground.com/pages/Dropdown.html");
		
		WebElement drop1 = driver.findElementByXPath("//select[@id='dropdown1']");
		Select drop2 = new Select(drop1);
		drop2.selectByVisibleText("Selenium");
		
List<WebElement> allOptions = drop2.getOptions();
		
		for (WebElement eachOption : allOptions)
			
		{
		
			System.out.println(eachOption.getText());
		}
		
		System.out.println(allOptions.size());
		
		
	}

}
