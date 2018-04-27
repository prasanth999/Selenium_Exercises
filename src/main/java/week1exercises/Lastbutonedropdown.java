package week1exercises;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Lastbutonedropdown {

	public static void main(String[] args) {
		/* Write the pgm to select the 'last but one' option in any of the dropdown
		http://leafground.com/pages/Dropdown.html */
		
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

ChromeDriver driver = new ChromeDriver();

driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

driver.get("http://leafground.com/pages/Dropdown.html");

WebElement down1= driver.findElementByXPath("//select[@id='dropdown1']");

Select drop1 = new Select(down1);

List<WebElement> alloptions = drop1.getOptions();

int lastoption = alloptions.size()-1;
int i=0;

for (WebElement eachop : alloptions) {


	if (i==lastoption) {
		eachop.click();
	}
	i++;

	}

	}
}
