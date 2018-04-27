package week3_homework;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bankbazzar1 {

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
				
				WebElement slide = driver.findElement(By.xpath("//div[@class='eform-slider-1 ']//div[@class='slider slider-horizontal']//div[@class='tooltip-inner'][1]"));
				
				//slide.click();
				Actions move=new Actions(driver);
				for(int  i=0;i<=50;i++)
				{

					int x1=5;
					move.dragAndDropBy(slide, x1, 0).build().perform();
					x1=slide.getLocation().getX();
					//y1=slide.getLocation().getY();
					System.out.println(x1);
					System.out.println(slide.getText());
					x1=x1+10;

				}
				
				
	}
}
