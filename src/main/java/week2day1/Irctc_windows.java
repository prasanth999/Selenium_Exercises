package week2day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

// Window handles

public class Irctc_windows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		//implicitly wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//Launch the browser
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
        System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		driver.findElementByXPath("//a[text()='Contact Us']").click();
		
		Set<String> allwindows = driver.getWindowHandles();
		
		List<String> winList = new ArrayList<String>();
		
		winList.addAll(allwindows);
		
		driver.switchTo().window(winList.get(1));
		
        System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		String actualFax = "011-23345400.";
		String expectedFax = driver.findElementByXPath("//div[@class='content-ele']/p[2]").getText();
		
		System.out.println(expectedFax);
		if (expectedFax.contains(actualFax)) {
		    System.out.println("Given Fax no is Matched");
		} else {
		    System.out.println("Given Fax no is Mismatched.");
		}
		
		driver.close();
		
		driver.switchTo().window(winList.get(0));
		
        System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		driver.findElementByXPath("//input[@class='loginUserId']").sendKeys("prasanth");
		
		
		
	}

}
