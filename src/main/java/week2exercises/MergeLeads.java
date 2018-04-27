package week2exercises;

import org.junit.Test;

public class MergeLeads extends ProjectMethod{
	
	@Test

	public void Mergeleadscenario() throws InterruptedException
	
	{
		loginNavigation();
		
		click(locateElement("xpath", "//a[contains(text(),'Merge Leads')]"));
		
		clickWithNoSnap(locateElement("xpath", "//table[@name='ComboBox_partyIdFrom']/following::img[1]"));
		
		switchToWindow(1);
		
		type(locateElement("xpath", "//label[text()='Lead ID:']/following::input[1]"), "10011");
		
		click(locateElement("xpath", "//button[text()='Find Leads']"));
		
		Thread.sleep(2000);
		
		clickWithNoSnap(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId'][1]/a"));
		
		switchToWindow(0);
		
		clickWithNoSnap(locateElement("xpath", "//table[@name='ComboBox_partyIdTo']/following::img[1]"));
		
		switchToWindow(1);
		
        type(locateElement("xpath", "//label[text()='Lead ID:']/following::input[1]"), "10013");
		
        click(locateElement("xpath", "//button[text()='Find Leads']"));
		
		Thread.sleep(2000);
	
		clickWithNoSnap(locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId'][1]/a"));
		
		switchToWindow(0);
		
		clickWithNoSnap(locateElement("xpath", "//a[text()='Merge']"));
		
		acceptAlert();
		
		clickWithNoSnap(locateElement("xpath", "//a[text()='Find Leads']"));
		
		type(locateElement("xpath", "//label[text()='Lead ID:']/following::input[1]"),"124");
		
		click(locateElement("xpath", "//button[text()='Find Leads']"));
		
		getText(locateElement("xpath", "//div[contains(text(),'No records to display')]"));
		
	}
	
}
