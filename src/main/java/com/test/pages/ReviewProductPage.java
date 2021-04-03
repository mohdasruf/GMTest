package com.test.pages;

public class ReviewProductPage extends BasePage {

    private static final String REVIEW_BAG = "//*[@id='summaryheader-form']/div/span/button/span";
    private static final String USB_ADAPTER = "//*[@id=\"main\"]/store-provider/ajax-handler/attach/div[2]/div[4]/accessory/div/div[4]/async-add-bag/button";

    public ShoppingBagPage clickReviewBagButton() {
        $(REVIEW_BAG).click();
        return this.switchToPage(ShoppingBagPage.class);
    }

    public ShoppingBagPage addAccessories(String accessories) {
        if (accessories.equalsIgnoreCase("Adapter"))
            $(USB_ADAPTER).click();
        return this.switchToPage(ShoppingBagPage.class);
    }
}
