package week4day1;

import org.testng.annotations.Test;
import javax.lang.model.element.Element;

public class CreateLead extends ProjectMethod {

	//@Test(invocationCount=2)
	@Test
	public void CreatingLeads()

	{
		//loginNavigation();

		click(locateElement("xpath", "//a[contains(text(),'Create Lead')]"));

		type(locateElement("xpath", "//input[@id='createLeadForm_companyName']"), "TestLeaf");

		type(locateElement("xpath", "//input[@id='createLeadForm_firstName']"), "Prasanth");

		type(locateElement("xpath", "//input[@id='createLeadForm_lastName']"), "Sundaresan");

		click(locateElement("xpath", "//input[@class='smallSubmit']"));

		getText(locateElement("xpath", "//span[@id='viewLead_companyName_sp']"));

	//closeBrowser();
	}
}


