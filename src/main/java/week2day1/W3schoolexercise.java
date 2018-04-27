package week2day1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

// Alert pop up window , Frames
//Capturing screen shots

public class W3schoolexercise {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		//implicitly wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//Launch the browser
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		//Screenshots capturing
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //The below method will save the screen shot in d drive with name "screenshot.png"
           FileUtils.copyFile(scrFile, new File("./screenshots/w3schools.png"));
		//or 
           File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
           File dest = new File("filPath/image1.png");
           FileUtils.copyFile(scr, dest);
           
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text()='Try it']").click();
		
		Alert myAlert = driver.switchTo().alert();
		myAlert.getText();
		myAlert.sendKeys("prasanth");
		driver.switchTo().alert().accept();
		
		String actualName = "Hello prasanth! How are you today?";
		String expectedName = driver.findElementByXPath("//p[@id='demo']").getText();
		
		System.out.println(expectedName);
		if (expectedName.contains(actualName)) {
		    System.out.println("Given text is Matched");
		} else {
		    System.out.println("Given text is Mismatched.");
		}
			

	}

}
