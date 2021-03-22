package sandboxPageMethods;

import java.util.LinkedHashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.AllUtilities.SeleniumWebdriverMethods;
import com.Framework.Intitiate;
import com.Pages.Guidewire.ILoginGuideware;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class LoginGuidewirePO extends SeleniumWebdriverMethods implements ILoginGuideware {

	
	WebDriverWait wait;
	WebDriver driver;
	ExtentTest oExtentTest;
   
	public LoginGuidewirePO(WebDriver driver, ExtentReports oExtentReports, LinkedHashMap<String, String> lhm_data) {
		this.driver = driver;
	}

	@FindBy(id = "sdfsdf")
	private WebElement Sample1;

	private By Sample2 = By.xpath("//*[@id='add-to-cart-button']");

	@Override
	public WebElement getUsername_ContactManagement(WebElement weName) {
		// TODO Auto-generated method stub
		return getElement(weName);
	

	}

	@Override
	public WebElement getpassword_ContactManagement(WebElement weName) {
		return getElement(weName);
	}

	@Override
	public void setUsername_ContactManagement(WebElement weName, String strValue) {

		getUsername_ContactManagement(weName);
	}

	@Override
	public void setpassword_ContactManagement(WebElement weName, String strValue) {
		// TODO Auto-generated method stub

	}

	@Override
	public void clickLogin_ContactManagement(WebElement weName) {
		// TODO Auto-generated method stub

	}

	@Override
	public void login_ContactManagement() {
		// TODO Auto-generated method stub
		setUsername_ContactManagement(Sample1, "User");
		setpassword_ContactManagement(Sample1, "pass");
		clickLogin_ContactManagement(Sample1);
	}

	@Override
	public WebElement getUsername_BillingCenter(WebElement weName) {
		return getElement(weName);

	}

	@Override
	public WebElement getpassword_BillingCenter(WebElement weName) {
		return getElement(weName);

	}

	@Override
	public void setUsername_BillingCenter(WebElement weName, String strValue) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setpassword_BillingCenter(WebElement weName, String strValue) {
		// TODO Auto-generated method stub

	}

	@Override
	public void clickLogin_BillingCenter(WebElement weName) {
		// TODO Auto-generated method stub

	}

	@Override
	public void login_BillingCenter() {
		// TODO Auto-generated method stub

	}

	@Override
	public WebElement getUsername_PolicyCenter(WebElement weName) {
		return getElement(weName);

	}

	@Override
	public WebElement getpassword_PolicyCenter(WebElement weName) {
		return getElement(weName);

	}

	@Override
	public void setUsername_PolicyCenter(WebElement weName, String strValue) {
		//guideAuto(weName,strValue)

	}

	@Override
	public void setpassword_PolicyCenter(WebElement weName, String strValue) {
		// TODO Auto-generated method stub

	}

	@Override
	public void clickLogin_PolicyCenter(WebElement weName) {
		// TODO Auto-generated method stub

	}

	@Override
	public void login_PolicyCenter() {
		// TODO Auto-generated method stub

	}

	@Override
	public WebElement getUsername_ClaimsCenter(WebElement weName) {
		return getElement(weName);

	}

	@Override
	public WebElement getpassword_ClaimsCenter(WebElement weName) {
		return getElement(weName);

	}

	@Override
	public void setUsername_ClaimsCenter(WebElement weName, String strValue) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setpassword_ClaimsCenter(WebElement weName, String strValue) {
		// TODO Auto-generated method stub

	}

	@Override
	public void clickLogin_ClaimsCenter(WebElement weName) {
		// TODO Auto-generated method stub

	}

	@Override
	public void login_ClaimsCenter() {
		// TODO Auto-generated method stub

	}

}
