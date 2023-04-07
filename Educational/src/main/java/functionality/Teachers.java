package functionality;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Teachers {

	@FindBy(xpath = "//span[text()='Teachers']")
	private WebElement Teachers;

	@FindBy(xpath = "//a[@role='button']")
	private WebElement entercode;

	

	public Teachers(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void teachers() {
		Teachers.click();
	}

	public void code() {
		entercode.click();

	}

	
}
