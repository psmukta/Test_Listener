package pack1;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import failTestScreenShot.Base;

public class ScreenTest extends Base {
	@BeforeTest()
	public void setUp() {
		initialize();
	}
	@AfterTest
	public void teardown() {
		closeBrowser();
	}
	@Test(groups="A", priority=0, invocationCount=3, timeOut=20)
	public void Facebook() {
		driver.get("https://www.facebook.com");
		Assert.assertEquals(true, false);
	}

}
