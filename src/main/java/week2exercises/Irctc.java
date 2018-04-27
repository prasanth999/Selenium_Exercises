package week2exercises;

import org.junit.Test;

public class Irctc extends SeMethods{

	@Test

	public void LoginCreation()
	{
		startApp("chrome", "https://www.irctc.co.in/eticketing/loginHome.jsf");
		click(locateElement("xpath", "//a[text()='Sign up']"));
		type(locateElement("xpath", "//input[@id='userRegistrationForm:userName']"), "prasanth");
		click(locateElement("xpath", "//a[text()='Check Availability']"));
		verifyExactText(locateElement("xpath", "//label[@id='userRegistrationForm:useravailn']"), "User Id already exists .... Please choose a different User Name...");
		type(locateElement("xpath", "//input[@id='userRegistrationForm:password']"), "sundaresan");
		type(locateElement("xpath", "//input[@id='userRegistrationForm:confpasword']"), "sundaresan");
		selectDropDownUsingText(locateElement("xpath", "//select[@id='userRegistrationForm:securityQ']"), "Who was your Childhood hero?");
		type(locateElement("xpath", "//input[@id='userRegistrationForm:securityAnswer']"), "sundaresan");
		selectDropDownUsingText(locateElement("xpath", "//select[@id='userRegistrationForm:prelan']"), "English");
        type(locateElement("xpath", "//input[@id='userRegistrationForm:firstName']"), "prasanth");
        type(locateElement("xpath", "//input[@id='userRegistrationForm:middleName']"), "s");
        type(locateElement("xpath", "//input[@id='userRegistrationForm:lastName']"), "sun");
        click(locateElement("xpath", "//input[@id='userRegistrationForm:gender:0']"));
        click(locateElement("xpath", "//input[@id='userRegistrationForm:maritalStatus:0']"));
        selectDropDownUsingIndex(locateElement("xpath", "//select[@id='userRegistrationForm:dobDay']"), 11);
        selectDropDownUsingIndex(locateElement("xpath", "//select[@id='userRegistrationForm:dobMonth']"), 3);
        selectDropDownUsingIndex(locateElement("xpath", "//select[@id='userRegistrationForm:dateOfBirth']"), 9);
        selectDropDownUsingIndex(locateElement("xpath", "//select[@id='userRegistrationForm:occupation']"), 3);
        selectDropDownUsingText(locateElement("xpath", "//select[@id='userRegistrationForm:countries']"), "India");
        type(locateElement("xpath", "//input[@id='userRegistrationForm:email']"), "prasanthsun@gmail.com");
        type(locateElement("xpath", "//input[@id='userRegistrationForm:mobile']"), "789789");
        selectDropDownUsingIndex(locateElement("xpath", "//select[@id='userRegistrationForm:nationalityId']"), 4);
        type(locateElement("xpath", "//input[@id='userRegistrationForm:address']"), "chennai");

        driver.close();
	}

}
