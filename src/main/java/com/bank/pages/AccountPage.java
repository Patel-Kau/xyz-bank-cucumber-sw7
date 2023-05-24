package com.bank.pages;


import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(AccountPage.class.getName());
    // click on "Deposit" Tab
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Deposit']")
    WebElement deposit;

    // Enter amount 100
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement amountTab;


    //click on "Deposit" Button
    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement clickDeposit;

    // verify message "Deposit Successful"
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Deposit Successful')]")
    WebElement depositSuccessfullyText;


    //click on "Withdrawl" Tab
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Withdrawl']")
    WebElement withdrawl;

    // Enter amount 50
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement withdrawalAmountTab;

    //click on "Deposit" Button
    By withdrawTab = By.xpath("//button[@class='btn btn-default']");
    //	verify message "Transaction Successful"
    By withdrawalSuccessfullyText = By.xpath("//span[@class='error ng-binding']");


    //click on "Deposit" Tab
    public void clickOnDepositTab() throws InterruptedException {
        log.info("click on Deposit Tab" + deposit.toString());
        Thread.sleep(1000);
        clickOnElement(deposit);
    }

    // Enter amount 100
    public void enterAmount(String amount) throws InterruptedException {
        log.info("Enter amount 100");
        Thread.sleep(1000);
        sendTextToElement(amountTab, amount);
    }

    //click on "Deposit" Button
    public void clickDepositTab() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(clickDeposit);
    }

    // verify message "Deposit Successful"
    public String verifyDepositSuccessfullyTextMessage() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(depositSuccessfullyText);
    }

    //click on "Withdrawl" Tab
    public void clickOnWithdrawl() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(withdrawl);
    }

    //Enter amount 50
    public void enterWithdrawlAmount(String amount) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(withdrawalAmountTab, amount);
    }

    //click on "Deposit" Button
    public void clickOnWithdrawTransactionTab() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(withdrawTab);
    }

    //	verify message "Transaction Successful"
    public String verifyWithdrawalSuccessfullyTextMessage() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(withdrawalSuccessfullyText);
    }

}
