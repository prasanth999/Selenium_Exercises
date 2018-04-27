package week8_day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class fileUpload {

	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(op);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.redbus.in/search?fromCityName=Chennai&fromCityId=123&toCityName=Bangalore&toCityId=122&onward=27-Apr-2018&return=27-Apr-2018&opId=0&busType=Any");
	//driver.findElementByXPath("//input[@type='file'][2]").sendKeys("G:\\a.jpg");
		Point y = driver.findElementByXPath("(//button[text()='View Seats'])[45]").getLocation();
		
		//JavascriptExecutor js = new javas
		driver.executeScript("scroll(0, "+y+")", "");
		

	}

}
