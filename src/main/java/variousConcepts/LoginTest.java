package variousConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		LoginTest.launchBrowser();
		logintest();
		tearDown();

		LoginTest.launchBrowser();
		neglogintest();
		tearDown();

	}

	public static void launchBrowser() {

//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\devan\\July2021_Selenium\\Session1\\driver\\chromedriver.exe");

		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();

	}

	public static void logintest() throws InterruptedException {

		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");

		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);

	}

	public static void neglogintest() throws InterruptedException {

		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc12334");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);

	}

	public static void tearDown() {

		driver.close();
	}

}
