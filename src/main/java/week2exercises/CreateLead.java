package week2exercises;

import javax.lang.model.element.Element;

import org.junit.Test;

public class CreateLead extends ProjectMethod {

	@Test

	public void CreatingLeads()

	{
		loginNavigation();

		click(locateElement("xpath", "//a[contains(text(),'Create Lead')]"));

		type(locateElement("xpath", "//input[@id='createLeadForm_companyName']"), "TestLeaf");

		type(locateElement("xpath", "//input[@id='createLeadForm_firstName']"), "Prasanth");

		type(locateElement("xpath", "//input[@id='createLeadForm_lastName']"), "Sundaresan");

		click(locateElement("xpath", "//input[@class='smallSubmit']"));

		getText(locateElement("xpath", "//span[@id='viewLead_companyName_sp']"));


	}
}


