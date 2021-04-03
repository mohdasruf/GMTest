package com.test.pages;

public class CheckoutPage extends BasePage {

    private static final String GUEST_CHECKOUT = "//*[@id=\"signIn.guestLogin.guestLogin\"]";
    private static final String ORDER_SUMMARY = "//*[@id=\"companionbar-button\"]";
    private static final String TOTAL_PRICE = "//*[@id=\"recon-0-67-overlay\"]/div/section[1]/div/ul/li[4]/span[2]";
    private static final String VAT = "//*[@id=\"recon-0-67-overlay\"]/div/section[1]/div/ul/li[5]";

    public void doGuestCheckout() {
        $(GUEST_CHECKOUT).click();
    }

    public void clickOrderSummary() {
        $(ORDER_SUMMARY).click();
    }

    public String getTotalPrice() {
        return $(TOTAL_PRICE).getText();
    }

    public String getVAT() {
        return $(VAT).getText();
    }
}
