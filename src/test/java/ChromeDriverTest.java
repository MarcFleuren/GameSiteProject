import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverTest {

	private static WebDriver driver;

	@Before
	public void setup() {
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Upcoming.html");
		// hi
		driver = new ChromeDriver();
	}

	@Test
	public void testGoogleSearch() throws InterruptedException {
		driver.get("C:\\Users\\Admin\\Desktop\\GameSiteProject\\GameSiteProject\\html\\index.html");
		driver.manage().window().fullscreen();
		Thread.sleep(5000); // Let the user actually see something!



		Thread.sleep(2000);

		WebElement navBar2 = driver.findElement(By.cssSelector("#navbarResponsive > ul > li:nth-child(2) > a"));
		navBar2.click();

		Thread.sleep(2000);

		WebElement navBar3 = driver.findElement(By.cssSelector("#navbarResponsive > ul > li:nth-child(3) > a"));
		navBar3.click();

		Thread.sleep(2000);

		WebElement navBar4 = driver.findElement(By.cssSelector("#navbarResponsive > ul > li:nth-child(2) > a"));
		navBar4.click();

		Thread.sleep(2000);

		WebElement learnMore1 = driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[2]/div/button"));
		learnMore1.click();

		Thread.sleep(2000);




	}

	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}

}
