package challenge;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
//import ru.yandex.qatools.ashot.AShot;
//import ru.yandex.qatools.ashot.Screenshot;
//import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.util.concurrent.TimeUnit;

public class FullPageScreenshotAShot {

    @Test
    public void fullPageScreenShot() throws Exception {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://leaftaps.com/opentaps/");
        driver.findElementById("username").sendKeys("DemoSalesManager");
        driver.findElementById("password").sendKeys("crmsfa");
        driver.findElementByClassName("decorativeSubmit").click();

        driver.findElementByLinkText("CRM/SFA").click();

        driver.findElementByLinkText("Leads").click();
        driver.findElementByLinkText("Find Leads").click();
        driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
       // Screenshot fullPageSS = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
        //ImageIO.write(fullPageSS.getImage(), "PNG", new File("./reports/images/FullPageSSofCreateLeadUsingAshot.png"));

    }

}

/*
If your already have a commons-io dependency from org.apache.commons, comment it and add the below
<dependency>
    <groupId>commons-io</groupId>
    <artifactId>commons-io</artifactId>
    <version>2.5</version>
</dependency>
<dependency>
    <groupId>ru.yandex.qatools.ashot</groupId>
    <artifactId>ashot</artifactId>
    <version>1.5.4</version>
</dependency>*/