package week1exercises;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownselection {

	public static void main(String[] args) throws InterruptedException {
		
	 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	 
	 ChromeDriver driver = new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 driver.get("http://www.irctc.co.in/eticketing/loginHome.jsf");
	 
	 //click on sign up link from home page
	 driver.findElementByLinkText("Sign up").click();
	 
	
	 
	 //Country field - 1 option
	 driver.findElementById("userRegistrationForm:countries").click();
	 driver.findElementById("userRegistrationForm:countries").sendKeys("E",Keys.ARROW_DOWN,Keys.ENTER);
	 //driver.findElementById("userRegistrationForm:countries").sendKeys("E",Keys.DOWN);
	 
	 //Country field - 2 option
	 WebElement campaignid = driver.findElementById("userRegistrationForm:countries");
		
		Select ss = new Select(campaignid);
		
		
		List<WebElement> allOptions = ss.getOptions();
		
		for (WebElement eachOption : allOptions)
			
		{
		
			System.out.println(eachOption.getText());
		}
		
		System.out.println(allOptions.size());
		
		ss.selectByIndex(allOptions.size()-1);
	 
	 
	 //driver.close();
	 
	 
	 
	}

}
