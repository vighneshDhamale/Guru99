package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pojo.Browser;

public class NewCustomerPageInfo extends Browser {
    @FindBy(xpath="(//input[@type='text'])[1]")private WebElement Customer;
	@FindBy(xpath="//input[@type='date']")private WebElement DOB;
	@FindBy(xpath="//textarea[@name='addr']")private WebElement Address;
	@FindBy(xpath="//input[@name='city']")private WebElement city;
	@FindBy(xpath="//input[@name='state']")private WebElement state;
	@FindBy(xpath="//input[@name='pinno']")private WebElement pin;
	@FindBy(xpath="//input[@name='telephoneno']")private WebElement telephone;
	@FindBy(xpath="//input[@name='emailid']")private WebElement Emailid;
	@FindBy(xpath="//input[@type='submit']")private WebElement Submit;


	public NewCustomerPageInfo() {
		PageFactory.initElements(driver, this);
	}
	public void entercustomer(String user) {
		Customer.sendKeys(user);
	}
	public void enterDOB(String user) {
		DOB.sendKeys(user);
	}
	public void enterAddress(String user) {
		Address.sendKeys(user);
	}
	public void entercity(String user) {
		city.sendKeys(user);
	}
	public void enterstate(String user) {
		state.sendKeys(user);
	}
	public void enterpin(String user) {
		pin.sendKeys(user);
	}
	public void entertelephone(String user) {
		telephone.sendKeys(user);
	}
	public void enterEmailId(String user) {
		Emailid.sendKeys(user);
	}
	public void clickONSubmit() {
		Submit.click();
	}





}
