package week8_day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GreatestAmount {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.flipkart.com/");

		driver.findElementByXPath("//button[text()='✕']").click();

		driver.findElementByName("q").sendKeys("bags", Keys.ENTER);

	//	Thread.sleep(5000);
		
		WebDriverWait wait = new WebDriverWait(driver, 50);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='_3auQ3N'])[40]")));
		
		List<WebElement> prices = driver.findElementsByXPath("//div[@class='_3auQ3N']");

		List<Integer> priceList = new ArrayList<>();	

		for (WebElement price : prices) {

			int amt = Integer.parseInt(price.getText().replaceAll("\\D", ""));

			System.out.println(amt);

			priceList.add(amt);
		}

		Collections.sort(priceList);

		int size = prices.size();
		
		System.out.println("Amount in the list of Array: ");

		System.out.println(priceList);
		
		System.out.print("Highest value before discount: ");

		System.out.println(priceList.get(size-1));
			
		driver.close();

	}

}
