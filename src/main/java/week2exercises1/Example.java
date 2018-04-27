package week2exercises1;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.service.DriverService;

public class Example {
	
	public static void main(String[] args) {

	System.setProperty("Webdriver.chrome.driver", "./driver/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//driver.get(url);
//driver.findElementById(using)
	}
}
