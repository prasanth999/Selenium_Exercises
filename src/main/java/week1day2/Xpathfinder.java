package week1day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathfinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//open the browser
		
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize the browser
		
		driver.manage().window().maximize();
		
		// Enter the urls
		
		driver.get("http://www.leaftaps.com/opentaps");
		
		//Enter the username
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
		driver.findElementById("password").sendKeys("crmsfa");
		
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("Find Leads").click();
		
		driver.findElementsByXPath("//button[text()='Find Leads']");
		
		driver.findElementsByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId'][1]/a");
		
		driver.findElementsByXPath("//img[@alt='Lookup']");
		
		//a[text()='Partners']
		
		
		
		//"//*[@id="ext-gen908"]"
		
		
		
	}

}
