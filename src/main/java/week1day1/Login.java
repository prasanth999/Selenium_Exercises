package week1day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Login 
{

	public static void main(String[] args) {
		
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
		
		driver.findElementByLinkText("CRM/SFA").click();
		
		driver.findElementByLinkText("Leads").click();
		
		driver.findElementByLinkText("Create Lead").click();
		
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		
	
		driver.findElementById("createLeadForm_firstName").sendKeys("Prasanth");
		
		driver.findElementById("createLeadForm_lastName").sendKeys("Sundaresan");
		
		//driver.findElementByClassName("smallSubmit").click();
		
		WebElement sourceid = driver.findElementById("createLeadForm_dataSourceId");
		
		Select dd = new Select(sourceid);
		
		dd.selectByVisibleText("Employee");
		
        WebElement campaignid = driver.findElementById("createLeadForm_marketingCampaignId");
		
		Select ss = new Select(campaignid);
		
		ss.selectByVisibleText("Car and Driver");
		List<WebElement> allOptions = ss.getOptions();
		
		for (WebElement eachOption : allOptions)
			
		{
		
			System.out.println(eachOption.getText());
		}
		
		System.out.println(allOptions.size());
		
		dd.selectByIndex(allOptions.size()-1);
		
		
		
		
		
        //driver.close();
        
      
		

	}

}
