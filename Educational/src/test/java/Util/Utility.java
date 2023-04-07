package Util;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	public static void screenshot(WebDriver driver, int testID) throws IOException {

		DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy-MM-dd HH mm ss");
		LocalDateTime now = LocalDateTime.now();

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("/Educational/test-output//Screenshot//test-" + testID + " " + date.format(now) + ".jpeg");
		FileHandler.copy(src, dest);

	}

	public WebDriver Setup() {
		System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\Suraj\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}

	public WebDriver OpenFirefoxBrowser() {
		System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\Suraj\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		return driver;

	}
}
