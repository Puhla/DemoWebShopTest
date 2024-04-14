package com.demowebshop.tests;

import com.demoWebShop.models.Contact;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Random;

public class CreateAccountTests extends TestBase{
//@BeforeMethod
//public void ensurePrecondition(){
//	if(!app.getUser().isLoginLinkPresent ()){
//		app.getContact ().clickOnRegisterLink ();
//	}
//}

@Test//(enabled = false)
public void createNewAccountPositiveTest () {
	Random random= new Random ();
	int i = random.nextInt (1000)+1000;
	app.getContact ().clickOnRegisterLink ();
	app.getContact ().fillRegisterForm (new Contact ()
			.setFirstname ("HBh")
			.setLastname ("Chebova")
			.setEmail ("fgha1"+i+"@gmail.com")
			.setPassword ("$Roma!$1")
			.setConfirmPassword ("$Roma!$1"));
	app.getContact ().clickOnRegisterButton ();
	Assert.assertTrue(app.getContact().isAccountCreated ());
	
}

@Test(enabled = false)
public void createNewAccountWithExitedEmailNegativeTest () {
	app.getContact ().clickOnRegisterLink ();
	app.getContact ().fillRegisterForm (new Contact()
			.setFirstname ("Gena")
			.setLastname ("Cheburashkov")
			.setEmail ("")
			.setPassword ("$Roma!$1")
			.setConfirmPassword ("$Roma!$1"));
	app.getContact ().clickOnRegisterButton ();
	Assert.assertTrue(app.getContact ().isPageTitlePresent ());
	
}

}

	

	
	
	






