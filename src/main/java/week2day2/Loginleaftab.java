package week2day2;

import org.junit.Test;

public class Loginleaftab extends SeMethods

{

@Test
public void LoginTest()

{
	
	startApp("firefox", "http://www.leaftaps.com/opentaps");
	
	type(locateElement("id", "username"), "DemoSalesManager");
	
	type(locateElement("id", "password"), "crmsfa");
	
	click(locateElement("class", "decorativeSubmit"));
	
	click(locateElement("linktext", "CRM/SFA"));
	
	click(locateElement("linktext", "Leads"));
	
	click(locateElement("linktext", "Create Lead"));
	
    type(locateElement("id", "createLeadForm_companyName"), "TestLeaf");
	
	type(locateElement("id", "createLeadForm_firstName"), "Prasanth");
	
    type(locateElement("id", "createLeadForm_lastName"), "Sundaresan");
	
    click(locateElement("class", "smallSubmit"));
    
    getText(locateElement("xpath", "viewLead_companyName_sp"));	
		
}
				
		
	}


