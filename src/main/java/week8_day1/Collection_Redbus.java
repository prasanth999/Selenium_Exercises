package week8_day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Collection_Redbus {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/search?fromCityName=Chennai&fromCityId=123&toCityName=Bangalore&toCityId=122&onward=26-Apr-2018&opId=0&busType=Any");
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("service-name")));
		List<WebElement> name = driver.findElementsByClassName("service-name");
		
		Set<String> all_elements_text=new TreeSet<>();

	    for(int i=0; i<name.size(); i++){

	        //loading text of each element in to array all_elements_text
	        all_elements_text.add(name.get(i).getText());

	        

	    }
	  //to print directly
        System.out.println(all_elements_text);
		
	}



	}


