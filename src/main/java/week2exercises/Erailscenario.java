package week2exercises;

import org.junit.Test;
import org.openqa.selenium.Keys;

public class Erailscenario extends SeMethods {

	@Test
	public void erailtesting()
	{
	
		startApp("chrome", "https://erail.in/");
		clear(locateElement("xpath", "//input[@id='txtStationFrom']"));
		typetab(locateElement("xpath", "//input[@id='txtStationFrom']"),"Chennai","Keys.TAB");
		clear(locateElement("xpath", "//input[@id='txtStationTo']"));
		typetab(locateElement("xpath", "//input[@id='txtStationTo']"),"Bangalore","Keys.TAB");
		webTablerow(locateElement("xpath", "//table[@class='DataTable TrainList']"), 1);
		//webTable(locateElement("xpath", "//table[@class='DataTable TrainList']"));
		verifySelected(locateElement("xpath", "//input[@id='chkSelectDateOnly']"));
		webTablerow(locateElement("xpath", "//table[@class='DataTable TrainList']"), 2);
		//webTable(locateElement("xpath", "//table[@class='DataTable TrainList']"));
	}
	}
	

