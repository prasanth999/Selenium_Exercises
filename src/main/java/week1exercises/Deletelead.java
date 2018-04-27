package week1exercises;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Deletelead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.leaftaps.com/opentaps");
		//LOGIN STEPS
		driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");
		
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
				
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		
		//Click crm/sfa link
		driver.findElementByXPath("//a[contains(text(),'CRM/SFA')]").click();
		
		//Click Leads link
		driver.findElementByXPath("//a[text()='Leads']").click();
		//Click Find leads
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		//Click on Phone
		driver.findElementByXPath("//span[text()='Phone']").click();
		//Enter phone number - Area code and phone number
		driver.findElementByXPath("//input[@name='phoneAreaCode']").sendKeys("01");
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("999");
		//Click find leads button
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		//Capture lead ID of First Resulting lead
		
		//Click First Resulting lead
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"))).click();
		//Click Delete
		driver.findElementByXPath("//a[text()='Delete']").click();
		//Click Find leads
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		//Enter captured lead ID
		driver.findElementByXPath("//input[@name='id']").sendKeys("102456");
		//Click find leads button
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		//Verify error msg
		String expectedresult ="No records to display";
		String actualresult = driver.findElementByXPath("//div[text()='No records to display']").getText();
		System.out.println(actualresult);
		if (expectedresult.contains(actualresult)) {
		    System.out.println("No records to display");
		} else {
		    System.out.println("Record is available");
		}
		//Close the browser
		driver.close();
		driver.quit();
	      	
		
		
	}

}
