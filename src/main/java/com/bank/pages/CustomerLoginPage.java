package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CustomerLoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(CustomerLoginPage.class.getName());

    // search customer that you created.
    @CacheLookup
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement customer;

    // click on "Login" Button
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement login;

    //verify "Logout" Tab displayed.
//    @CacheLookup
//    @FindBy(xpath = "")
//    WebElement logout;
    By logout = By.xpath("//button[normalize-space()='Logout']");

    //click on "Logout"
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Logout']")
    WebElement clickLogout;

    // verify "Your Name" text displayed.
    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'Your Name :')]")
    WebElement verifyName;


    // search customer that you created.
    public void searchCustomer() throws InterruptedException {
        log.info("search customer that you created." + customer.toString());
        Thread.sleep(2000);
        selectByVisibleTextFromDropDown(customer, "Harry Potter");
    }

    //click on "Login" Button
    public void clickOnLoginButton() throws InterruptedException {
        log.info("click on Login Button" + login.toString());
        Thread.sleep(1000);
        clickOnElement(login);
    }

    // verify "Logout" Tab displayed.


    public boolean isLogoutButtonPresence() throws InterruptedException {
        log.info("verify Logout Tab displayed." + logout.toString());
        Thread.sleep(1000);
        WebElement logoutButton = driver.findElement(logout);
        return logoutButton.isDisplayed();
    }

    // click on "Logout"
    public void clickOnLogoutTab() throws InterruptedException {
        log.info("click on Logout" + clickLogout.toString());
        Thread.sleep(1000);
        clickOnElement(clickLogout);
    }

    // verify "Your Name" text displayed.
    public String verifyYourNameTextIsDisplayed() throws InterruptedException {
        log.info("verify Your Name text displayed." + verifyName.toString());
        Thread.sleep(1000);
        return getTextFromElement(verifyName);
    }
}
