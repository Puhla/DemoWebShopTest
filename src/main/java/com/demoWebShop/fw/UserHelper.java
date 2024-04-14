package com.demoWebShop.fw;

import com.demoWebShop.fw.BaseHelper;
import com.demoWebShop.models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends BaseHelper {


public UserHelper (WebDriver driver) {
	super (driver);
}

public boolean isHeaderLinksPresent (By locator) {
	return isElementPresent(By.cssSelector("a[href='/login']"));
}
public boolean isHeaderLinksPresent() {
	return isElementPresent(By.cssSelector(".header-links-wrapper"));
}
public void clickOnLoginInButton () {
	click (By.xpath
			("//input[@class='button-1 login-button']"));
}

public void fillLoginForm(User user) {
	type(By.name("Email"), user.getEmail ());
	type(By.name("Password"), user.getPassword ());
}

public void clickOnLoginLink () {
	click (By.cssSelector ("a.ico-login"));
}

public boolean isValidationSummaryErrorsPresent () {
	return isElementPresent (By.cssSelector (".validation-summary-errors"));
}

public boolean isLoginLinkPresent () {
	return isElementPresent(By.cssSelector("a[href='/login']"));
}

public void clickOnLogOutLink () {
	click(By.cssSelector ("[href='/logout']"));
}
}
