package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BankManagerLoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(BankManagerLoginPage.class.getName());

    // click On "Open Account" Tab
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Open Account']")
    WebElement openAccount;
    // * 	click On "Add Customer" Tab
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Add Customer']")
    WebElement addCustomer;







    // click On "Open Account" Tab
    public void clickOnOpenAccount() throws InterruptedException {
        log.info("click On Open Account Tab"+ openAccount.toString());
        Thread.sleep(1000);
        clickOnElement(openAccount);
    }

    // * 	click On "Add Customer" Tab
    public void clickOnAddCustomer() {
        log.info("click On Add Customer Tab" + addCustomer.toString());
       clickOnElement(addCustomer);
    }

}
