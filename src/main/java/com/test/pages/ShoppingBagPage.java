package com.test.pages;

public class ShoppingBagPage extends BasePage {

    private static final String PRICE = "//*[@id=\"bag-content\"]/div[2]/div/div[1]/div/div[2]";
    private static final String CHECKOUT = "//*[@id=\"shoppingCart.actions.checkout\"]";

    public String getPrice() {
        return $(PRICE).getText();
    }

    public CheckoutPage proceedToCheckOut() {
        $(CHECKOUT).click();
        return this.switchToPage(CheckoutPage.class);
    }
}
