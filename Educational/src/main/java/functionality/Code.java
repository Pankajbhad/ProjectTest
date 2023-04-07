package functionality;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Code {

	@FindBy(xpath = "//input[@class='_q92ef6']")
	private WebElement inputcode;

	@FindBy(xpath = "//button[@type='button']")
	private WebElement cont;

	@FindBy(xpath = "//a[@role='button']")
	private WebElement back;

	public Code(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void inputcode() {
		inputcode.sendKeys("0123456");

	}

	public void cont() {
		cont.click();

	}

	public void Back() {
		back.click();

	}

}
