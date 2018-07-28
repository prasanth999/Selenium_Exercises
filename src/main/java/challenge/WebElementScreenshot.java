package challenge;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.concurrent.TimeUnit;

public class WebElementScreenshot {

    @Test
    public void webEleScreenShot() throws Exception {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://leaftaps.com/opentaps/");

        WebElement element = driver.findElementByXPath("//div[@id='logo']/img");

        File srcPage = driver.getScreenshotAs(OutputType.FILE);

        //Used selenium getSize() method to get height and width of element.
        int ImageWidth = element.getSize().getWidth();
        int ImageHeight = element.getSize().getHeight();

        //Used selenium Point class to get x y coordinates of Image element.
        Point point = element.getLocation();
        int xcord = point.getX();
        int ycord = point.getY();

        //Reading full image screenshot.
        BufferedImage img = ImageIO.read(srcPage);

        //cut Image using height, width and x y coordinates parameters.
        BufferedImage dest = img.getSubimage(xcord, ycord, ImageWidth, ImageHeight);
        ImageIO.write(dest, "png", srcPage);

        FileUtils.copyFile(srcPage, new File("./reports/images/WebElementSSUsingAshot.png"));
    }

}