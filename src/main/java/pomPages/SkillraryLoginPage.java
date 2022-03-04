package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginPage {
	
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gears;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement demoApp;
	
	@FindBy(xpath="//a[text()=' Contact Us ']")
	private WebElement contactuslink;
	
	public SkillraryLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void gearsButton() {
		gears.click();
	}
	public void skillraryDemoApp() {
		demoApp.click();
	}
	
	public void contactus() {
		contactuslink.click();
	}

	public WebElement getContactuslink() {
		return contactuslink;
	}
	
}
