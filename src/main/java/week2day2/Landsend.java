package week2day2;

import org.testng.annotations.Test;

public class Landsend extends SeMethods {

	@Test
	public void salesOrder() throws InterruptedException
	{
		startApp("chrome", "https://landsend--qa.cs95.my.salesforce.com/");

		type(locateElement("xpath", "//input[@id='username']"), "prasanth.sundaresan@landsend.com.qa");

		type(locateElement("xpath", "//input[@id='password']"), "Ppm@2018");

		click(locateElement("xpath", "//input[@id='Login']"));

		click(locateElement("xpath", "//a[text()='Sales Orders']"));

		click(locateElement("xpath", "//input[@name='new']"));

		clickWithNoSnap(locateElement("xpath", "//img[@alt='Account Lookup (New Window)']"));

		switchToWindow(1);

		type(locateElement("xpath", "//input[@name='lksrch']"), "Delta UAT Testing");

		click(locateElement("xpath", "//input[@name='go']"));

		Thread.sleep(2000);

		clickWithNoSnap(locateElement("xpath", "//a[text()='Delta UAT Testing']"));

		switchToWindow(0);

	}
}
