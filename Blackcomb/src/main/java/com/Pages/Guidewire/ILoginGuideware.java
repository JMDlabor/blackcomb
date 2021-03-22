package com.Pages.Guidewire;

import org.openqa.selenium.WebElement;

public interface ILoginGuideware {

	
	WebElement getUsername_ContactManagement(WebElement weValue);
	WebElement getpassword_ContactManagement(WebElement weValue);
	void setUsername_ContactManagement(WebElement weValue, String strValue);
	void setpassword_ContactManagement(WebElement weValue, String strValue);
	void clickLogin_ContactManagement(WebElement weValue);
	void login_ContactManagement();


	WebElement getUsername_BillingCenter(WebElement weValue);
	WebElement getpassword_BillingCenter(WebElement weValue);
	void setUsername_BillingCenter(WebElement weValue, String strValue);
	void setpassword_BillingCenter(WebElement weValue, String strValue);
	void clickLogin_BillingCenter(WebElement weValue);
	void login_BillingCenter();

	WebElement getUsername_PolicyCenter(WebElement weValue);
	WebElement getpassword_PolicyCenter(WebElement weValue);
	void setUsername_PolicyCenter(WebElement weValue, String strValue);
	void setpassword_PolicyCenter(WebElement weValue, String strValue);
	void clickLogin_PolicyCenter(WebElement weValue);
	void login_PolicyCenter();
	
	WebElement getUsername_ClaimsCenter(WebElement weValue);
	WebElement getpassword_ClaimsCenter(WebElement weValue);
	void setUsername_ClaimsCenter(WebElement weValue, String strValue);
	void setpassword_ClaimsCenter(WebElement weValue, String strValue);
	void clickLogin_ClaimsCenter(WebElement weValue);
	void login_ClaimsCenter();
	

}
