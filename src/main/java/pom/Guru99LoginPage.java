package pom;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pojo.Browser;

public class Guru99LoginPage extends Browser{
	@FindBy(xpath="//input[@type='text']")private WebElement userID;
	@FindBy(xpath="//input[@type='password']")private WebElement password;
	@FindBy(xpath="//input[@type='submit']")private WebElement Login;
	@FindBy(xpath="//input[@type='reset']")private WebElement Reset;

	public  Guru99LoginPage () {
		PageFactory.initElements(driver, this);
	}

	public void enterUserID(String user) {
		userID.sendKeys(user);
	}
	
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}

	public void clickOnLogIN() {
		Login.click();
	}


}
