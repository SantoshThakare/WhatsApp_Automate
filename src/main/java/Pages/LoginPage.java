package Pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Base.base;

public class LoginPage extends base  {
	
	@FindBy(xpath = "(//div[@title='Search input textbox'])[1]")
	WebElement searchBox;
	@FindBy(xpath = "//span[@title=\"Adesh Barbade Bz\"]")
	WebElement Adeshbtn;
	@FindBy(xpath = "//p[@class=\"selectable-text copyable-text\"]")
	WebElement AdeshMassagebtn;
	@FindBy(xpath = "//span[@data-testid=\"smiley\"]")
	WebElement AdeshEmojibtn;
	@FindBy(xpath = "//span[@style=\"background-position: -128px -32px;\"][@data-emoji-index=\"13\"]")
	WebElement AdeshSmilebtn;

	public LoginPage() {

		PageFactory.initElements(driver, this);

	}
	WebDriverWait wait = new WebDriverWait(driver,90);


	/**
	 *To verify Home Page Title with Config data
	 */
	public void LoginUser() {
		try {
//			wait.until(ExpectedConditions.visibilityOfAllElements(searchBox));
//			searchBox.click();
			wait.until(ExpectedConditions.visibilityOfAllElements(Adeshbtn));
			Adeshbtn.click();
			int x = AdeshMassagebtn.getLocation().getX();
			int y = AdeshMassagebtn.getLocation().getY();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(" + x + ", " + y + ")");

			wait.until(ExpectedConditions.elementToBeClickable(AdeshMassagebtn));
			AdeshMassagebtn.sendKeys("Good Morning");
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
			wait.until(ExpectedConditions.visibilityOfAllElements(AdeshEmojibtn));
			AdeshEmojibtn.click();	
			
			wait.until(ExpectedConditions.visibilityOfAllElements(AdeshSmilebtn));
			AdeshSmilebtn.click();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
