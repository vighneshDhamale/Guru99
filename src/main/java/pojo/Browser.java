package pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	
	public static WebDriver driver;
	public static WebDriver openChromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\New folder\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/V1/index.php");
	
		driver.manage().window().maximize();
		return driver;
	
	}

}
