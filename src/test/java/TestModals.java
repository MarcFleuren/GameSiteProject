

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

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class TestModals {

    private static WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void testGoogleSearch() throws InterruptedException, IOException{
        driver.get("System.getProperty(\"user.dir\") + \"\\\\GameSiteProject\\\\html\\\\index.html\"");
        driver.manage().window().fullscreen();

        Thread.sleep(2000);
        //nav to modal
        driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div/div[2]/div/button")).click();
        Thread.sleep(2000);
        //nav to upcoming

//        Boolean isPresent = driver.findElements(By.xpath("//*[@id=\"player_uid_330582441_1\"]/div[4]/button")).size() > 0;

        //driver.switchTo().frame(driver.findElement(By.className("modal-body")));

        if(!driver.switchTo().frame(1).findElements(By.id("player")).isEmpty()){
            System.out.println("Element is Present");
        }else{
            System.out.println("Element is Absent");
        }
//        if(isPresent == false){
//            File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//            FileUtils.copyFile(scrFile,new File("C:\\Users\\admin\\Desktop\\ModalHomeDoesntLoad.jpg"));
//
//        }
//        assertTrue(isPresent);
        Thread.sleep(5000);

//        //nav to home
//        driver.findElement(By.xpath("/html/body/nav/div/a")).click();
//        Thread.sleep(2000);
//
//        //check on home page, if fail screenshot
//        WebElement homeHot = driver.findElement(By.xpath("/html/body/div/h1"));
//        Boolean isPresent = driver.findElements(By.xpath("/html/body/div/h1")).size() > 0;
//        if(isPresent == false){
//            File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//            FileUtils.copyFile(scrFile,new File("C:\\Users\\admin\\Desktop\\img2.jpg"));
//        }
//        Thread.sleep(5000);


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