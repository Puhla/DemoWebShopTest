package com.demoWebShop.fw;

import com.demoWebShop.fw.BaseHelper;
import com.demoWebShop.models.Contact;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactHelper extends BaseHelper {

public ContactHelper (WebDriver driver) {
	super (driver);
}




public boolean isAccountCreated() {
	By.cssSelector("ul:nth-child(1) .account");
	return isElementPresent(By.cssSelector("ul:nth-child(1) .account"));
}


public void fillRegisterForm (Contact contact) {
	type (By.name("FirstName"), contact.getFirstname ());
	type (By.name("LastName"), contact.getLastname ());
	type (By.name ("Email"), contact.getEmail ());
	type (By.name("Password"), contact.getPassword ());
	type (By.name ("ConfirmPassword"), contact.getConfirmPassword ());
}

public void clickOnRegisterButton () {
	click (By.id("register-button"));
}

public void clickOnRegisterLink () {
	click (By.cssSelector("a.ico-register"));
}

public boolean isPageTitlePresent () {
	return isElementPresent (By.cssSelector
			(".page-title"));
}
}
