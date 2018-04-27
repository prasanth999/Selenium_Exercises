package week3exercises;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks_day1 {

	public static void main(String[] args) {

		System.setProperty("webdrivere.chrome.exe", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.uvdesk.com");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total links are :" + links.size());
		for (int i=1;i<links.size();i++)
		{
			WebElement ele = links.get(i);
			String urls = ele.getAttribute("href");
			System.out.println("List of urls" + urls);
			verifyLink(urls);	
		}
	}
		public static  void verifyLink(String urlLink) {
	        //Sometimes we may face exception "java.net.MalformedURLException". Keep the code in try catch block to continue the broken link analysis
	        try {
	            //Use URL Class - Create object of the URL Class and pass the urlLink as parameter 
	            URL link = new URL(urlLink);
	            // Create a connection using URL object (i.e., link)
	            HttpURLConnection httpConn =(HttpURLConnection)link.openConnection();
	            //Set the timeout for 2 seconds
	            httpConn.setConnectTimeout(2000);
	            //connect using connect method
	            httpConn.connect();
	            //use getResponseCode() to get the response code. 
	                if(httpConn.getResponseCode()== 200) {  
	                    System.out.println(urlLink+" - "+httpConn.getResponseMessage());
	                }
	                if(httpConn.getResponseCode()== 404) {
	                    System.out.println(urlLink+" - "+httpConn.getResponseMessage());
	                }
	            }
	            //getResponseCode method returns = IOException - if an error occurred connecting to the server. 
	        catch (Exception e) {
	            //e.printStackTrace();
	         
	        }
	}

}
