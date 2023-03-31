package Com.Actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {
	// declaration
	@FindBy(id = "username")
	private WebElement untbx;

	@FindBy(name = "pwd")
	private WebElement pwtbx;

	@FindBy(xpath = "//div[.='Login ']")
	private WebElement lgbtn;

//Initialization
	public LoginPage1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

//Utilization
	public WebElement getUntbx() {
		return untbx;
	}

	public WebElement getPwtbx() {
		return pwtbx;
	}

	public WebElement getLgbtn() {
		return lgbtn;
	}
}