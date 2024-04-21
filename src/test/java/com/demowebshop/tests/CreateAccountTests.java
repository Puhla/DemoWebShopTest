package com.demowebshop.tests;

import com.demoWebShop.data.UserData;
import com.demoWebShop.models.User;
import com.demoWebShop.utils.DataProviders;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase{
@BeforeMethod
public void ensurePrecondition() {
	if (!app.getUser().isLoginLinkPresent()) {
		app.getUser().clickOnLogOutButton();
	}
}

@Test
public void createNewAccount() {
	app.getUser().clickOnRegisterLink();
	app.getUser().fillRegisterForm(new User()
			.setFirstName(UserData.FIRSTNAME)
			.setLastName(UserData.SURNAME)
			.setEmail(UserData.CREATE_EMAIL)
			.setPassword(UserData.PASSWORD)
			.setConfirmPassword(UserData.CONFIRMPASSWORD));
	app.getUser().clickOnRegistrationButton();
	Assert.assertTrue(app.getUser().isCustomerPresent());
}

@Test(dataProvider = "createNewUsersFromCsvFile", dataProviderClass = DataProviders.class)
public void testAddUsersFromCsvFile(User newUser) {
	app.getUser().clickOnRegisterLink();
	app.getUser().fillRegisterForm(newUser);
	app.getUser().clickOnRegistrationButton();
	Assert.assertTrue(app.getUser().isCustomerPresent());
}

}

