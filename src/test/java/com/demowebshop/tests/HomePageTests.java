package com.demowebshop.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTests extends TestBase{

@BeforeMethod
public void ensurePrecondition(){
	if(!app.getHomePage ().isHomeComponentPresent ()){
		app.getUser ().clickOnLogOutLink ();
		
	}
	//onLogOutLink
}

@Test
public void isHomeComponentPresentTest () {
	Assert.assertTrue (app.getHomePage ().isHomeComponentPresent ());
	
}

}

