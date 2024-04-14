package com.demowebshop.tests;

import com.demoWebShop.fw.ApplicationManager;
import org.openqa.selenium.remote.Browser;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {

protected static ApplicationManager app = new ApplicationManager
		(System.getProperty ("browser", Browser.CHROME.browserName ()));

//@BeforeMethod
@BeforeSuite
public void setUp () {
	app.init ();
}

//@AfterMethod(enabled = false)
@AfterSuite(enabled = false)
public void tearDown () {
	app.stop ();
}

}




//public boolean isContactCreated(String text) {
//
//	List<WebElement> contacts = driver.findElements(By.cssSelector("h2"));
//
//	for (WebElement element: contacts) {
//		if (element.getText().contains(text))
//			return true;
//	}
//	return false;
//}
//public int sizeOfContacts() {
//	if (isElementPresent(By.cssSelector(""))) {
//		return driver.findElements(By.cssSelector(".contact-item_card__2SOIM")).size();
//	}
//	return 0;
//}
