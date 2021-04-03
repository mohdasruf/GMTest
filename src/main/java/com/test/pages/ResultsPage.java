package com.test.pages;

public class ResultsPage extends BasePage {


    private static final String COMPARE_ALL_MODELS = "//*[@id=\"main\"]/section[5]/div/div/div/div[1]/a/span[1]";
    private static final String CLICK_SELECTOR = "//*[@id=\"selector-0\"]";
    private static final String BUY = "//*[@id=\"compare\"]/div/div/div/div[5]/div/div[2]/a";

    public ChooseProductPage selectProduct(String screenSize) {

        $(COMPARE_ALL_MODELS).click();
        $(CLICK_SELECTOR).selectByVisibleText(screenSize);
        $(BUY).click();
        return this.switchToPage(ChooseProductPage.class);
    }


}
