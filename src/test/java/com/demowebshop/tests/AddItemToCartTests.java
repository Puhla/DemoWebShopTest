package com.demowebshop.tests;

import com.demoWebShop.data.UserData;
import com.demoWebShop.models.User;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddItemToCartTests extends TestBase {
@BeforeMethod
public void ensurePrecondition(){
	if (!app.getUser ().isLoginLinkPresent()){
		app.getUser().clickOnLogOutButton();
	}
	app.getUser().clickOnLoginLink();
	app.getUser().fillLoginAndPassword(new User()
			.setEmail("shmidt@gmail.com")
			.setPassword("$64$Shmidt!!"));
	app.getUser().clickOnLogInButton();
}
@Test
public void addItemToCart(){
	app.getItem().clickOnButtonAddToCart();
	app.getItem().clickOnButtonShopingCart();
	Assert.assertTrue(app.getItem()
			.isElementPresent(By.cssSelector("[href='/141-inch-laptop']")));
}

}
