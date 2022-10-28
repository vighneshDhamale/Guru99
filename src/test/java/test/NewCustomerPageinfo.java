package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;
import pojo.GuruPageElement;
import pom.Guru99LoginPage;
import pom.Guru99LoginPage1;
import pom.NewCustomerPage;
import pom.NewCustomerPageInfo;
import utility.Parametrization;
import utility.ParametrizationNewCustomer;

public class NewCustomerPageinfo  {
	WebDriver driver;
	Guru99LoginPage1 mp;
	Guru99LoginPage GLP;
	NewCustomerPageInfo NCP;
	
	@BeforeClass
	public void openBrowser() {
		driver=Browser.openChromeBrowser();
		mp=new Guru99LoginPage1();
		GLP=new Guru99LoginPage();
		 NCP=new NewCustomerPageInfo();
	
	}
	@Test(priority=1)
	public void validateGuru99Login() throws Exception {
	
	GLP.enterUserID(Parametrization.getExcelData(0, 1, "Sheet1"));
	GLP.enterPassword(Parametrization.getExcelData(1, 1, "Sheet1"));
	GLP.clickOnLogIN();
	}
	
	@Test(priority=2)	
	public void Guru99Loginpage1() {
		mp.clickOnNewCustomer()	;
	}

	@Test(priority=3)
	public void NewCustomerpagrInfo() throws Exception {
		
		
	
		NCP.entercustomer(ParametrizationNewCustomer.getExcelData(0, 1, "Sheet1"));
		NCP.enterDOB(ParametrizationNewCustomer.getExcelData(1, 1, "Sheet1"));
		NCP.enterAddress(ParametrizationNewCustomer.getExcelData(2, 1, "Sheet1"));
		NCP.entercity(ParametrizationNewCustomer.getExcelData(3, 1, "Sheet1"));
		NCP.enterstate(ParametrizationNewCustomer.getExcelData(4, 1, "Sheet1"));
		NCP.enterpin(ParametrizationNewCustomer.getExcelData(5, 1, "Sheet1"));
		NCP.entertelephone(ParametrizationNewCustomer.getExcelData(6, 1, "Sheet1"));
		NCP.enterEmailId(ParametrizationNewCustomer.getExcelData(7, 1, "Sheet1"));
		NCP.clickONSubmit();
	}
	




















}

