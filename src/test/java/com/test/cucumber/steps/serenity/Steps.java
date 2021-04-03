package com.test.cucumber.steps.serenity;

import com.test.pages.*;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class Steps extends ScenarioSteps {

    HomePage homePage;
    BasePage basePage;
    ResultsPage resultsPage;
    ChooseProductPage chooseProductPage;
    CustomiseProductPage customiseProductPage;
    ReviewProductPage reviewProductPage;
    ShoppingBagPage shoppingBagPage;
    CheckoutPage checkoutPage;

    @Given("^I go to the url$")
    public void i_go_to_the_url() {
        basePage.navigateToHomePage();
    }

    @When("^I choose a MacBook Pro with the following features and accessories$")
    public void i_choose_a_MacBook_Pro_with_the_following_features_and_accessories(DataTable arg1) throws InterruptedException {
        List<Map<String, String>> List = arg1.asMaps(String.class, String.class);
        homePage.clickMAC();
        resultsPage.selectProduct(List.get(0).get("Screen"));
        chooseProductPage.customiseProduct();
        customiseProductPage.selectMemory(List.get(0).get("MemoryRAM"));
        customiseProductPage.selectStorage(List.get(0).get("Storage"));
        customiseProductPage.selectSoftware(List.get(0).get("Software"));

    }

    @Then("^I can add it to the order$")
    public void i_can_add_it_to_the_order() throws InterruptedException {
        customiseProductPage.clickSubmitButton();
        reviewProductPage.clickReviewBagButton();
    }

    @Then("^the price is \"([^\"]*)\" GBP$")
    public void the_price_is_GBP(String price) {
        String actualPrice = shoppingBagPage.getPrice();
        Assert.assertEquals(price, actualPrice);
    }

    @Then("^I add accessories$")
    public void i_add_accessories(DataTable dataTable) {
        customiseProductPage.clickSubmitButton();
        List<Map<String, String>> List = dataTable.asMaps(String.class, String.class);
        reviewProductPage.addAccessories(List.get(0).get("Accessories"));
    }

    @When("^I proceed to the checkout$")
    public void i_proceed_to_the_checkout() {
        reviewProductPage.clickReviewBagButton();
        shoppingBagPage.proceedToCheckOut();
        checkoutPage.doGuestCheckout();
        checkoutPage.clickOrderSummary();
    }

    @When("^\"([^\"]*)\" will be listed for VAT$")
    public void will_be_listed_for_VAT(String vat) {
        String expectedMessage = "Includes VAT of " + vat;
        String actualMessage = checkoutPage.getVAT();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Then("^a total price of \"([^\"]*)\" will be displayed$")
    public void a_total_price_of_will_be_displayed(String price) {
        String actualPrice = checkoutPage.getTotalPrice();
        Assert.assertEquals(price, actualPrice);
    }

}