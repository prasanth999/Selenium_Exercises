package week3_homework;

import org.junit.Test;

public class Createcontact extends ProjectMethod {
	@Test
	public void Creatingcontactscenario()
	{
		loginNavigation();
		click(locateElement("xpath", "//a[text()='Contacts']"));
		click(locateElement("xpath", "//a[text()='Create Contact']"));
		type(locateElement("xpath", "(//input[@name='firstName'])[3]"), "prasanth");
		type(locateElement("xpath", "(//input[@name='lastName'])[3]"), "test1");
		type(locateElement("xpath", "//input[@name='firstNameLocal']"), "sampletest");
		type(locateElement("xpath", "//input[@name='lastNameLocal']"), "done");
		type(locateElement("xpath", "//input[@id='createContactForm_personalTitle']"), "daat1");
		type(locateElement("xpath", "//input[@id='createContactForm_generalProfTitle']"), "data2");
		type(locateElement("xpath", "//input[@id='createContactForm_departmentName']"), "data3");
		selectDropDownUsingText(locateElement("xpath", "//select[@id='createContactForm_preferredCurrencyUomId']"), "AMD - Armenian Dram");
		type(locateElement("xpath", "//textarea[@id='createContactForm_description']"), "data5");
		type(locateElement("xpath", "//textarea[@id='createContactForm_importantNote']"), "data6");
		type(locateElement("xpath", "//input[@id='createContactForm_primaryPhoneCountryCode']"), "1");
		type(locateElement("xpath", "//input[@id='createContactForm_primaryPhoneAreaCode']"), "91");
		type(locateElement("xpath", "//input[@id='createContactForm_primaryPhoneExtension']"), "91");	
		type(locateElement("xpath", "//input[@id='createContactForm_primaryPhoneNumber']"), "999480778");
		type(locateElement("xpath", "//input[@id='createContactForm_primaryPhoneAskForName']"), "data8");
		verifyPartialText(locateElement("xpath", "//input[@id='generalToNameField']"), "prasanth test1");
		type(locateElement("xpath", "//input[@id='createContactForm_generalAttnName']"), "data6");
		type(locateElement("xpath", "//input[@id='createContactForm_generalAddress1']"), "data7");
		type(locateElement("xpath", "//input[@id='createContactForm_generalAddress2']"), "data8");
		type(locateElement("xpath", "//input[@id='createContactForm_generalCity']"), "data63");
		selectDropDownUsingText(locateElement("xpath", "//select[@id='createContactForm_generalStateProvinceGeoId']"), "California");
		type(locateElement("xpath", "//input[@id='createContactForm_generalPostalCode']"), "76786876");
		selectDropDownUsingText(locateElement("xpath", "//select[@id='createContactForm_generalCountryGeoId']"), "United States");
		type(locateElement("xpath", "//input[@id='createContactForm_generalPostalCodeExt']"), "76786876");
		click(locateElement("xpath", "//input[@class='smallSubmit']"));
		closeBrowser();
	
	}

}
