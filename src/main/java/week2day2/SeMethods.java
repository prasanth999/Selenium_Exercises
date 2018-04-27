package week2day2;

import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.expectThrows;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class SeMethods implements WdMethods{

	RemoteWebDriver driver = null;
	public void startApp(String browser, String url) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			 driver = new ChromeDriver();
		}else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver_32bit.exe");
			 driver = new FirefoxDriver();
		}
		else if (browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/IEDriverServer.exe");
			 driver = new FirefoxDriver();
		}
		//Maximize the browser
		driver.manage().window().maximize();
		//Load the URL
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("The "+browser+" browser launched successfully");
		takeSnap();
	}

	public WebElement locateElement(String locator, String locValue) {
		WebElement ele = null;
		switch (locator) {
		case "id":
			ele = driver.findElementById(locValue);
			break;
		case "class":
			ele = driver.findElementByClassName(locValue);
			break;
		case "linktext":
			ele = driver.findElementByLinkText(locValue);
			break;
		case "tagname":
			ele = driver.findElementByTagName(locValue);
			break;
		case "classname":
			ele = driver.findElementByClassName(locValue);
			break;
		case "xpath":
			ele = driver.findElementByXPath(locValue);
			break;	
		case "cssselector":
			ele = driver.findElementByCssSelector(locValue);
			break;
		case "partiallinktext":
			ele = driver.findElementByPartialLinkText(locValue);
			break;
		}
	    
		takeSnap();
		return ele;
		
	}

	public WebElement locateElement(String locValue) {
		return driver.findElementById(locValue);
		
	}

	public void type(WebElement ele, String data) {
		ele.sendKeys(data);
		System.out.println("The given value is entered "+data);
		takeSnap();
	}

	public void clear(WebElement ele) {
		ele.clear();
		System.out.println("The element is clicked successfully");
		takeSnap();
	}
	
	public void click(WebElement ele) {
		ele.click();
		System.out.println("The element is clicked successfully");
		takeSnap();
	}

	@Override
	public void clickWithNoSnap(WebElement ele) {
		ele.click();
		System.out.println("The element is clicked successfully");
		
	}
	
	public String getText(WebElement ele) {
	    
		String actualText = ele.getText();
	    System.out.println("The Given Text is matched successfully"+actualText);
		takeSnap();
		return actualText;
	}

	public void selectDropDownUsingText(WebElement ele, String value) {
		Select drop = new Select(ele);
		drop.selectByVisibleText(value);
		System.out.println("The Dropdown using text is printed successfully"+value);
		takeSnap();
	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {
		
		Select drop = new Select(ele);
		drop.selectByIndex(index);
		System.out.println("The Dropdown using index is printed successfully"+index);
		takeSnap();
	}

	public boolean verifyTitle(String expectedTitle) {
		String title = driver.getTitle();
		if(title.equals(expectedTitle))
		{
		System.out.println("Verify Title is printed successfully"+expectedTitle);
		}
		takeSnap();
		return false;
		
	}

	public void verifyExactText(WebElement ele, String expectedText) {
		if(ele.getText().equals(expectedText))
		{
		System.out.println("The Exact Text"+ele.getText()+" is matched successfully"+expectedText);
		}
		else
		{
			System.out.println("Text is not matched");
		}
		takeSnap();
	}

	public void verifyPartialText(WebElement ele, String expectedText) {
		if(ele.getText().contains(expectedText))
		{
		System.out.println("The Partial Text"+ele.getText()+" is matched successfully"+expectedText);
		}
		else
		{
			System.out.println("Text is not matched");
		}
		takeSnap();
	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		if(ele.getAttribute(attribute).equals(value))
		{
		System.out.println("The Exact Attributes" +attribute + "is printed successfully"+value);
		}
		else
		{
			System.out.println("Attributes is not matched");
		}
		takeSnap();
	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		if(ele.getAttribute(attribute).contains(value))
		{
		System.out.println("The Partial Attributes" +attribute + "is printed successfully"+value);
		}
		else
		{
			System.out.println("Attributes is not matched");
		}
		takeSnap();
	}

	public void verifySelected(WebElement ele) {
		if(ele.isSelected())
		{
System.out.println("Elements are selected successfully");
	}
		else
		{
			System.out.println("Elements are not selected successfully");
		}
		}

	public void verifyDisplayed(WebElement ele) {
		if(ele.isDisplayed())
		{
		System.out.println("Element are visible");
		}
		else
		{
			System.out.println("Elements are not visisble");
		}
		}

	public void switchToWindow(int index) {
        Set<String> allwindows = driver.getWindowHandles();
        List<String> winList = new ArrayList<String>();
		winList.addAll(allwindows);
		driver.switchTo().window(winList.get(index));
		System.out.println("Switching to window successfully");
		takeSnap();
	}
	
	public void switchToFrame(WebElement ele) {
		driver.switchTo().frame(ele);	
		System.out.println("Switching to frame successfully");
		takeSnap();
	}

	public void acceptAlert() {
		driver.switchTo().alert().accept();
        System.out.println("Accept the alert opened");
	}

	public void dismissAlert() {
		driver.switchTo().alert().dismiss();
        System.out.println("Dismiss the alert opened");

	}

	public String getAlertText() {
		String text = driver.switchTo().alert().getText();
        System.out.println("Return the text of the alert");
		return text;
	}

	int i =1;
	public void takeSnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File des = new File("./snaps/img"+i+".png");
		try {
			FileUtils.copyFile(src, des);
		} catch (IOException e) {		
			e.printStackTrace();
		}
		i++;
	}

	public void closeBrowser() {
		driver.close();
		System.out.println("Closed the active browser successfully");

	}

	public void closeAllBrowsers() {
		driver.quit();
		System.out.println("Closed all the browsers successfully");

	}

}
