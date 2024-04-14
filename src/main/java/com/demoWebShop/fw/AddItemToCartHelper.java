package com.demoWebShop.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddItemToCartHelper extends BaseHelper{
public AddItemToCartHelper (WebDriver driver) {
	super (driver);
}

public void clickOnRemoveFromCartInCheckBox (By locator) {
	click (locator);
}

public boolean isShoppingCartPresent () {
	return isElementPresent (By.cssSelector ("a[href='/cart'].ico-cart .cart-label"));
}

public void clickOnShoppingCartLink () {
	click (By.cssSelector ("[id='topcartlink']"));
}

public void clickOnAddToCartButton () {
	click (By.cssSelector
			("div.product-item[data-productid='31'] .buttons input[type='button']"));
}

public boolean isShoppingCartIsEmpty () {
	return isElementPresent ( By.name("itemquantity4165851"));
}

public void clickOnUpdateCartButton () {
	click (By.cssSelector (".button-2.update-cart-button"));
}

public void clickOnRemoveFromCartInCheckbox() {
	click(By.cssSelector("td.remove-from-cart input[type='checkbox']"));
}
}
