package com.demowebshop.tests;

import com.demoWebShop.models.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddItemToCartTest extends TestBase {

@BeforeMethod
public void ensurePrecondition() {
	if (!app.getUser ().isLoginLinkPresent ()) {
	app.getContact ().clickOnRegisterLink ();
	}
	app.getUser ().clickOnLoginLink ();
	app.getUser ().fillLoginForm (new User ().setEmail("romanov@gmail.com").setPassword("$Roma!$1"));
	app.getUser ().clickOnLoginInButton ();
	
}	
@Test//(enabled = false)
public void addItemToCartPositiveTest() {
	app.getAddItemToCart ().clickOnAddToCartButton ();
	app.getAddItemToCart ().clickOnShoppingCartLink ();
	Assert.assertTrue (app.getAddItemToCart ().isShoppingCartPresent ());
	
}
@Test(enabled = false)
public void DeleteItemFromCartPositiveTest () {
	app.getAddItemToCart ().clickOnAddToCartButton ();
	app.getAddItemToCart ().clickOnShoppingCartLink ();
	app.getUser ().pause (500);
	app.getAddItemToCart ().clickOnRemoveFromCartInCheckbox ();
	
	app.getAddItemToCart ().clickOnUpdateCartButton ();
	
	Assert.assertTrue (app.getAddItemToCart ().isShoppingCartIsEmpty ());
	
}
	
}
