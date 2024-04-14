package com.demoWebShop.fw;

import com.demoWebShop.fw.ContactHelper;
import com.demoWebShop.fw.HomePageHelper;
import com.demoWebShop.fw.AddItemToCartHelper;
import com.demoWebShop.fw.UserHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.sql.Driver;
import java.time.Duration;

public class ApplicationManager {

static WebDriver driver;
private  String browser;
UserHelper user;
ContactHelper contact;
HomePageHelper homePage;
AddItemToCartHelper addItemToCart;

public ApplicationManager (String browser) {
	this.browser=browser;
}

public void init () {
	if(browser.equalsIgnoreCase ("chrome")){
		driver = new ChromeDriver ();
	}if ((browser.equalsIgnoreCase ("firefox"))){
		driver =new FirefoxDriver ();
	}if ((browser.equalsIgnoreCase ("edge"))) {
		driver = new EdgeDriver ();
	}if ((browser.equalsIgnoreCase ("safari"))) {
		driver = new SafariDriver ();
	}
	
	driver.get ("https://demowebshop.tricentis.com");
	driver.manage ().window ().maximize ();
	driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));
user = new UserHelper (driver);
contact = new ContactHelper (driver);
homePage = new HomePageHelper (driver);
addItemToCart = new AddItemToCartHelper (driver);

}

public UserHelper getUser () {
	return user;
}

public ContactHelper getContact () {
	return contact;
}

public HomePageHelper getHomePage () {
	return homePage;
}

public AddItemToCartHelper getAddItemToCart () {
	return addItemToCart;
}

public   void stop () {
	driver.quit ();
}

}
