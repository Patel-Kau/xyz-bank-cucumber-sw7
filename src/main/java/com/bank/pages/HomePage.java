package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    //     click On "Bank Manager Login" Tab
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Bank Manager Login']")
    WebElement bankManager;


    // click on "Customer Login" Tab
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Customer Login']")
    WebElement customerLogin;


    //     click On "Bank Manager Login" Tab
    public void clickOnBankMangerLogin(){
        log.info("click On Bank Manager Login Tab"+ bankManager.toString());
        clickOnElement(bankManager);
    }
    // click on "Customer Login" Tab
    public void clickOnCustomerLogin() throws InterruptedException {
        log.info("click on Customer Login Tab"+ customerLogin.toString());
        Thread.sleep(1000);
        clickOnElement(customerLogin);
    }









}
