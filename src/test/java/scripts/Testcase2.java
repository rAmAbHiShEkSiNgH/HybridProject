package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericLibraries.BaseClass;
import pomPages.SkillraryDemoApp;
import pomPages.SkillraryLoginPage;
import pomPages.TestingPage;

public class Testcase2 extends BaseClass{
	
	@Test
	public void TC2() throws InterruptedException, IOException {
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gearsButton();
		s.skillraryDemoApp();
		
		Thread.sleep(4000);
		SkillraryDemoApp sd=new SkillraryDemoApp(driver);
		driverutilities.switchingTabs(driver);
		driverutilities.dropDown(sd.getTestingdropdown(), pdata.getpropertyData("coursename"));
		
		Thread.sleep(4000);
		TestingPage tp=new TestingPage(driver);
		driverutilities.draganddrop(driver, tp.getSeleniumtraining(), tp.getMycart());
		
		Thread.sleep(4000);
		Point loc = tp.getFacebookicon().getLocation();
		int x = loc.getX();
		int y=loc.getY();
		driverutilities.scrollBar(driver, x, y);
		tp.facebook();
	}
}
