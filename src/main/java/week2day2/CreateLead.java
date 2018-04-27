package week2day2;

import javax.lang.model.element.Element;

import org.junit.Test;

public class CreateLead extends SeMethods {

	@Test

	public void CreatingLeads()

	{
		startApp("chrome", "http://www.leaftaps.com/opentaps");

		type(locateElement("xpath", "//input[@id='username']"), "DemoSalesManager");

		type(locateElement("xpath", "//input[@id='password']"), "crmsfa");

		click(locateElement("xpath", "//input[@class='decorativeSubmit']"));

		click(locateElement("xpath", "//a[contains(text(),'CRM/SFA')]"));

		click(locateElement("xpath", "//a[contains(text(),'Leads')]"));

		click(locateElement("xpath", "//a[contains(text(),'Create Lead')]"));

		type(locateElement("xpath", "//input[@id='createLeadForm_companyName']"), "TestLeaf");

		type(locateElement("xpath", "//input[@id='createLeadForm_firstName']"), "Prasanth");

		type(locateElement("xpath", "//input[@id='createLeadForm_lastName']"), "Sundaresan");

		click(locateElement("xpath", "//input[@class='smallSubmit']"));

		getText(locateElement("xpath", "//span[@id='viewLead_companyName_sp']"));


	}
}


