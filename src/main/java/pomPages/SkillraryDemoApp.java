package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoApp {
	
	//@FindBy(id="course")
	@FindBy(xpath="//a[text()='COURSE']")
	private WebElement coursebtn;
	
	@FindBy(xpath="//a[text()='Selenium Training']")
	private WebElement seleniumtraining;
	
	@FindBy(xpath="//select[@class='chosen-select']")
	private WebElement testingdropdown;
	
	@FindBy(xpath="//a[text()='LOGIN']")
	private WebElement login;
	
	public SkillraryDemoApp(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCoursebtn() {
		return coursebtn;
	}
	
	public void seleniumtrainingtab() {
		seleniumtraining.click();
	}

	public WebElement getTestingdropdown() {
		return testingdropdown;
	}
	
	public void login() {
		login.click();
	}
	
	
}
