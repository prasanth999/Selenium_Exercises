package week1exercises;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox5 {

	//http://testleaf.herokuapp.com/pages/checkbox.html
	
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://testleaf.herokuapp.com/pages/checkbox.html");
		
		//one way selecting checkbox
		driver.findElementByXPath("//input[@type='checkbox'][3]").click();
		
		//Alternate way of selecting checkbox
		
		WebElement checkbox1 = driver.findElementByXPath("//input[@type='checkbox'][3]");
		checkbox1.click();
		//unselect the checkbox is the same way of selecting checkbox
		driver.findElementByXPath("//input[@type='checkbox'][3]").click();
	}

}
