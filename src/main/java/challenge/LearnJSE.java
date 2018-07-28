package challenge;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearnJSE {
	
	@Test
	public void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		WebElement usrName = driver.findElementByXPath("//label[@for='username']");
		WebElement usrField  = driver.findElementById("username");
		JavascriptExecutor jse = (JavascriptExecutor) driver;

		jse.executeScript("arguments[0].setAttribute('style',arguments[1])", usrName, "color: green; border: 2px solid red;");
		Thread.sleep(3000);
		jse.executeScript("arguments[0].setAttribute('style',arguments[1])", usrName, "");
		
		jse.executeScript("arguments[0].setAttribute('value','DemoCSR')", usrField);
		
		
		jse.executeScript("window.scrollBy(0,arguments[0])",1250);
		
		
		String str = new String("123");
		Object obj = new Object();
		
		//upcasting - auto
		Object obj1 = str;
		
		//downcasting - explicitly cast
		String str1= (String) obj;
	}
}