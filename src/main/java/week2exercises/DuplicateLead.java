package week2exercises;

import org.junit.Test;

public class DuplicateLead extends ProjectMethod {
@Test
	public void DuplicateLeadScenario() throws InterruptedException
	{
	loginNavigation();

    click(locateElement("xpath", "//a[contains(text(),'Find Leads')]"));
    
    click(locateElement("xpath", "//span[text()='Email']"));

    type(locateElement("xpath", "//input[@name='emailAddress']"), "prasanth@gmail.com");

    click(locateElement("xpath", "//button[text()='Find Leads']"));
    
    Thread.sleep(5000);

    click(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
	
	click(locateElement("xpath", "//a[text()='Duplicate Lead']"));
	
	verifyExactText(locateElement("xpath", "//div[text()='Duplicate Lead']"), "Duplicate Lead");
	
	click(locateElement("xpath", "//input[@class='smallSubmit']"));
	
	verifyPartialText(locateElement("xpath", "//span[@id='viewLead_companyName_sp']"), "prasanth");
	
	driver.close();
	}
}
