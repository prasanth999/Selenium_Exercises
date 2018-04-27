package week1day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//open the browser
		
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize the browser
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://google.co.in");
		
		driver.findElementByXPath("//input[@id='lst-ib']").sendKeys("prasanth");
		driver.findElementByXPath("//input[@name='btnK']").click();
		
		List<WebElement> links = driver.findElementsByPartialLinkText("pra");
		
		System.out.println(links.size());
		links.get(4).click();
		
		System.out.println(driver.getCurrentUrl());
		
		
	}

}
