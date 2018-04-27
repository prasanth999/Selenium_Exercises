package week4_homework;

import java.sql.Driver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Test1 {
	
	@Test(invocationCount=3,threadPoolSize=3)
	public void test1Scenario()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 
		 ChromeDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.get("http://www.irctc.co.in/eticketing/loginHome.jsf");
		 driver.close();
	}

}
