package week4day2;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class DeleteLead extends ProjectMethod {

	//@Test(dependsOnMethods= {"week4day1.CreateLead.CreatingLeads"})
	@Test(groups= {"sanity"},dependsOnGroups= {"smoke"})
	public void DeleteLeadscenarios() throws InterruptedException
	{

		//loginNavigation();

		click(locateElement("xpath", "//a[text()='Leads']"));

		click(locateElement("xpath", "//a[contains(text(),'Find Leads')]"));

		click(locateElement("xpath", "//span[text()='Phone']"));

		type(locateElement("xpath", "//input[@name='phoneAreaCode']"), "91");

		type(locateElement("xpath", "//input[@name='phoneNumber']"), "78263876874");

		click(locateElement("xpath", "//button[text()='Find Leads']"));

		Thread.sleep(5000);

		click(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));

		click(locateElement("xpath", "//a[text()='Delete']"));

		click(locateElement("xpath", "//a[text()='Find Leads']"));

		type(locateElement("xpath", "//input[@name='id']"), "12147");

		click(locateElement("xpath", "//button[text()='Find Leads']"));

		verifyExactText(locateElement("xpath", "//div[text()='No records to display']"), "No records to display");
		
		//closeBrowser();

	}

}
