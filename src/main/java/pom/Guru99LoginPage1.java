package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pojo.Browser;

public class Guru99LoginPage1 extends Browser{

	@FindBy(xpath="//a[text()='New Customer']")private WebElement NewCustomer;
	@FindBy(xpath="//a[@href='EditCustomer.php']")private WebElement EditCustomer;
	@FindBy(xpath="//a[@href='DeleteCustomerInput.php']")private WebElement DeleteCustomer;
	@FindBy(xpath="//a[@href='addAccount.php']")private WebElement NewAccount;
	@FindBy(xpath="//a[@href='editAccount.php']")private WebElement EditAccount;
	@FindBy(xpath="//a[@href='deleteAccountInput.php']")private WebElement DeleteAccount;
	@FindBy(xpath="//a[@href='MiniStatementInput.php']")private WebElement MiniStatement;
	@FindBy(xpath="//a[@href='CustomisedStatementInput.php']")private WebElement CustomisedStatement;
	@FindBy(xpath="//a[@href='Logout.php']")private WebElement LogOut;
	
	public  Guru99LoginPage1() {
	PageFactory.initElements(driver, this);
	}

	//public void clickOnManager() {
	//Manager.click();
	//}
	
	public void clickOnNewCustomer() {
		NewCustomer.click();
	}

	public void clickOnDeleteCustomer() {
			DeleteCustomer.click();
		}

	public void clickOnNewAccount() {
		NewAccount.click();
		}

	public void clickOnEditAccount() {
		EditAccount.click();
		}

	public void clickOnMiniStatement() {
		MiniStatement.click();
		}

	public void clickOncustomisedStatement() {
		CustomisedStatement.click();
		}

	public void clickOnLogOut() {
		LogOut.click();
		}




}
