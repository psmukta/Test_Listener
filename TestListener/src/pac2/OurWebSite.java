package pac2;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import failTestScreenShot.Base;

public class OurWebSite extends Base{
	@BeforeTest()
	public void setUp() {
		initialize();
	}
	@AfterTest
	public void teardown() {
		closeBrowser();
	}
	//@Test(groups="A", priority=0, invocationCount=3, timeOut=20)
	public void SuperTech() {
		driver.get("file:///C:/WebSite/SuperTech.html");
		Assert.assertEquals(true, false);
	}
	@Test
	public void SuperTech1() {
		driver.get("file:///C:/WebSite/SuperTech.html");
		Assert.assertEquals(true, false);
	}

}
