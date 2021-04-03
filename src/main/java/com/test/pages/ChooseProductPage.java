package com.test.pages;

public class ChooseProductPage extends BasePage {

    private static final String THIRTEEN_INCH = "//*[@id=\"model-selection\"]/bundle-selection/store-provider/div[2]/sticky/div/fieldset/div/span/button[1]";

    public CustomiseProductPage customiseProduct() {
        $(THIRTEEN_INCH).click();
        clickElement("document.getElementById('colorOptionGridGroup_MYDA2B/A').click();");
        clickElement("document.getElementsByName('proceed')[0].click();");
        return this.switchToPage(CustomiseProductPage.class);
    }

}
