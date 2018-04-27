package week2exercises;

import org.junit.Test;

public class Actionspe extends SeMethods{
@Test
	public void moveMous() throws InterruptedException
	{
		startApp("chrome", "https://jqueryui.com/sortable/");
		switchToFrame(locateElement("xpath", "//iframe[@class='demo-frame']"));
		dragDropBy(locateElement("xpath", "//li[text()='Item 1']"), locateElement("xpath", "//li[text()='Item 3']"));
		
	}
	
}
