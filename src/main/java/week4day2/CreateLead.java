package week4day2;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import javax.lang.model.element.Element;

public class CreateLead extends ProjectMethod {
	/*//@Test(invocationCount=2,invocationTimeOut=45000)
		//@Test(invocationCount=2,timeOut=20000)
	//@Test(invocationCount=2 )
*/	
	@Test(groups= {"smoke"})
	public void CreatingLeads()

	{
		click(locateElement("xpath", "//a[text()='Leads']"));
		
		click(locateElement("xpath", "//a[contains(text(),'Create Lead')]"));

		type(locateElement("xpath", "//input[@id='createLeadForm_companyName']"), "TestLeaf");

		type(locateElement("xpath", "//input[@id='createLeadForm_firstName']"), "Prasanth");

		type(locateElement("xpath", "//input[@id='createLeadForm_lastName']"), "Sundaresan");

		click(locateElement("xpath", "//input[@class='smallSubmit']"));

		getText(locateElement("xpath", "//span[@id='viewLead_companyName_sp']"));

	}
}


