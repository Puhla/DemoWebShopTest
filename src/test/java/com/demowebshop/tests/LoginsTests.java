package com.demowebshop.tests;

import com.demoWebShop.data.UserData;
import com.demoWebShop.models.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginsTests extends TestBase {
@BeforeMethod
public void ensurePrecondition(){
	if (!app.getUser().isLoginLinkPresent()){
		app.getUser().clickOnLogOutButton();
	}
}

@Test
public void loginPositiveTest(){
	app.getUser().clickOnLoginLink();
	
	app.getUser().fillLoginAndPassword(new User()
			.setEmail(UserData.EMAIL)
			.setPassword(UserData.PASSWORD));
	app.getUser().clickOnLogInButton();
	Assert.assertTrue(app.getUser().isCustomerPresent());
}
@Test
public void loginNegativeTest(){
	app.getUser().clickOnLoginLink();
	app.getUser().fillLoginAndPassword(new User().setPassword("Olesia$2024"));
	app.getUser().clickOnLogInButton();
	Assert.assertTrue(app.getUser().isCustomerPresent());
	
}
}
