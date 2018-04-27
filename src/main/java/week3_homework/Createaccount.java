package week3_homework;

import org.junit.Test;

public class Createaccount extends ProjectMethod {

	@Test
	public void Creataccountscenario() throws InterruptedException
	{
		loginNavigation();
		click(locateElement("xpath", "//a[text()='Accounts']"));
		click(locateElement("xpath", "//a[text()='Create Account']"));
		type(locateElement("xpath", "//input[@id='accountName']"), "prasanthcc2");
		selectDropDownUsingText(locateElement("xpath", "//select[@name='industryEnumId']"), "Aerospace");
		selectDropDownUsingText(locateElement("xpath", "//select[@id='currencyUomId']"), "ADP - Andoran peseta");
		selectDropDownUsingIndex(locateElement("xpath", "//select[@id='dataSourceId']"),2);
		selectDropDownUsingText(locateElement("xpath", "//select[@id='marketingCampaignId']"), "Automobile");
		type(locateElement("xpath", "//input[@id='primaryPhoneNumber']"), "9996735342");
		type(locateElement("xpath", "//input[@id='generalCity']"), "chennai");
		type(locateElement("xpath", "//input[@id='primaryEmail']"), "prasanth@gmail.com");
		selectDropDownUsingText(locateElement("xpath", "//select[@id='generalCountryGeoId']"), "India");
		selectDropDownUsingText(locateElement("xpath", "//select[@id='generalStateProvinceGeoId']"), "CHANDIGARH");
		click(locateElement("xpath", "//input[@class='smallSubmit']"));
		verifyPartialText(locateElement("xpath", "//span[text()='Account Name']"), "prasanthcc2");
		click(locateElement("xpath", "//a[text()='Find Accounts']"));
		type(locateElement("xpath", "(//input[@name='accountName'])[2]"), "prasanthcc2");
		//type(locateElement("xpath", "//input[@name='id']"),"10800");
		click(locateElement("xpath", "//button[text()='Find Accounts']"));
		Thread.sleep(5000);
		verifyPartialText(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-groupName']/a[1]"), "prasanthcc2");
		closeBrowser();
	}
}
