package failTestScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver;
	public void initialize() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	public void closeBrowser() {
		driver.close();
	}
	public void failedTests(String testName) {
		//If only one test case is failed then 'String testName' argument is not to be write
		//also "+testName+" this part not to write.instead of "+testName+" should write facebook.png
		
		File sf=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(sf, new File(System.getProperty("user.dir")+"\\ScreenShot\\"+testName+".png"));
		} catch (IOException e) {
			
			
			e.printStackTrace();
		}
	}

}
