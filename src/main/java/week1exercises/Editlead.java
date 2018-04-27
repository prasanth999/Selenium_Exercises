package week1exercises;

import java.util.concurrent.TimeUnit;

import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Editlead {

	public static void main(String[] args) {
		//chrome driver path
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

ChromeDriver driver = new ChromeDriver();

driver.manage().window().maximize();

//implicitly wait
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
//Click Find leads
driver.findElementByXPath("//a[contains(text(),'Find Leads')]").click();
//Enter first name
driver.findElementByXPath("//label[text()='Lead ID:']/following::input[2]").sendKeys("de");
//Click Find leads button
driver.findElementByXPath("//button[text()='Find Leads']").click();
//Click on first resulting lead
//wait and search the result in table
WebDriverWait wait = new WebDriverWait(driver, 10);
wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"))).click();
//Verify title of the page
String actualtitle = "View Lead | opentaps CRM";
String currenttitle = driver.getTitle();
//div[text()='View Lead']
if (currenttitle.equals(actualtitle)) {
    System.out.println("Title of page is Matched");
} else {
    System.out.println("Title of page is Mismatched.");
}

//Click Edit
driver.findElementByXPath("//a[text()='Edit']").click();
//Change the company name
driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").clear();
driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").sendKeys("testsample");
//Click Update
driver.findElementByXPath("//input[@class='smallSubmit']").click();
//verify the text
String actualcompany = "testsample (10471)";
String currentcompany = driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText();
System.out.println(currentcompany);
if (currentcompany.contains(actualcompany)) {
    System.out.println("Company Name is Matched");
} else {
    System.out.println("Company Name is Mismatched.");
}
	
	}	

}
