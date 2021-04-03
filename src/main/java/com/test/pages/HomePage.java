package com.test.pages;


public class HomePage extends BasePage {

    private static final String MAC = "//*[@id=\"ac-globalnav\"]/div/ul[2]/li[2]/a";

    public ResultsPage clickMAC() {
        $(MAC).click();
        return this.switchToPage(ResultsPage.class);
    }

}
