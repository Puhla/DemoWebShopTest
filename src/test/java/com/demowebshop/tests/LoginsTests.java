package com.demowebshop.tests;

import com.demoWebShop.models.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginsTests extends TestBase {
@BeforeMethod
public void ensurePrecondition(){
	if(!app.getUser ().isLoginLinkPresent ()){
		app.getContact ().clickOnRegisterButton ();
	}
}

@Test//(enabled = false)
public void loginPositiveTest () {
	app.getUser ().clickOnLoginLink ();
	app.getUser ().fillLoginForm (new User ().setEmail ("shlyapa@gmail.com").setPassword ("$Roma!$1"));
	app.getUser ().clickOnLoginInButton ();
	Assert.assertTrue (app.getUser ().isHeaderLinksPresent ());
}

@Test(enabled = false)
public void loginNegativeTest() {
	app.getUser ().clickOnLoginLink ();
	app.getUser ().fillLoginForm (new User().setEmail("invalid_email@gmail.com").setPassword("invalid_password"));
	app.getUser ().clickOnLoginInButton ();
	Assert.assertTrue(app.getUser ().isValidationSummaryErrorsPresent ());
}

}
