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
		driver = new ChromeDriver();
	}

	@Test
	public void testGoogleSearch() throws InterruptedException {
		driver.get("http://www.google.com/");
		driver.manage().window().fullscreen();
		Thread.sleep(5000); // Let the user actually see something!
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("ChromeDriver");
		searchBox.submit();
		WebElement chromeDriverLink = driver
				.findElement(By.linkText("ChromeDriver - WebDriver for Chrome - Google Sites"));
		chromeDriverLink.click();
		Thread.sleep(5000);
	}

	@After
	public void tearDown() {
		driver.quit();
	}

}
