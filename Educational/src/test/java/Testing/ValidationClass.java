package Testing;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Util.Utility;
import functionality.Login;
import functionality.Teachers;
import functionality.logout;

public class ValidationClass extends Utility{
	
	int testID;
	WebDriver driver;
	Login login;
	Teachers teacher;

	@BeforeClass
	public void beforeclass() {
		// System.setProperty("Webdriver.chrome.driver",
		// "C:\\Users\\Suraj\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.khanacademy.org/");

	}

	@BeforeMethod
	public void beforemethod() {
		Login login = new Login(driver);
		login.Loginlink();
		login.un();
		login.pswd();
		login.submit();
	}

	@Test
	public void Teacher() {
		testID=1;
		
		teacher = new Teachers(driver);
		teacher.teachers();
		
		String url = driver.getCurrentUrl();

		if (url.equals("https://www.khanacademy.org/profile/me/teachershdhf")) {
			System.out.println("test case pass");
		} else {
			System.out.println("test case failed");
		}
		getscreenshot();
	}

	private void getscreenshot() {
		// TODO Auto-generated method stub
		
	}

	@AfterMethod
	public void aftermethod() {
		logout Logout = new logout(driver);
		Logout.clickonprofile();
		Logout.loginout();
	}

	@AfterClass
	public void afterclass() {
		driver.close();
	}

}
