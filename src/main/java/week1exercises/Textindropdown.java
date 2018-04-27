package week1exercises;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Textindropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		
		driver.findElementByXPath("//a[text()='Sign up']").click();
		
		WebElement drop1 = driver.findElementByXPath("//select[@name='userRegistrationForm:countries']");
		
		Select down1 = new Select(drop1);
		
		List<WebElement> alloption = down1.getOptions();
		
		for (WebElement eachoption : alloption)
		{
			System.out.println(eachoption.getText());
		}
		
		}
		 		
	}

