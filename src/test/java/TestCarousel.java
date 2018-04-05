

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import java.io.IOException;
import java.io.IOException;

public class TestCarousel {
    private static WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void testGoogleSearch() throws InterruptedException, IOException {
        driver.get("System.getProperty(\"user.dir\") + \"\\\\GameSiteProject\\\\html\\\\index.html\"");
        driver.manage().window().fullscreen();

        Thread.sleep(2000);
        //nav to modal
        driver.findElement(By.xpath("//*[@id=\"carouselExampleIndicators\"]/a[2]/span[1]")).click();
        Thread.sleep(2000);
        //nav to upcoming

        Boolean isPresent = driver.findElements(By.xpath("//*[@id=\"carouselExampleIndicators\"]/div/div[2]/div/img")).size() > 0;

        //driver.switchTo().frame(driver.findElement(By.className("modal-body")));

        if(isPresent == Boolean.TRUE){
            System.out.println("Element is Present");
        }else{
            System.out.println("Element is Absent");
            File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile,new File("C:\\Users\\admin\\Desktop\\ModalHomeDoesntLoad.jpg"));
        }
        if(isPresent == false){


        }
        Assert.assertTrue(isPresent);
        Thread.sleep(5000);


    }

    @After
    public void tearDown() {
        driver.quit();
    }

}

