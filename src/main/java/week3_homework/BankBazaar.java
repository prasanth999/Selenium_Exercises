package week3_homework;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class BankBazaar extends SeMethods {
	@Test
	public void bankbazaar() throws InterruptedException  
	{
		startApp("chrome", "https://www.bankbazaar.com/personal-loan.html");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='Custom quote']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='sprite-gender icon-gender-male']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='sprite-city icon-city-chennai']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='js-question-item  validate  tt-input']")).sendKeys("Financial Software Systems",Keys.ENTER);
		Thread.sleep(2000);

		WebElement slide = driver.findElement(By.xpath("//div[@class='eform-slider-1 ']//div[@class='slider slider-horizontal']//div[@class='tooltip-inner'][1]"));
		slide.click();
		Thread.sleep(2000);

		System.out.println(slide.getText());
		int x=slide.getLocation().getX();
		int y=slide.getLocation().getY();
		//System.out.println(x + "+" +y);
		//WebElement amountVal = locateElement("xPath", "//*[@id=\"tooltip\"]/div[2]");

		String maxAmount="42,000";
		int n=1;
		Actions move=new Actions(driver);
		for(int  i=0;i<=n;i++)
		{
			move.dragAndDropBy(slide, 5, 0).build().perform();

			x=slide.getLocation().getX();
			
			String oAmount = slide.getText();

			if(oAmount.equalsIgnoreCase(maxAmount))
			{
				System.out.println(oAmount);
				break;
			}
			else
			{
				System.out.println(oAmount);
			}

			n=n+1;
		}


		driver.close();
		//WebElement salVal = locateElement("xPath", "//*[@id=\"form_details_applicant_income_monthlyTakeHomeSalary\"]");




	}

}
