package com.demowebshop.tests;

import com.demoWebShop.models.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RemoveFromCartTests extends TestBase{

@BeforeMethod
public void ensurePrecondition(){
	if (!app.getUser().isLoginLinkPresent()){
		app.getUser().clickOnLogOutButton();
	}
	app.getUser().clickOnLoginLink();
	app.getUser().fillLoginAndPassword(new User ()
			.setEmail("olesia123@yahoo.com")
			.setPassword("Olesia$2024"));
	app.getUser().clickOnLogInButton();
	app.getItem().clickOnButtonAddToCart();
	app.getItem().clickOnButtonShopingCart();
}
@Test
public void deleteTests(){
	int sizeBefore = app.getItem().sizeOfItems();
	app.getItem().removeItem();
	
	
	app.getItem().pause(100);
	int sizeAfter = app.getItem().sizeOfItems();
	Assert.assertEquals(sizeAfter, sizeBefore-1);
}
}



