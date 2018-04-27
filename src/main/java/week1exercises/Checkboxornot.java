package week1exercises;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxornot {

	public static void main(String[] args) {
		/*
		 How to verify if the given checkbox is checked or not (it is not taught 
		 but you can explore) try here:
		 http://leafground.com/pages/checkbox.html
		 */
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://leafground.com/pages/checkbox.html");
		
		boolean check = driver.findElementByXPath("//section[@class='innerblock']/div[2]/input").isSelected(); 
		boolean check1 = driver.findElementByXPath("//section[@class='innerblock']/div[4]/input").isSelected(); 
		System.out.println(check); 
		System.out.println(check1); 
		if(check==true)
		{
			System.out.println("Check box is checked");
		}
		else
		{
		System.out.println("check box is Not checked");
		}
		if(check1==true)
		{
			System.out.println("Check box is checked");
		}
		else
		{
		System.out.println("check box is Not checked");
		}
		
		} 
	}
		
