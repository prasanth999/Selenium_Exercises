package week4day1;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnReport {

	public static void main(String[] args) throws IOException {
		ExtentHtmlReporter html = new ExtentHtmlReporter("./reports/result.html");
		html.setAppendExisting(true);
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(html);
		
		ExtentTest test = extent.createTest("TC002_EditLead","Edit a Lead");
		test.assignAuthor("prasanth");
		test.assignCategory("Smoke Test");
		
		test.pass("Data DemoSalesManger Enter Successfully", MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img1.png").build());
		
		test.pass("Data crmsfa Enter Successfully", MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img2.png").build());
		
		test.fail("Login button clicked");
		
		extent.flush();

	}

}
