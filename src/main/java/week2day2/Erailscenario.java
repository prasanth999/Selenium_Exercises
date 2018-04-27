package week2day2;

import org.junit.Test;

public class Erailscenario extends SeMethods {

	@Test
	public void erailtesting()
	{
	
		startApp("chrome", "https://erail.in/");
		clear(locateElement("xpath", "//input[@id='txtStationFrom']"));
		type(locateElement("xpath", "//input[@id='txtStationFrom']"),"Chennai");
		clear(locateElement("xpath", "//input[@id='txtStationTo']"));
		type(locateElement("xpath", "//input[@id='txtStationTo']"),"Chennai");
		
	}
	}
	

