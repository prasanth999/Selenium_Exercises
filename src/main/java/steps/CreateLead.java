package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLead {

	ChromeDriver driver;
	
	@Before
	public void before()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("http://www.leaftaps.com/opentaps");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@When("Enter the username as (.*)")
	public void userName(String uName)
	{
		//Enter the username
		driver.findElementByXPath("//input[@id='username']").sendKeys(uName);
		
		
	}
	@When("Enter the password as (.*)")
	public void Password(String passWord)
	{
		
		//Enter the password
		driver.findElementByXPath("//input[@id='password']").sendKeys(passWord);
		
		
	}
	@When("Click on login option")
	public void loginOption()
	{

		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
	}
	
	
	@When("Click on crmsfa link")
	public void crmsfaLink()

	{
		driver.findElementByXPath("//a[contains(text(),'CRM/SFA')]").click();
	}
	@When("Click on Lead link")
	public void leadLink()

	{
		driver.findElementByXPath("//a[text()='Leads']").click();
	}
	@When("Click on Create Lead link")
	public void createleadLink()

	{
		driver.findElementByXPath("//a[text()='Create Lead']").click();
	}
	@And("Enter the Company Name")
	public void companyName()

	{
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");

	}
	
	@And("Enter the First Name")
	public void firstName()

	{
		
		driver.findElementById("createLeadForm_firstName").sendKeys("Prasanth");

	}
	
	@And("Enter the Last Name")
	public void lastName()

	{
		
		driver.findElementById("createLeadForm_lastName").sendKeys("Sundaresan");

		
	}
	
	@When("Click on Create Lead button")
	public void createLead()

	{

		driver.findElementByClassName("smallSubmit").click();
	}
	@Then("Verify the Company name is created in View Lead page")
	public void createleadSuccess()

	{
		String expectedresult ="TestLeaf";
		String actualresult = driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText();
		System.out.println(actualresult);
		if (expectedresult.contains(actualresult)) {
			System.out.println("Login is successful");
		} else {
			System.out.println("Login is unsuccessful");
		}
	}
	@After
	public void closeBrowser()
	{
		driver.close();
	}
	
	}


