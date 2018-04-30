package week8_day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Repeatingvalues {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.flipkart.com/");

		driver.findElementByXPath("//button[text()='✕']").click();

		driver.findElementByName("q").sendKeys("bags", Keys.ENTER);

		Thread.sleep(5000);
		/*
		WebDriverWait wait = new WebDriverWait(driver, 20);

		wait.until(ExpectedConditions.attributeToBe(By.xpath("//div[@class='_1vC4OE']"), null, null));*/

		List<WebElement> prices = driver.findElementsByXPath("//div[@class='_1vC4OE']");

		List<Integer> priceList = new ArrayList<>();	

		for (WebElement price : prices) {

			int amt = Integer.parseInt(price.getText().replaceAll("[â‚¹,]", ""));

			System.out.println(amt);

			priceList.add(amt);
		}

		Collections.sort(priceList);

		System.out.print("Lowest price among the bags: ");

		System.out.println(priceList.get(0));

		System.out.println("Amount in the list of Array: ");

		System.out.println(priceList);

			
		driver.close();

	}

}
