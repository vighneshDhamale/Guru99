package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pojo.Browser;
import pom.Guru99LoginPage;
import utility.ExtendReport;
import utility.Parametrization;
import utility.ScreenShot;
@Listeners(listeners.TestNGListeners.class)
public class Guru99LoginPageTest {
	WebDriver driver;
	ExtentReports extent;
	ExtentTest test;
	
	@BeforeTest
		public void createReport() {
		extent=ExtendReport.getReports();
	}
	
	
	@BeforeMethod
	public void openBrowser() {
		driver=Browser.openChromeBrowser();
		}

	@Test
	public void validateGuru99Login() throws Exception {
		Guru99LoginPage guru99LoginPage=new Guru99LoginPage();
		guru99LoginPage.enterUserID(Parametrization.getExcelData(0, 1, "Sheet1"));
		guru99LoginPage.enterPassword(Parametrization.getExcelData(1, 1, "Sheet1"));
		guru99LoginPage.clickOnLogIN();
		//Assert.assertTrue(false);
		//Thread.sleep(2000);
		//ScreenShot.takeScreenShot(driver, "LoginTest");
		
	}
	
	@AfterMethod
	public void CaptureResult(ITestResult result) {
		if(result.getStatus()==ITestResult.SUCCESS) {
				test.log(Status. PASS,result.getName());
		}
		else if(result.getStatus()==ITestResult.FAILURE) {
			test.log(Status.FAIL,result.getName());
		}
		if(result.getStatus()==ITestResult.SKIP) {
			test.log(Status.SKIP,result.getName());
		}
	}
	
	@AfterTest
	public void FlushResult() {
		extent.flush();
	}
	
}
