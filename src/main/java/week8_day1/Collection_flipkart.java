package week8_day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Collection_flipkart {
	
	//Collection - List - Array List
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
		driver.findElementByXPath("//button[text()='✕']").click();
		driver.findElementByXPath("(//input[@type='text'])[1]").sendKeys("Bag",Keys.ENTER);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("_1vC4OE")));
		List<WebElement> name = driver.findElementsByClassName("_1vC4OE");
		
		List<String> all_elements_text=new ArrayList<>();

	    for(int i=0; i<name.size(); i++){

	        //loading text of each element in to array all_elements_text
	        all_elements_text.add(name.get(i).getText());
	    }
	  Collections.sort(all_elements_text);

	        //to print directly
	        System.out.println(all_elements_text);

	    
		
		
	}

}
/*List<WebElement> list = new ArrayList<WebElement>();
list.addAll(name);
for(int i =0; i<list.size() ; i++)
{
	
	System.out.println(list.get(i).getText());
	
}

System.out.println(list);
*/