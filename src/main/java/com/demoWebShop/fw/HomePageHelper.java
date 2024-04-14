package com.demoWebShop.fw;

import com.demoWebShop.fw.BaseHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageHelper extends BaseHelper {
public HomePageHelper (WebDriver driver) {
	super (driver);
}

public  boolean isHomeComponentPresent (){
	return isElementPresent (By.cssSelector (".nivo-controlNav"));
}
}
