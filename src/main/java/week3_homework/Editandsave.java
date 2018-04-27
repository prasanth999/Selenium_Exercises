package week3_homework;

import org.junit.Test;

public class Editandsave extends ProjectMethod {

	@Test
	public void Editsavescenario() throws InterruptedException
	{
		loginNavigation();
		click(locateElement("xpath", "//a[text()='Accounts']"));
		click(locateElement("xpath", "//a[text()='Find Accounts']"));
		type(locateElement("xpath", "(//input[@name='accountName'])[2]"), "prasanthtest1");
		type(locateElement("xpath", "//input[@name='id']"),"10755");
		click(locateElement("xpath", "//button[text()='Find Accounts']"));
		Thread.sleep(5000);
		click(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]"));
		verifyTitle("Account Details | opentaps CRM");
		click(locateElement("xpath", "//a[text()='Edit']"));
		clear(locateElement("xpath", "//input[@id='accountName']"));
		type(locateElement("xpath", "//input[@id='accountName']"), "prasanthsuntest4");
		click(locateElement("xpath", "//input[@class='smallSubmit']"));
		verifyPartialText(locateElement("xpath", "(//span[@class='tabletext'])[3]"), "prasanthsuntest4 (10755)");
		closeBrowser();

	}

}
