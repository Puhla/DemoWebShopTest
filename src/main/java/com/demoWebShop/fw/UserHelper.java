package com.demoWebShop.fw;

import com.demoWebShop.models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends BaseHelper{
public UserHelper (WebDriver driver) {
	super (driver);
}
public void clickOnRegistrationButton() {
	click(By.id("register-button"));
}

public void fillRegisterForm(User newUser) {
	type(By.id("FirstName"), newUser.getFirstName () );
	type(By.id("LastName"), newUser.getLastName());
	type(By.id("Email"), newUser.getEmail());
	type(By.id("Password"), newUser.getPassword());
	type(By.id("ConfirmPassword"), newUser.getConfirmPassword());
}

public void fillLoginAndPassword(User user) {
	type(By.id("Email"), user.getEmail());
	type(By.id("Password"), user.getPassword());
}

public void clickOnRegisterLink() {
	click(By.cssSelector("[href='/register']"));
}

public void clickOnLogInButton() {
	click(By.xpath("//div[@class='buttons']/input[@class='button-1 login-button']"));
}

public void clickOnLoginLink() {
	click(By.cssSelector("[href='/login']"));
}

public void clickOnLogOutButton() {
	click(By.cssSelector("[href='/logout']"));
}

public boolean isLoginLinkPresent() {
	return isElementPresent(By.cssSelector("[href='/login']"));
}

}
