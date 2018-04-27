package week1day1;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Irctcsingup {

	public static void main(String[] args) throws InterruptedException {
		
	 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	 
	 ChromeDriver driver = new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 driver.get("http://www.irctc.co.in/eticketing/loginHome.jsf");
	 
	 //click on sign up link from home page
	 driver.findElementByLinkText("Sign up").click();
	 
	 //Navigate to Registration page
	 
	 driver.findElementById("userRegistrationForm:firstName").sendKeys("prasanth");
	 driver.findElementById("userRegistrationForm:lastName").sendKeys("sundaresan");
	 driver.findElementById("userRegistrationForm:gender:0").click();
	 driver.findElementById("userRegistrationForm:maritalStatus:1").click();
	 
	 //DOB field
	 WebElement register = driver.findElementById("userRegistrationForm:dobDay");
	 Select ssa = new Select(register);
	 ssa.selectByVisibleText("02");
	
	 
	 WebElement register1 = driver.findElementById("userRegistrationForm:dobMonth");
	 Select ssb = new Select(register1);
	 ssb.selectByVisibleText("MAR");
	 
	 WebElement register2 = driver.findElementById("userRegistrationForm:dateOfBirth");
	 Select ssc = new Select(register2);
	 ssc.selectByVisibleText("1990");
	 
	 // 	Occupation fields
	 
	 WebElement register4 = driver.findElementById("userRegistrationForm:occupation");
	 Select ss4 = new Select(register4);
	 
	 List<WebElement> allOptions = ss4.getOptions();
		
	 ss4.selectByIndex(allOptions.size()-2);
	 
	 //Country field
	 
	 WebElement register5 = driver.findElementById("userRegistrationForm:countries");
	 Select ss5 = new Select(register5);
	 
	 ss5.selectByVisibleText("India");
	 ss5.getFirstSelectedOption();
	 //email id
	 
	 driver.findElementById("userRegistrationForm:email").sendKeys("prasanth@gmail.com");
	 
	 driver.findElementById("userRegistrationForm:mobile").sendKeys("9956781234");
	 
	//Nationality
	 
	 WebElement register6 = driver.findElementById("userRegistrationForm:nationalityId");
	 Select ss6 = new Select(register6);
	 
	 List<WebElement> allOptions2 = ss6.getOptions();
		
	 ss6.selectByIndex(allOptions.size()-4);
	 
	 //flat no details
	 
	 driver.findElementById("userRegistrationForm:address").sendKeys("20 cross");
	 
	 driver.findElementById("userRegistrationForm:pincode").sendKeys("600056");
	 
	 
	 
	 driver.findElementById("userRegistrationForm:statesName").click();
	 
	 Thread.sleep(5000);
	 //city field value
	 
	 WebElement register7 = driver.findElementById("userRegistrationForm:cityName");
	 Select ss7 = new Select(register7);
	 ss7.selectByVisibleText("Tiruvallur");
	 /*List<WebElement> allOptions3 = ss7.getOptions();
		
	 ss7.selectByIndex(allOptions.size()-1);*/
	 Thread.sleep(5000);
	 // post office field value
	 
	 WebElement register8 = driver.findElementById("userRegistrationForm:postofficeName");
	 Select ss8 = new Select(register8);
	 ss8.selectByVisibleText("Senneerkuppam B.O");
	 /*List<WebElement> allOptions5 = ss8.getOptions();
	 
	 ss8.selectByIndex(allOptions5.size()-1);*/
	 
	 //phone no
	 
	 driver.findElementById("userRegistrationForm:landline").sendKeys("987656780");
	 driver.findElementById("userRegistrationForm:resAndOff:0").click();
	 
	 
	 
	 
	 
	 driver.close();
	 
	 
	 
	}

}
