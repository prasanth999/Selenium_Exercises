package week4_homework;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectMethod extends SeMethods {

	@BeforeMethod(groups= {"All"})
	public void loginNavigation()

	{
		startApp("chrome", "http://www.leaftaps.com/opentaps");

		type(locateElement("xpath", "//input[@id='username']"), "DemoSalesManager");

		type(locateElement("xpath", "//input[@id='password']"), "crmsfa");

		click(locateElement("xpath", "//input[@class='decorativeSubmit']"));

		click(locateElement("xpath", "//a[contains(text(),'CRM/SFA')]"));
		//click(locateElement("xpath", "//a[contains(text(),'Leads')]"));
	}
	
	@AfterMethod(groups= {"All"})
	public void closeBrowser()
	{
		driver.close();
	}
}


