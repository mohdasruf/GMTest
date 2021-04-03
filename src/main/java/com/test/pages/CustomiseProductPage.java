package com.test.pages;

public class CustomiseProductPage extends BasePage {

    private static final String SUBMIT_BUTTON = "//*[@id=\"actiontray\"]/div/div[2]/div/div[2]/div[2]/button";

    public void selectMemory(String memory) {
        if (memory.equalsIgnoreCase("16 GB"))
            clickElement("document.getElementById('memory__dummy_z11b_065_c96k_2-label').click();");
    }


    public void selectStorage(String storage) {
        if (storage.equalsIgnoreCase("2TB SSD"))
            clickElement("document.getElementById('hard_drivesolid_state_drive__dummy_z11b_065_c96p_4').click();");
    }

    public void selectSoftware(String software) {
        if (software.equalsIgnoreCase("Logic Pro X"))
            clickElement("document.getElementsByClassName('form-choiceselectorlabel-twocol as-optiontile as-optiontile-hardware')[1].click();");
    }

    public ReviewProductPage clickSubmitButton() {
        $(SUBMIT_BUTTON).click();
        return this.switchToPage(ReviewProductPage.class);
    }

}
