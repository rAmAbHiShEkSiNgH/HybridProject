package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLibraries.BaseClass;
import pomPages.ContactusPage;
import pomPages.SkillraryLoginPage;

public class Testcase4 extends BaseClass{

	@Test
	public void TC4() throws IOException, InterruptedException {
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		int x = s.getContactuslink().getLocation().getX();
		int y = s.getContactuslink().getLocation().getY();
		Thread.sleep(4000);
		driverutilities.scrollBar(driver, x, y);
		Thread.sleep(4000);
		s.contactus();
		
		ContactusPage cu=new ContactusPage(driver);
		String name=pdata.getpropertyData("name");
		String email=pdata.getpropertyData("email");
		String sub=pdata.getpropertyData("subject");
		String msg=pdata.getpropertyData("message");
		
		cu.name(name);
		
		Thread.sleep(4000);
		cu.email(email);
		cu.subject(sub);
		Thread.sleep(4000);
		cu.message(msg);
		cu.sendusmail();
	}
}
