package week2day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//Weekend home work - Combination of Window handle , alert.

public class MergeLead_Exercise {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Launch the browser
		driver.get("http://www.leaftaps.com/opentaps");
		
		//Enter the username
		driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");
		
		//Enter the password
		
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		
		//Click Login
		
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		
		//Click crm/sfa link
		
		driver.findElementByXPath("//a[contains(text(),'CRM/SFA')]").click();
		
		//Click Leads link
		
		driver.findElementByXPath("//a[contains(text(),'Leads')]").click();
		
		//Click Merge leads
		
		driver.findElementByXPath("//a[contains(text(),'Merge Leads')]").click();
		
		//Click on Icon near From Lead
		
		driver.findElementByXPath("//table[@name='ComboBox_partyIdFrom']/following::img[1]").click();
		
		//Move to new window
		
        Set<String> allwindows = driver.getWindowHandles();
		
		List<String> winList = new ArrayList<String>();
		
		winList.addAll(allwindows);
		
		driver.switchTo().window(winList.get(1));
		
        System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		// Enter Lead ID
		
		driver.findElementByXPath("//label[text()='Lead ID:']/following::input[1]").sendKeys("12");
		
		//Click Find Leads button
		
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		//Click First Resulting lead
		Thread.sleep(2000);
			driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
		
		/*WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"))).click();*/
		
		//Switch back to primary window
		
		driver.switchTo().window(winList.get(0));
		
        System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		//Click on Icon near To Lead
		
		driver.findElementByXPath("//table[@name='ComboBox_partyIdFrom']/following::img[2]").click();
		
		//Move to new window
			
        Set<String> allwindows1 = driver.getWindowHandles();
		
		List<String> winList1 = new ArrayList<String>();
		
		winList1.addAll(allwindows1);
		
		driver.switchTo().window(winList1.get(1));
		
        System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
			
			// Enter Lead ID
			
			driver.findElementByXPath("//label[text()='Lead ID:']/following::input[1]").sendKeys("22");
			
			//Click Find Leads button
			
			driver.findElementByXPath("//button[text()='Find Leads']").click();
			
			//Click First Resulting lead
			Thread.sleep(2000);
			driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
			/*WebDriverWait wait1 = new WebDriverWait(driver, 10);
			wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"))).click();*/
			
			//Switch back to primary window
			driver.switchTo().window(winList1.get(0));
			
	        System.out.println(driver.getTitle());
			
			System.out.println(driver.getCurrentUrl());
			
			//Click Merge
			
			driver.findElementByXPath("//a[text()='Merge']").click();
			
			//Accept Alert
			
			Alert myAlert = driver.switchTo().alert();
			driver.switchTo().alert().accept();
			
			//Click Find Leads
			
			driver.findElementByXPath("//a[text()='Find Leads']").click();
			
			//Enter From Lead ID
			
			driver.findElementByXPath("//label[text()='Lead ID:']/following::input[1]").sendKeys("9876");
			
			//Click Find Leads
			
			driver.findElementByXPath("//button[text()='Find Leads']").click();
			
			//Verify error msg
			
			String actualName = "No records to display";
			String expectedName = driver.findElementByXPath("//div[contains(text(),'No records to display')]").getText();
			
			System.out.println(expectedName);
			if (expectedName.contains(actualName)) {
			    System.out.println("Given text is Matched");
			} else {
			    System.out.println("Given text is Mismatched.");
			}
			
			//Close the browser (Do not log out)
			driver.close();
			
	}

}
