package week4day2;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class EditLead extends ProjectMethod{

	//@Test(dependsOnMethods= {"week4day1.CreateLead.CreatingLeads"})
	@Test(groups= {"regression"},dependsOnGroups= {"smoke","sanity"})
	public void editLeadScenario() throws InterruptedException

	{

		//loginNavigation();

		click(locateElement("xpath", "//a[text()='Leads']"));

		click(locateElement("xpath", "//a[contains(text(),'Find Leads')]"));

		type(locateElement("xpath", "//label[text()='Lead ID:']/following::input[2]"), "p");

		click(locateElement("xpath", "//button[text()='Find Leads']"));

		Thread.sleep(5000);

		click(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[2]/a"));

		click(locateElement("xpath", "//a[text()='Edit']"));

		clear(locateElement("xpath", "(//input[@name='companyName'])[2]"));

		type(locateElement("xpath", "(//input[@name='companyName'])[2]"), "SampleTest");

		click(locateElement("xpath", "(//input[@class='smallSubmit'])[1]"));

		verifyExactText(locateElement("xpath", "//span[@id='viewLead_companyName_sp']"), "SampleTest (10072)");

		//closeBrowser();
	}

}
