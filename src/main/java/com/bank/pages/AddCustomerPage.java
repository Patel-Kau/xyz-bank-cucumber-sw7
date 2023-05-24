package com.bank.pages;


import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AddCustomerPage extends Utility {
    private static final Logger log = LogManager.getLogger(AddCustomerPage.class.getName());
    // * 	click On "Add Customer" Tab
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Add Customer']")
    WebElement addCustomer;

    // Enter FirstName
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement firstName;

    // Enter Last Name
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement lastName;

    // Enter PostCode
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Post Code']")
    WebElement postCode;

    // Click on Add Button
    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement addButton;


    // Enter First Name
    public void enterFirstname(String value) throws InterruptedException {
        log.info("Enter First Name" + firstName.toString());
        Thread.sleep(1000);
        sendTextToElement(firstName, value);
    }

    // Enter Last Name
    public void enterLastname(String value) throws InterruptedException {
        log.info("Enter Last Name" + lastName.toString());
        Thread.sleep(1000);
        sendTextToElement(lastName, value);
    }

    // Enter PostCode
    public void enterPostCode(String value) throws InterruptedException {
        log.info("Enter PostCode"+ postCode.toString());
        Thread.sleep(1000);
        sendTextToElement(postCode, value);
    }

    // Click On Add Button
    public void clickOnAddButton() throws InterruptedException {
        log.info("Click On Add Button"+ addButton.toString());
        Thread.sleep(1000);
        clickOnElement(addButton);
    }

    // Popup Display
    public String verifyTextFromPopUp() throws InterruptedException {
        log.info("Popup Display");
        Thread.sleep(2000);

        return getTextFromAlert();
    }

    public void acceptAlert() {
        log.info("Accept alert");
        driver.switchTo().alert().accept();
    }


}



