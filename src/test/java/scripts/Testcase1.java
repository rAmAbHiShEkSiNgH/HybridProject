package scripts;

import org.testng.annotations.Test;

import genericLibraries.BaseClass;
import pomPages.AddtocartPage;
import pomPages.SkillraryDemoApp;
import pomPages.SkillraryLoginPage;

public class Testcase1 extends BaseClass{

	@Test
	public void tc1() throws InterruptedException {
		SkillraryLoginPage s= new SkillraryLoginPage(driver);
		s.gearsButton();
		s.skillraryDemoApp();
		
		SkillraryDemoApp sd=new SkillraryDemoApp(driver);
		driverutilities.switchingTabs(driver);
		driverutilities.mouseHover(driver, sd.getCoursebtn());
		//Thread.sleep(4000);
		sd.seleniumtrainingtab();
		
		AddtocartPage ad=new AddtocartPage(driver);
		driverutilities.doubleClick(driver, ad.getAddbtn());
		ad.addtocartbtn();
		driverutilities.alertPupup(driver);
	}
}
