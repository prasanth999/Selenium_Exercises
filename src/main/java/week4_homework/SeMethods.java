package week4_homework;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.InvalidCookieDomainException;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.ErrorHandler.UnknownServerException;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class SeMethods implements WdMethods{

	RemoteWebDriver driver = null;
	Actions builder;
	public void startApp(String browser, String url) {
		try {
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
			else if (browser.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver", "./drivers/MicrosoftWebDriver.exe");
				driver = new EdgeDriver();
			}
			//Maximize the browser
			driver.manage().window().maximize();
			//Load the URL
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			System.out.println("The "+browser+" browser launched successfully");
		}
		catch (TimeoutException e) {
			System.err.println("Timeout exception occured");
			e.printStackTrace();
		}
		catch (InvalidCookieDomainException e) {
			System.err.println("InvalidCookieDomain exception occured");
			e.printStackTrace();
		}
		catch (NoSuchSessionException e) {
			System.err.println("NoSuchSession exception occured");
			e.printStackTrace();
		}
		catch (UnknownServerException e) {
			System.err.println("UnknownServer exception occured");
			e.printStackTrace();
		}
		catch (WebDriverException e) {
			System.err.println("Webdriver exception occured");
			e.printStackTrace();
		}		
		finally {
			takeSnap();
		}
	}

	public WebElement locateElement(String locator, String locValue) {
		WebElement ele = null;
		try {
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
		} catch (NoSuchElementException e) {
			System.err.println("No Such element exception occured");
			e.printStackTrace();
		}
		catch (InvalidArgumentException e) {
			System.err.println("InvalidArgument exception occured");
			e.printStackTrace();
		}
		catch (ElementNotVisibleException e) {
			System.err.println("ElementNotVisible exception occured");
			e.printStackTrace();
		}
		catch (InvalidElementStateException e) {
			System.err.println("InvalidElementState exception occured");
			e.printStackTrace();
		}
		catch (TimeoutException e) {
			System.err.println("Timeout exception occured");
			e.printStackTrace();
		}
		catch (WebDriverException e) {
			System.err.println("Webdriver exception occured");
			e.printStackTrace();
		}
		finally {
			takeSnap();
		}
		return ele;

	}

	public WebElement locateElement(String locValue) {
		return driver.findElementById(locValue);


	}

	public void type(WebElement ele, String data) {
		try {
			ele.sendKeys(data);
			System.out.println("The given value is entered "+data);
		}

		catch (ElementNotVisibleException e) {
			System.err.println("ElementNotVisible exception occured");
			e.printStackTrace();
		}
		catch (ElementNotInteractableException e) {
			System.err.println("ElementNotInteractable exception occured");
			e.printStackTrace();
		}
		catch (InvalidElementStateException e) {
			System.err.println("InvalidElementState exception occured");
			e.printStackTrace();
		}
		catch (WebDriverException e) {
			System.err.println("Webdriver exception occured");
			e.printStackTrace();
		}
		finally {
			takeSnap();
		}
	}

	public void typetab(WebElement ele, String data,String keys) {
		try {
			ele.sendKeys(data,Keys.TAB);
			System.out.println("The given value"+data+" is entered ");
		} 
		catch (ElementNotVisibleException e) {
			System.err.println("ElementNotVisible exception occured");
			e.printStackTrace();
		}
		catch (ElementNotInteractableException e) {
			System.err.println("ElementNotInteractable exception occured");
			e.printStackTrace();
		}
		catch (InvalidElementStateException e) {
			System.err.println("InvalidElementState exception occured");
			e.printStackTrace();
		}
		catch (WebDriverException e) {
			System.err.println("Webdriver exception occured");
			e.printStackTrace();
		}finally {
			takeSnap();
		}
	}

	public void clear(WebElement ele) {
		try {
			ele.clear();
			System.out.println("The element is clicked successfully");
		} 
		catch (ElementNotVisibleException e) {
			System.err.println("ElementNotVisible exception occured");
			e.printStackTrace();
		}
		catch (ElementNotInteractableException e) {
			System.err.println("ElementNotInteractable exception occured");
			e.printStackTrace();
		}
		catch (WebDriverException e) {
			System.err.println("Webdriver exception occured");
			e.printStackTrace();
		}finally {
			takeSnap();
		}
	}

	public void click(WebElement ele) {
		try {
			ele.click();
			System.out.println("The element is clicked successfully");
		} 

		catch (ElementNotVisibleException e) {
			System.err.println("ElementNotVisible exception occured");
			e.printStackTrace();
		}
		catch (ElementClickInterceptedException e) {
			System.err.println("ElementClickIntercepted exception occured");
			e.printStackTrace();
		}
		catch (ElementNotInteractableException e) {
			System.err.println("ElementNotInteractable exception occured");
			e.printStackTrace();
		}
		catch (WebDriverException e) {
			System.err.println("Webdriver exception occured");
			e.printStackTrace();
		}
		finally {
			takeSnap();
		}

	}
 	
	@Override
	public void clickWithNoSnap(WebElement ele) {
		try {
			ele.click();
			System.out.println("The element is clicked successfully");
		} 
		catch (ElementNotVisibleException e) {
			System.err.println("ElementNotVisible exception occured");
			e.printStackTrace();
		}
		catch (ElementClickInterceptedException e) {
			System.err.println("ElementClickIntercepted exception occured");
			e.printStackTrace();
		}
		catch (ElementNotInteractableException e) {
			System.err.println("ElementNotInteractable exception occured");
			e.printStackTrace();
		}
		catch (WebDriverException e) {
			System.err.println("Webdriver exception occured");
			e.printStackTrace();
		}

	}

	public String getText(WebElement ele) {
		String actualText = null ;
		try {
			actualText = ele.getText();
			System.out.println("The Given Text is matched successfully"+actualText);

		} 
		catch (ElementNotVisibleException e) {
			System.err.println("ElementNotVisible exception occured");
			e.printStackTrace();
		}
		catch (NoSuchElementException e) {
			System.err.println("NoSuchElement exception occured");
			e.printStackTrace();
		}
		catch (WebDriverException e) {
			System.err.println("Webdriver exception occured");
			e.printStackTrace();
		}finally {
			takeSnap();
		}
		return actualText;

	}

	public void selectDropDownUsingText(WebElement ele, String value) {
		try {
			Select drop = new Select(ele);
			drop.selectByVisibleText(value);
			System.out.println("The Dropdown using text is printed successfully"+value);
		}
		catch (InvalidSelectorException e) {
			System.err.println(	"InvalidSelector exception occured");
			e.printStackTrace();
		}
		catch (ElementNotSelectableException e) {
			System.err.println("ElementNotSelectable exception occured");
			e.printStackTrace();
		}
		catch (ElementNotVisibleException e) {
			System.err.println("ElementNotVisible exception occured");
			e.printStackTrace();
		}
		catch (NoSuchElementException e) {
			System.err.println("NoSuchElement exception occured");
			e.printStackTrace();
		}
		catch (WebDriverException e) {
			System.err.println("Webdriver exception occured");
			e.printStackTrace();
		}
		finally {
			takeSnap();
		}
	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {

		try {
			Select drop = new Select(ele);
			drop.selectByIndex(index);
			System.out.println("The Dropdown using index is printed successfully"+index);
		} 
		catch (InvalidSelectorException e) {
			System.err.println("InvalidSelector exception occured");
			e.printStackTrace();
		}
		catch (ElementNotSelectableException e) {
			System.err.println("ElementNotSelectable exception occured");
			e.printStackTrace();
		}
		catch (ElementNotVisibleException e) {
			System.err.println("ElementNotVisible exception occured");
			e.printStackTrace();
		}
		catch (NoSuchElementException e) {
			System.err.println("NoSuchElement exception occured");
			e.printStackTrace();
		}
		catch (WebDriverException e) {
			System.err.println("Webdriver exception occured");
			e.printStackTrace();
		}
		finally {
			takeSnap();
		}

	}

	public boolean verifyTitle(String expectedTitle) {
		try {
			String title = driver.getTitle();
			if(title.equals(expectedTitle))
			{
				System.out.println("Verify Title is printed successfully"+expectedTitle);
			}
		} 
		catch (ElementNotVisibleException e) {
			System.err.println("ElementNotVisible exception occured");
			e.printStackTrace();
		}
		catch (NoSuchElementException e) {
			System.err.println("NoSuchElement exception occured");
			e.printStackTrace();
		}
		catch (WebDriverException e) {
			System.err.println("Webdriver exception occured");
			e.printStackTrace();
		}
		finally {
			takeSnap();
		}
		return false;

	}

	public void verifyExactText(WebElement ele, String expectedText) {
		try {
			if(ele.getText().equals(expectedText))
			{
				System.out.println("The Exact Text"+ele.getText()+" is matched successfully"+expectedText);
			}
			else
			{
				System.out.println("Text is not matched");
			}
		} 
		catch (ElementNotVisibleException e) {
			System.err.println("ElementNotVisible exception occured");
			e.printStackTrace();
		}
		catch (NoSuchElementException e) {
			System.err.println("NoSuchElement exception occured");
			e.printStackTrace();
		}
		catch (WebDriverException e) {
			System.err.println("Webdriver exception occured");
			e.printStackTrace();
		}
		finally {
			takeSnap();
		}

	}

	public void verifyPartialText(WebElement ele, String expectedText) {
		try {
			if(ele.getText().contains(expectedText))
			{
				System.out.println("The Partial Text"+ele.getText()+" is matched successfully"+expectedText);
			}
			else
			{
				System.out.println("Text is not matched");
			}
		} 
		catch (ElementNotVisibleException e) {
			System.err.println("ElementNotVisible exception occured");
			e.printStackTrace();
		}
		catch (NoSuchElementException e) {
			System.err.println("NoSuchElement exception occured");
			e.printStackTrace();
		}
		catch (WebDriverException e) {
			System.err.println("Webdriver exception occured");
			e.printStackTrace();
		}
		finally {
			takeSnap();
		}
	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		try {
			if(ele.getAttribute(attribute).equals(value))
			{
				System.out.println("The Exact Attributes" +attribute + "is printed successfully"+value);
			}
			else
			{
				System.out.println("Attributes is not matched");
			}
		} 
		catch (ElementNotVisibleException e) {
			System.err.println("ElementNotVisible exception occured");
			e.printStackTrace();
		}
		catch (NoSuchElementException e) {
			System.err.println("NoSuchElement exception occured");
			e.printStackTrace();
		}
		catch (InvalidArgumentException e) {
			System.err.println("InvalidArgument exception occured");
			e.printStackTrace();
		}
		catch (WebDriverException e) {
			System.err.println("Webdriver exception occured");
			e.printStackTrace();
		}
		finally {
			takeSnap();
		}
	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		try {
			if(ele.getAttribute(attribute).contains(value))
			{
				System.out.println("The Partial Attributes" +attribute + "is printed successfully"+value);
			}
			else
			{
				System.out.println("Attributes is not matched");
			}
		} 
		catch (ElementNotVisibleException e) {
			System.err.println("ElementNotVisible exception occured");
			e.printStackTrace();
		}
		catch (NoSuchElementException e) {
			System.err.println("NoSuchElement exception occured");
			e.printStackTrace();
		}
		catch (InvalidArgumentException e) {
			System.err.println("InvalidArgument exception occured");
			e.printStackTrace();
		}
		catch (WebDriverException e) {
			System.err.println("Webdriver exception occured");
			e.printStackTrace();
		}
		finally {
			takeSnap();
		}
	}

	public void verifySelected(WebElement ele) {
		try {
			if(ele.isSelected())
			{
				System.out.println("Elements are selected successfully");
			}
			else
			{
				System.out.println("Elements are not selected successfully");
			}
		} 
		catch (InvalidSelectorException e) {
			System.err.println("InvalidSelector exception occured");
			e.printStackTrace();
		}
		catch (NoSuchElementException e) {
			System.err.println("NoSuchElement exception occured");
			e.printStackTrace();
		}
		catch (WebDriverException e) {
			System.err.println("Webdriver exception occured");
			e.printStackTrace();
		}
	}

	public void verifyDisplayed(WebElement ele) {
		try {
			if(ele.isDisplayed())
			{
				System.out.println("Element are visible");
			}
			else
			{
				System.out.println("Elements are not visisble");
			}
		} 
		catch (NoSuchElementException e) {
			System.err.println("NoSuchElement exception occured");
			e.printStackTrace();
		}
		catch (ElementNotVisibleException e) {
			System.err.println("ElementNotVisible exception occured");
			e.printStackTrace();
		}
		catch (InvalidElementStateException e) {
			System.err.println("InvalidElementState exception occured");
			e.printStackTrace();
		}
		catch (WebDriverException e) {
			System.err.println("Webdriver exception occured");
			e.printStackTrace();
		}
	}

	public void moveMouseOver(WebElement ele)
	{
		try {
			builder = new Actions(driver);
			builder.moveToElement(ele).perform();
			//builder.click(ele).perform();
			System.out.println("Element is Move mouse over sucessful");
		} 
		catch (NoSuchElementException e) {
			System.err.println("NoSuchElement exception occured");
			e.printStackTrace();
		}
		catch (WebDriverException e) {
			System.err.println("Webdriver exception occured");
			e.printStackTrace();
		}

		finally {
			takeSnap();
		}
	}
	public void moveMouseOverClick(WebElement ele)
	{
		try {
			builder = new Actions(driver);
			builder.click(ele).perform();
			System.out.println("Element is Move mouse over on click sucessful");
		} 
		catch (NoSuchElementException e) {
			System.err.println("NoSuchElement exception occured");
			e.printStackTrace();
		}
		catch (WebDriverException e) {
			System.err.println("Webdriver exception occured");
			e.printStackTrace();
		}

		finally {
			takeSnap();
		}
	}
	
	public void clickAndHold(WebElement ele)
	{
		try {
			builder = new Actions(driver);
			builder.moveToElement(ele).clickAndHold();
			System.out.println("Click and hold the Element sucessful");
		} 
		catch (NoSuchElementException e) {
			System.err.println("NoSuchElement exception occured");
			e.printStackTrace();
		}
		catch (WebDriverException e) {
			System.err.println("Webdriver exception occured");
			e.printStackTrace();
		}

		finally {
			takeSnap();
		}
	}
	
	public void moveMouseOverDoubleClick(WebElement ele)
	{
		try {
			builder = new Actions(driver);
			builder.doubleClick(ele).perform();
			System.out.println("Element is Move mouse over on doubeclick sucessful");
		} 
		catch (NoSuchElementException e) {
			System.err.println("NoSuchElement exception occured");
			e.printStackTrace();
		}
		catch (WebDriverException e) {
			System.err.println("Webdriver exception occured");
			e.printStackTrace();
		}

		finally {
			takeSnap();
		}
	}

	public void contextClick(WebElement ele)
	{
		try {
			builder = new Actions(driver);
			builder.contextClick(ele).click().build().perform();
			System.out.println("context click is performed sucessful");
		} 
		catch (NoSuchElementException e) {
			System.err.println("NoSuchElement exception occured");
			e.printStackTrace();
		}
		catch (WebDriverException e) {
			System.err.println("Webdriver exception occured");
			e.printStackTrace();
		}

		finally {
			takeSnap();
		}
	}

	
	public void dragDropBy(WebElement ele,WebElement ele1)
	{
		try {
			builder = new Actions(driver);
			builder.dragAndDropBy(ele, ele1.getLocation().getX(), ele1.getLocation().getY()).perform();
			System.out.println("Element is drag and drop by successful");
		} 
		catch (NoSuchElementException e) {
			System.err.println("NoSuchElement exception occured");
			e.printStackTrace();
		}
		catch (WebDriverException e) {
			System.err.println("Webdriver exception occured");
			e.printStackTrace();
		}
		finally {
			takeSnap();
		}

	}

	public void dragDrop(WebElement ele,WebElement ele1)
	{
		try {
			builder = new Actions(driver);
			builder.dragAndDrop(ele, ele1).perform();
			System.out.println("Element is drag and drop successful");
		} 
		catch (NoSuchElementException e) {
			System.err.println("NoSuchElement exception occured");
			e.printStackTrace();
		}
		catch (WebDriverException e) {
			System.err.println("Webdriver exception occured");
			e.printStackTrace();
		}
		finally {
			takeSnap();
		}

	}

	public void switchToWindow(int index) {
		try {
			Set<String> allwindows = driver.getWindowHandles();
			List<String> winList = new ArrayList<String>();
			winList.addAll(allwindows);
			driver.switchTo().window(winList.get(index));
			System.out.println("Switching to window successfully");
		}

		catch (NoSuchWindowException e) {
			System.err.println("No Window exception occured");
			e.printStackTrace();
		}
		catch (WebDriverException e) {
			System.err.println("Webdriver Exception occured");
			e.printStackTrace();
		}
		finally
		{
			takeSnap();
		}
	}

	public void switchToFrame(WebElement ele) {
		try {
			driver.switchTo().frame(ele);	
			System.out.println("Switching to frame successfully");
		} 
		catch (NoSuchFrameException e) {
			System.err.println("No such frame Exception occured");
			e.printStackTrace();
		}
		catch (WebDriverException e) {
			System.err.println("Webdriver Exception occured");
			e.printStackTrace();
		}
		finally
		{
			takeSnap();
		}
	}

	public void acceptAlert() {
		try {
			driver.switchTo().alert().accept();
			System.out.println("Accept the alert opened");
		} catch (NoAlertPresentException e) {
			System.err.println("NoAlertPresent Exception occured");
			e.printStackTrace();
		}
		catch (UnhandledAlertException e) {
			System.err.println("Un handle alert Exception occured");
			e.printStackTrace();
		}
		catch (WebDriverException e) {
			System.err.println("Webdriver Exception occured");
			e.printStackTrace();
		}

	}

	public void dismissAlert() {
		try {
			driver.switchTo().alert().dismiss();
			System.out.println("Dismiss the alert opened");
		} catch (NoAlertPresentException e) {
			System.err.println("NoAlertPresent Exception occured");
			e.printStackTrace();
		}
		catch (UnhandledAlertException e) {
			System.err.println("UnhandledAlert Exception occured");
			e.printStackTrace();
		}
		catch (WebDriverException e) {
			System.err.println("Webdriver Exception occured");
			e.printStackTrace();
		}

	}

	public String getAlertText() {
		String text = null;
		try {
			text = driver.switchTo().alert().getText();
			System.out.println("Return the text of the alert");
		} catch (NoAlertPresentException e) {
			System.err.println("NoAlertPresent Exception occured");
			e.printStackTrace();
		}
		catch (WebDriverException e) {
			System.err.println("Webdriver Exception occured");
			e.printStackTrace();
		}

		return text;

	}

	public void webTable(WebElement ele) {

		try {
			List<WebElement> rows = ele.findElements(By.tagName("tr"));
			List<WebElement> columns = rows.get(0).findElements(By.tagName("td"));
			for (WebElement tab : rows)
			{

				System.out.println(tab.getText());
			}
		} catch (WebDriverException e) {
			System.err.println("Webdriver Exception occured");
			e.printStackTrace();
		}

	}
	public  void webTablerow(WebElement table, int rowNum) {
		try {
			List<WebElement> rows = table.findElements(By.tagName("tr"));
			System.out.println("Totla no.of Rows = "+rows.size());
			System.out.println("Trains Names:");
			for (WebElement eachrow : rows) {
				System.out.println(eachrow.findElements(By.tagName("td")).get(rowNum).getText());
			}
		} catch (WebDriverException e) {
			System.err.println("Webdriver Exception occured");
			e.printStackTrace();
		}
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
		try {
			driver.close();
			System.out.println("Closed the active browser successfully");
		} 
		catch (TimeoutException e) {
			System.err.println("Timeout exception occured");
			e.printStackTrace();
		}
		catch (WebDriverException e) {
			System.err.println("Webdriver Exception occured");
			e.printStackTrace();
		}

	}

	public void closeAllBrowsers() {
		try {
			driver.quit();
			System.out.println("Closed all the browsers successfully");
		} 
		catch (TimeoutException e) {
			System.err.println("Timeout exception occured");
			e.printStackTrace();
		}
		catch (WebDriverException e) {
			System.err.println("Webdriver Exception occured");
			e.printStackTrace();
		}

	}

}
