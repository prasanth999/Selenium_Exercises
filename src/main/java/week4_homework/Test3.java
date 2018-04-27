package week4_homework;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Test3 {
	
	@Test
	public void test3Scenario()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 
		 ChromeDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.get("http://www.leaftaps.com/crmsfa/control/leadsMain");
		 driver.close();
	}

}
