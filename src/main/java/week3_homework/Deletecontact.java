package week3_homework;

import org.junit.Test;

public class Deletecontact extends ProjectMethod {

	@Test
	public void Deletecontactscenario() throws InterruptedException
	{
		loginNavigation();
		click(locateElement("xpath", "//a[text()='Accounts']"));
		click(locateElement("xpath", "//a[text()='Find Accounts']"));
		click(locateElement("xpath", "//span[text()='Phone']"));
		type(locateElement("xpath", "//input[@name='phoneNumber']"), "91");
		Thread.sleep(5000);
		click(locateElement("xpath", "//button[text()='Find Accounts']"));
		getText(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]"));
		Thread.sleep(5000);
		click(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]"));
		moveMouseOverClick(locateElement("xpath", "(//img[@alt='Expire'])[1]"));
		click(locateElement("xpath", "//a[text()='Find Accounts']"));
		type(locateElement("xpath", "//input[@name='id']"),"10379");
		click(locateElement("xpath", "//button[text()='Find Accounts']"));
		Thread.sleep(5000);
		click(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]"));
		verifyPartialText(locateElement("xpath", "(//div[@class='tabletext'])[1]"), "No contact information on file");
		closeBrowser();
		
		
	}
	
}
