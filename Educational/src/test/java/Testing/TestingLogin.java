package Testing;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import functionality.Code;
import functionality.Login;
import functionality.Teachers;
import functionality.logout;

public class TestingLogin {
	public static void main(String[] args) {

		// System.setProperty("Webdriver.chrome.driver","C:\\Users\\Suraj\\Downloads\\chromedriver_win32
		// (2)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.khanacademy.org/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		Login Login = new Login(driver);

		Login.Loginlink();
		Login.un();
		Login.pswd(); 
		Login.submit();

		Teachers Teach = new Teachers(driver);
		Teach.teachers();
		Teach.code();

		
		Code EC =new Code(driver);
		EC.cont();
		EC.Back();
		
		logout logout =new logout(driver);
		logout.clickonprofile();
		logout.loginout();
		
	}
}
