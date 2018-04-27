package week3_day2_projectwork;

import org.junit.Test;

public class DeactivateAccount extends ProjectMethod {

	@Test

	public void DeactivatingScenario() throws InterruptedException
	{

		loginNavigation();
		click(locateElement("xpath", "//a[text()='Accounts']"));
		click(locateElement("xpath", "//a[text()='Find Accounts']"));
		type(locateElement("xpath", "(//input[@name='accountName'])[2]"), "prasanthtext2");
		type(locateElement("xpath", "//input[@name='id']"),"11347");
		click(locateElement("xpath", "//button[text()='Find Accounts']"));
		getText(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]"));
		Thread.sleep(5000);
		click(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]"));
		verifyTitle("Account Details | opentaps CRM");
		clickWithNoSnap(locateElement("xpath", "//a[text()='Deactivate Account']"));
		getAlertText();
		acceptAlert();
		verifyPartialText(locateElement("xpath", "//span[@class='subSectionWarning']"), "This account was deactivated");
		clickWithNoSnap(locateElement("xpath", "//a[text()='Find Accounts']"));
		type(locateElement("xpath", "(//input[@name='accountName'])[2]"), "prasanthtest3");
		type(locateElement("xpath", "//input[@name='id']"), "11347");
		click(locateElement("xpath", "//button[text()='Find Accounts']"));
		verifyExactText(locateElement("xpath", "//div[text()='No records to display']"), "//div[text()='No records to display']");
		closeBrowser();

	}
}
