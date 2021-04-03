package com.test.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;

public class BasePage extends PageObject {

    public HomePage navigateToHomePage() {
        open();
        return this.switchToPage(HomePage.class);
    }

    public void clickElement(String s) {
        ((JavascriptExecutor) getDriver()).executeScript(s);
    }

}
