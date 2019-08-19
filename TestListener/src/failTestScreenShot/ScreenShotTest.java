package failTestScreenShot;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomizeListener.class)
public class ScreenShotTest extends Base {
	@BeforeTest(alwaysRun=true)
	public void setUp() {
		initialize();
	}
	@AfterTest(alwaysRun=true)
	public void teardown() {
		closeBrowser();
	}
	@Test(groups= {"A"}, priority=0, invocationCount=3, timeOut=20)
	public void Facebook() {
		driver.get("https://www.facebook.com");
		Assert.assertEquals(true, false);
	}
	@Test(groups= {"A"}, priority=2)
	public void Google() {
		driver.get("https://www.google.com");
		Assert.assertEquals(true, false);
	}
	@Test(groups= {"B"}, priority=3)
	public void Selenium() {
		driver.get("https://www.seleniumhq.org");
		Assert.assertEquals(true, false);
	}
	@Test(groups= {"A"}, priority=4)
	public void SuperTech() {
		driver.get("file://C:/WebSite/SuperTech.html");
		Assert.assertEquals(true, false);
	}

}
