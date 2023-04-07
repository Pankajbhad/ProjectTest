package functionality;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logout {
	
	@FindBy(xpath = "//span[@class='_wozql4 _13hnk7qk']")
	private WebElement profilename;

	@FindBy(xpath = "//*[@id=\"top-header-container\"]/nav/div/div[3]/div[1]/ul/li[2]/ul/li[4]/a/span")
	private WebElement logout;

	public logout(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickonprofile() {
		profilename.click();
	}

	public void loginout() {
		logout.click();

	}
	
	
	
	
	
	

}
