package week4_homework;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import javax.lang.model.element.Element;


public class CreateLead extends ProjectMethod {
	/*//@Test(invocationCount=2,invocationTimeOut=45000)
		//@Test(invocationCount=2,timeOut=20000)
	//@Test(invocationCount=2 )
*/	
	//@Test(groups= {"smoke"})
	@Test(invocationCount=3,threadPoolSize=3)
	public void CreatingLeads()

	{
		
		click(locateElement("xpath", "//a[contains(text(),'Create Lead')]"));

		type(locateElement("xpath", "//input[@id='createLeadForm_companyName']"), "TestLeaf");

		type(locateElement("xpath", "//input[@id='createLeadForm_firstName']"), "Prasanth");

		type(locateElement("xpath", "//input[@id='createLeadForm_lastName']"), "Sundaresan");

		click(locateElement("xpath", "//input[@class='smallSubmit']"));

		getText(locateElement("xpath", "//span[@id='viewLead_companyName_sp']"));

	}
}


