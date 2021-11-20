package variousConcepts;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestJunit {

	WebDriver driver;
	
	@Before
	public void launchBrowser() {
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\devan\\July2021_Selenium\\Session1\\driver\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	}
	
	@Test
	public void logintest() throws InterruptedException {
		
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		
	}

	@Test
	public void neglogintest() throws InterruptedException {
		
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc12334");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		
	}
	
	@After
	public void tearDown() {
		
		driver.close();
		driver.quit();
	}
	
}

