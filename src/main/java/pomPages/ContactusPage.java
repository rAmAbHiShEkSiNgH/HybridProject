package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactusPage {
	
	@FindBy(name="name")
	private WebElement fullNametb;
	
	@FindBy(name="sender")
	private WebElement emailtb;
	
	@FindBy(name="subject")
	private WebElement subjecttb;
	
	@FindBy(name="message")
	private WebElement messageta;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement sendusmailbtn;
	
	public ContactusPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void name(String name) {
		fullNametb.sendKeys(name);
	}
	
	public void email(String email) {
		emailtb.sendKeys(email);
	}
	
	public void subject(String sub) {
		subjecttb.sendKeys(sub);
	}
	
	public void message(String msg) {
		messageta.sendKeys(msg);
	}
	
	public void sendusmail() {
		sendusmailbtn.click();
	}
}
