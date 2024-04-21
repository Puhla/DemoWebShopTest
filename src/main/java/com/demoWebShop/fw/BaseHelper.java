package com.demoWebShop.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class BaseHelper {
WebDriver driver;

public BaseHelper(WebDriver driver) {
	this.driver = driver;
}

public boolean isElementPresent(By locator) {
	return driver.findElements(locator).size() > 0;
}

public void type(By locator, String text) {
	if (text != null) {
		click(locator);
		driver.findElement(locator).clear();
		driver.findElement(locator).sendKeys(text);
	}
}

public void click(By locator) {
	driver.findElement(locator).click();
}

public boolean isCustomerPresent() {
	return isElementPresent(By.cssSelector("[href='/customer/info']"));
}

public void pause(int millis) {
	try {
		Thread.sleep(millis);
	} catch (InterruptedException e) {
		throw new RuntimeException(e);
	}
}
public String takeScreenshot(){
	File tmp = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File screenshot = new File("screenshots/screen-" + System.currentTimeMillis() + ".png");
	
	try {
		Files.copy(tmp.toPath (), screenshot.toPath ());
	} catch (IOException e) {
		throw new RuntimeException(e);
	}
	return screenshot.getAbsolutePath();
}
}
