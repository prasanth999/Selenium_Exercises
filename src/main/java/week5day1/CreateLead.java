package week5day1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import javax.lang.model.element.Element;

public class CreateLead extends ProjectMethod {
	/*
	 * //@Test(invocationCount=2,invocationTimeOut=45000)
	 * //@Test(invocationCount=2,timeOut=20000) //@Test(invocationCount=2 )
	 */
	// @Test(groups= {"smoke"})
	// @Test(invocationCount=3,threadPoolSize=3)
	@Test(dataProvider = "fetch")
	public void CreatingLeads(String cname, String fname, String lname)

	{

		click(locateElement("xpath", "//a[contains(text(),'Create Lead')]"));

		type(locateElement("xpath", "//input[@id='createLeadForm_companyName']"), cname);

		type(locateElement("xpath", "//input[@id='createLeadForm_firstName']"), fname);

		type(locateElement("xpath", "//input[@id='createLeadForm_lastName']"), lname);

		click(locateElement("xpath", "//input[@class='smallSubmit']"));

		getText(locateElement("xpath", "//span[@id='viewLead_companyName_sp']"));

	}

	/*
	 * @DataProvider(name="fetch") public Object[][] getData() { Object [][] data =
	 * new Object[2][3]; data[0][0]="TestLeaf"; data[0][1]="prasanth";
	 * data[0][2]="sund";
	 * 
	 * 
	 * data[1][0]="TestLeaf1"; data[1][1]="prasanth1"; data[1][2]="sund1";
	 * 
	 * return data;
	 * 
	 * }
	 */
}
