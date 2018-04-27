package week3_day2_projectwork;

import org.junit.Test;

public class Merge_Account extends ProjectMethod {
	@Test
	public void MergingScenario() throws InterruptedException
	{
		loginNavigation();
		click(locateElement("xpath", "//a[text()='Accounts']"));
		click(locateElement("xpath", "//a[text()='Merge Accounts']"));
		clickWithNoSnap(locateElement("xpath", "(//img[@alt='Lookup'])[1]"));
		switchToWindow(1);
		type(locateElement("xpath", "//input[@name='id']"), "11472");
		clickWithNoSnap(locateElement("xpath", "//button[text()='Find Accounts']"));
		Thread.sleep(5000);
		clickWithNoSnap(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]"));
	    switchToWindow(0);
	    clickWithNoSnap(locateElement("xpath", "(//img[@alt='Lookup'])[2]"));
		switchToWindow(1);
		type(locateElement("xpath", "//input[@name='id']"), "11474");
		clickWithNoSnap(locateElement("xpath", "//button[text()='Find Accounts']"));
		Thread.sleep(5000);
		clickWithNoSnap(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]"));
	    switchToWindow(0);
	    clickWithNoSnap(locateElement("xpath", "//a[text()='Merge']"));
	    acceptAlert();
	    clickWithNoSnap(locateElement("xpath", "//a[text()='Find Accounts']"));
	    type(locateElement("xpath", "//input[@name='id']"), "11472");
	    click(locateElement("xpath", "//button[text()='Find Accounts']"));
	    verifyExactText(locateElement("xpath", "//div[text()='No records to display']"), "No records to display");
	    closeBrowser();
	
	}

}
