package week3_homework;

import java.awt.RenderingHints.Key;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.security.auth.kerberos.KeyTab;

import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bankbazzar extends SeMethods {
	
	@Test

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.bankbazaar.com/personal-loan.html");
		Thread.sleep(5000);
		driver.findElementByXPath("(//a[@title='Get Quote'])[1]").click();
		Thread.sleep(5000);
		driver.findElementByXPath("(//span[@class='second-icon fui-radio-checked'])[1]").click();
		Thread.sleep(5000);
		driver.findElementByXPath("(//span[@class='second-icon fui-radio-checked'])[4]").click();
		Thread.sleep(5000);
		driver.findElementByXPath("(//input[@name='form.applicantPlaceHolder.companyName'])[2]").sendKeys("TCS", Keys.ENTER);
		
		Thread.sleep(5000);
		
		/*WebElement amount = driver.findElementByXPath("(//div[@class='tooltip-inner'])[4]");
		System.out.println(amount.getLocation());
		System.out.println(amount.getLocation().getY());
		System.out.println(amount.getText());*/
		
		WebElement amount = driver.findElementByXPath("(//div[@class='tooltip-inner'])[4]");
		System.out.println(amount.getLocation().getX());
		Actions builder3 = new Actions(driver);
		builder3.dragAndDropBy(amount, 50, 0).perform();
		System.out.println(amount.getLocation().getX());
		System.out.println(amount.getText());
		
		/*String price = driver.findElementByXPath("//input[@id='form_details_applicant_income_monthlyTakeHomeSalary']").getText();
		System.out.println(price);*/	
		

	}

}
