package week4_homework;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Test2 {
	
	@Test(priority=1,alwaysRun=true)
	public void test2Scenario()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 
		 ChromeDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.get("https://www.flipkart.com/");
		 driver.close();
	}

}
