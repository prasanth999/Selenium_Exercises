package week5day1;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class ProjectMethod extends SeMethods {

	@Parameters({"url","username","password"})
	@BeforeMethod
	public void loginNavigation(String url,String username,String password)

	{
		startApp("chrome",url);

		type(locateElement("xpath", "//input[@id='username']"),username);

		type(locateElement("xpath", "//input[@id='password']"), password);

		click(locateElement("xpath", "//input[@class='decorativeSubmit']"));

		click(locateElement("xpath", "//a[contains(text(),'CRM/SFA')]"));
		//click(locateElement("xpath", "//a[contains(text(),'Leads')]"));
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
	
	@DataProvider(name="fetch")
	public Object readExcel() throws IOException
	{
		ReadingExcel excel = new ReadingExcel();
		return excel.readExcel();
	}
}




