package listeners;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
//import utility.ScreenShot;
import pojo.GuruPageElement;
import utility.ScreenShot;
//import pom.Guru99LoginPage;

public class TestNGListeners extends GuruPageElement  implements ITestListener {
	
		public void onTestSuccess(ITestResult result) {
			System.out.println("Test is Successful:"+result.getName());
		}
		public void onTestFailure(ITestResult result) {
			System.out.println("Test is Failed:"+result.getName());
			
		try {
			ScreenShot.takeScreenShot(driver, "LoginTest");
		}
		catch(Exception e){
		       e.printStackTrace();	
		}
		
		
		}
		public void onTestSkipped(ITestResult result) {
		 
			System.out.println("Test is Skipped"+result.getTestName());
		}
		public void onTestStart(ITestResult result) {
			System.out.println("Test is Started"+result.getTestName());
		}


	}


