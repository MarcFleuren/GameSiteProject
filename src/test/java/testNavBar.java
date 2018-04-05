

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import java.io.IOException;

public class testNavBar {

    private static WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void testGoogleSearch() throws InterruptedException, IOException{
        driver.get(System.getProperty("user.dir") + "\\GameSiteProject\\html\\index.html");
        driver.manage().window().fullscreen();

        Thread.sleep(2000);
        //nav to games
        driver.findElement(By.xpath("//*[@id='navbarResponsive']/ul/li[1]/a")).click();
        Thread.sleep(2000);
        //nav to upcoming
        driver.findElement(By.xpath("//*[@id=\"navbarResponsive\"]/ul/li[2]/a")).click();
        Thread.sleep(2000);
        //nav to home
        driver.findElement(By.xpath("/html/body/nav/div/a")).click();
        Thread.sleep(2000);

        //check on home page, if fail screenshot
        WebElement homeHot = driver.findElement(By.xpath("/html/body/div/h1"));
        Boolean isPresent = driver.findElements(By.xpath("/html/body/div/h1")).size() > 0;
        if(isPresent == false){
            File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile,new File("C:\\Users\\admin\\Desktop\\img2.jpg"));
        }
        Thread.sleep(5000);


//		WebElement searchBox = driver.findElement(By.name("q"));
//		searchBox.sendKeys("ChromeDriver");
//		searchBox.submit();
//		WebElement chromeDriverLink = driver
//				.findElement(By.linkText("ChromeDriver - WebDriver for Chrome - Google Sites"));
//		chromeDriverLink.click();
//        WebElement homeHot = driver.findElement(By.xpath("/html/body/div/h1"));
//        Boolean isPresent = driver.findElements(By.xpath("/html/body/div/h1")).size() > 0;
//        if(isPresent == false){
//            File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//            FileUtils.copyFile(scrFile,new File("C:\\Users\\admin\\Desktop\\img2.jpg"));
//        }
        Thread.sleep(5000);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

}