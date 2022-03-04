package genericLibraries;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities {
	//handling drop-down
	public void dropDown(WebElement ele,String text) {
		Select s=new Select(ele);
		s.selectByVisibleText(text);
	}
	//handling mouse hover
	public void mouseHover(WebDriver driver,WebElement ele) {
		Actions a =new Actions(driver);
		a.moveToElement(ele).perform();
	}
	//handling double click
	public void doubleClick(WebDriver driver, WebElement ele) {
		Actions a=new Actions(driver);
		a.doubleClick(ele).perform();
	}
	//handling right click
	public void rightClick(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.contextClick().perform();
	}
	//handling drag and drop
	public void draganddrop(WebDriver driver,WebElement source,WebElement target) {
		Actions a=new Actions(driver);
		a.dragAndDrop(source, target).perform();
	}
	//handling frames
	public void switchFrames(WebDriver driver) {
		driver.switchTo().frame(0);
	}
	//switching back to original frame
	public void switchBackframe(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	//handling alertPopup
	public void alertPupup(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	public void switchingTabs(WebDriver driver) {
		Set<String> child=driver.getWindowHandles();
		for(String b:child) {
			driver.switchTo().window(b);
		}
	}
	//handling scroll bar
	public void scrollBar(WebDriver driver,int x,int y) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+","+y+")" );
	}
	
}
