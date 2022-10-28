package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pojo.Browser;
import pojo.GuruPageElement;

public class NewCustomerPage extends GuruPageElement{
	//@FindBy(xpath="//a[text()='New Customer']")private WebElement NewCustomer;
	@FindBy(xpath="(//input[@type='text'])[1]")private WebElement CustomerName;
	@FindBy(xpath="(//input[@type='date'])[1]")private WebElement Date;
	@FindBy(xpath="(//textarea[@rows='5'])[1]")private WebElement Address ;
	@FindBy(xpath="(//input[@name='city'])[1]")private WebElement City;
	@FindBy(xpath="(//input[@name='state'])[1]")private WebElement State;
	@FindBy(xpath="(//input[@name='pinno'])[1]")private WebElement Pin;
	@FindBy(xpath="(//input[@name='telephoneno'])[1]")private WebElement Telephone;
	@FindBy(xpath="(//input[@name='emailid'])[1]")private WebElement Emailid;
	@FindBy(xpath="(//input[@type='submit'])[1]")private WebElement Submit;
	@FindBy(xpath="(//input[@type='reset'])[1]")private WebElement Reset;


	public NewCustomerPage() {
		PageFactory.initElements(driver, this);
	}
//	public void clickOnNewCustomer() {
	//	NewCustomer.click();
	//}
	
	public void entercustomername(String username) {
		CustomerName.sendKeys(username);
	}

	public void enterDOB(String DOB ) {
		Date.sendKeys(DOB);
	}

	public void enterAddress(String address) {
		Address.sendKeys(address);
	}

	public void enterCity(String state) {
		City.sendKeys(state);
	}

	public void enterState(String state) {
		State.sendKeys(state);
	}

	public void enterpin(String pin) {
		Pin.sendKeys(pin);
	}
	
	public void enterTelephone(String telephone) {
		Telephone.sendKeys(telephone);
	}

	public void enterEmailid(String state) {
		Emailid.sendKeys(state);
	}

	public void clickOnSubmit() {
		Submit.click();;
	}
	
	public void clickOnreset() {
		Reset.click();
	}
	
}
