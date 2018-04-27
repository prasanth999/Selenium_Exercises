package week3day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Movemouseover {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		//implicitly wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//Launch the browser
		driver.get("https://www.flipkart.com/");
		driver.findElementByXPath("//button[text()='✕']").click();
		WebElement tv = driver.findElementByXPath("//span[text()='TVs & Appliances']");
		WebElement ac = driver.findElementByXPath("//span[text()='Split ACs']");
		Actions builder = new Actions(driver);
		builder.moveToElement(tv).perform();
		Thread.sleep(5000);
		builder.click(ac).perform();

	}

}
