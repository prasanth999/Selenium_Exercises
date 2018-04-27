package week3_day2_projectwork;

public class ProjectMethod extends SeMethods {

	public void loginNavigation()

	{
		startApp("chrome", "http://www.leaftaps.com/opentaps");

		type(locateElement("xpath", "//input[@id='username']"), "DemoSalesManager");

		type(locateElement("xpath", "//input[@id='password']"), "crmsfa");

		click(locateElement("xpath", "//input[@class='decorativeSubmit']"));

		click(locateElement("xpath", "//a[contains(text(),'CRM/SFA')]"));
		//click(locateElement("xpath", "//a[contains(text(),'Leads')]"));
	}
}


