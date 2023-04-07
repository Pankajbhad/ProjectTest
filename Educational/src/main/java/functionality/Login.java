package functionality;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	
	@FindBy(xpath="//a[@id='login-or-signup']")
	private WebElement Linklogin;
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement username;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement login;
	
	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void Loginlink() {
		Linklogin.click();
		}
	public void un() {
		username.sendKeys("Abhinavvelocity");
		}
	public void pswd() {
		password.sendKeys("Abhi@1804");
		}
	public void submit() {
		login.click();
	}
}

