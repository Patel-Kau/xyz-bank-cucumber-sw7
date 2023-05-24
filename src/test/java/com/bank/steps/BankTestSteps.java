package com.bank.steps;

import com.bank.pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

/**
 * Created by Kaushik Patel
 */
public class BankTestSteps {
    @Given("^User is on homepage$")
    public void userIsOnHomepage() {
    }

    @When("^Click on \"([^\"]*)\" tab on Homepage$")
    public void clickOnTabOnHomepage(String bankManagerLogin) {
        new HomePage().clickOnBankMangerLogin();
    }

    @And("^click On \"([^\"]*)\" Tab on Bank manager login page$")
    public void clickOnTabOnBankManagerLoginPage(String addCustomer) {
        new BankManagerLoginPage().clickOnAddCustomer();
    }

    @And("^Enter FirstName \"([^\"]*)\"$")
    public void enterFirstName(String firstName) throws InterruptedException {
        new AddCustomerPage().enterFirstname(firstName);
    }

    @And("^Enter LastName \"([^\"]*)\"$")
    public void enterLastName(String lastName) throws InterruptedException {
        new AddCustomerPage().enterLastname(lastName);
    }

    @And("^Enter PostCode \"([^\"]*)\"$")
    public void enterPostCode(String postCode) throws InterruptedException {
        new AddCustomerPage().enterPostCode(postCode);
    }

    @And("^Click On \"([^\"]*)\" Button$")
    public void clickOnButton(String addCustomer) throws InterruptedException {
        new AddCustomerPage().clickOnAddButton();
    }

    @Then("^Popup display$")
    public void popupDisplay() throws InterruptedException {
        new AddCustomerPage().verifyTextFromPopUp();
    }

    @Then("^Verify message \"([^\"]*)\"$")
    public void verifyMessage(String customerAddedSuccessfullyMessage) throws InterruptedException {
        Assert.assertEquals(new AddCustomerPage().verifyTextFromPopUp(), customerAddedSuccessfullyMessage, "Error Message : 'Customer added successfully' is not matching");
    }

    @And("^Click on \"([^\"]*)\" button on popup\\.$")
    public void clickOnButtonOnPopup(String okButton) {
        new AddCustomerPage().acceptAlert();

    }

    @And("^Search customer that created in first test$")
    public void searchCustomerThatCreatedInFirstTest() throws InterruptedException {
        new OpenAccountPage().clickAndSelectCustomerName();
    }

    @And("^Select currency Pound$")
    public void selectCurrencyPound() throws InterruptedException {
        new OpenAccountPage().selectCurrency();
    }

    @And("^Click on process button$")
    public void clickOnProcessButton() throws InterruptedException {
        new OpenAccountPage().clickOnProcessButton();
    }

    @And("^Click on Open Account Tab on Bank manager login page$")
    public void clickOnOpenAccountTabOnBankManagerLoginPage() throws InterruptedException {
        new OpenAccountPage().clickOnOpenAccount();
    }

    @Then("^Verify message \"([^\"]*)\" on Open account page$")
    public void verifyMessageOnOpenAccountPage(String alertMessage) throws InterruptedException {
        new OpenAccountPage().acceptAlert();
       Assert.assertEquals(new OpenAccountPage().verifyTextFromPopUp(),alertMessage,"Error: Text in Alert message is not matching");
    }

    @And("^Click on ok button on popup on open account page$")
    public void clickOnOkButtonOnPopupOnOpenAccountPage() {
        new OpenAccountPage().acceptAlert();
    }

    @When("^click on Customer Login Tab$")
    public void clickOnCustomerLoginTab() throws InterruptedException {
        new HomePage().clickOnCustomerLogin();
    }

    @And("^search customer that you created\\.$")
    public void searchCustomerThatYouCreated() throws InterruptedException {
        new CustomerLoginPage().searchCustomer();
    }

    @And("^click on Login Button$")
    public void clickOnLoginButton() throws InterruptedException {
        new CustomerLoginPage().clickOnLoginButton();

    }

    @And("^verify Logout Tab displayed\\.$")
    public void verifyLogoutTabDisplayed() throws InterruptedException {
        new CustomerLoginPage().isLogoutButtonPresence();
    }

    @And("^click on Logout$")
    public void clickOnLogout() throws InterruptedException {
        new CustomerLoginPage().clickOnLogoutTab();

    }

    @Then("^verify \"([^\"]*)\" text displayed$")
    public void verifyTextDisplayed(String textDisplay) throws InterruptedException {
        Assert.assertEquals(new CustomerLoginPage().verifyYourNameTextIsDisplayed(),textDisplay,"Error: Text Displayed is not matching");
    }

    @And("^click on Deposit Tab on top menu\\.$")
    public void clickOnDepositTabOnTopMenu() throws InterruptedException {
    new AccountPage().clickOnDepositTab();
    }

    @And("^Enter amount \"([^\"]*)\"$")
    public void enterAmount(String depositAmount) throws InterruptedException {
        new AccountPage().enterAmount(depositAmount);

    }

    @And("^click on Deposit Button at bottom$")
    public void clickOnDepositButtonAtBottom() throws InterruptedException {
        new AccountPage().clickDepositTab();
    }


    @Then("^Verify message \"([^\"]*)\" after Deposit amount$")
    public void verifyMessageAfterDepositAmount(String depositSuccessfulMessage) throws InterruptedException {
        Assert.assertEquals(new AccountPage().verifyDepositSuccessfullyTextMessage(),depositSuccessfulMessage,"Error: 'Deposit successfully' message is not matching");

    }

    @And("^click on Withdraw Tab$")
    public void clickOnWithdrawTab() throws InterruptedException {
        new AccountPage().clickOnWithdrawl();
    }



    @And("^click on Withdraw Button$")
    public void clickOnWithdrawButton() throws InterruptedException {
        new AccountPage().clickOnWithdrawTransactionTab();
    }



    @And("^Enter amount \"([^\"]*)\" to withdraw amount$")
    public void enterAmountToWithdrawAmount(String withdrawAmount) throws InterruptedException {
        new AccountPage().enterWithdrawlAmount(withdrawAmount);

    }

    @And("^verify message \"([^\"]*)\"after withdraw money$")
    public void verifyMessageAfterWithdrawMoney(String transactionSuccessfulMessage) throws InterruptedException {
        Assert.assertEquals(new AccountPage().verifyWithdrawalSuccessfullyTextMessage(),transactionSuccessfulMessage,"Error : 'Transaction successfully' text message is not matching ");

    }
}
