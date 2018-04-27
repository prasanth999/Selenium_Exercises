package week8_day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(op);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.redbus.in");
		
		//driver.get("https://www.redbus.in/");
		
		driver.findElementById("src").sendKeys("Chennai" , Keys.TAB);
		
		driver.findElementById("dest").sendKeys("Bangalore");
	//	(//table[@class='rb-monthTable first last'])[1]//tr[7]/td[4] 
		
		//driver.findElementById("onward_cal").sendKeys("26-Apr-2018", Keys.ENTER);
		//driver.findElementByXPath("(//input[@type='text'])[3]").sendKeys("26-Apr-2018");
		
		WebElement fromDate = driver.findElementById("onward_cal");
		Actions act = new Actions(driver);
		act.moveToElement(fromDate).click().pause(1000).perform();
		
		driver.findElementByXPath("(//table[@class='rb-monthTable first last'])[2]//tr[7]/td[4]").click();
		
		
		WebElement toDate = driver.findElementById("return_cal");
		
		act.moveToElement(toDate).click().pause(1000).perform();
		
		driver.findElementByXPath("(//table[@class='rb-monthTable first last'])[2]//tr[7]/td[4]").click();
		 
		 
//		driver.findElementById("search_btn").click();
//		
//		
//		Thread.sleep(3000);
//				
//		List<WebElement> element = driver.findElementsByClassName("service-name");
//		
//		Thread.sleep(3000);
//		
//		//driver.findElementByXPath("(//label[@for='showRedDeals'])[1]").click();
//		
//		Thread.sleep(3000);
//				
//		Set<String> operators = new TreeSet<>();
//		
//		for (WebElement operator : element) {
//			
//			operators.add(operator.getText());
//														
//		}
//		
//		System.out.println(operators);
//						
//		driver.close();
			

	}

}
