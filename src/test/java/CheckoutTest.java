import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class CheckoutTest {

    private static WebDriver driver;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void testCarddetails() throws Exception {
        driver.get("file:///Users/Maz/eclipse-workspace/GameSiteProject/GameSiteProject/html/index.html");
        Thread.sleep(1000);
        driver.findElement(By.linkText("Basket")).click();
        Thread.sleep(1000);
        driver.findElement(By.linkText("Checkout")).click();
        Thread.sleep(1000);

        assertTrue(driver.findElement(By.id("cvv")).isDisplayed());
        driver.findElement(By.xpath("//div[2]/label[3]")).getText().matches("^exact:Card number [\\s\\S]*$");
        driver.findElement(By.xpath("//div[2]/label[2]")).getText().matches("^exact:Name on Card [\\s\\S]*$");
        try {
            assertEquals("", driver.findElement(By.id("cname")).getAttribute("value"));
            assertEquals("", driver.findElement(By.id("ccnum")).getAttribute("value"));
            assertEquals("", driver.findElement(By.id("expmonth")).getAttribute("value"));
            assertTrue(driver.findElement(By.name("cvv")).isDisplayed());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }
}
