package Crossbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest {

	WebDriver driver;

	@Parameters({ "browser" })
	@Test
	public void LaunchURL(String browser) {
		System.out.println("browser is : " + browser);

		if (browser.equals("chrome")) {
			System.setProperty("Webdriver.chrome.driver",
					"C:\\Users\\Suraj\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			driver =new FirefoxDriver();
		}
		else if(browser.equals("safari")) {
			driver =new SafariDriver();
		}
	}

}
