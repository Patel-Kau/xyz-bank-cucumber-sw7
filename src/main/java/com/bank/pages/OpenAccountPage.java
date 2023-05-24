package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class OpenAccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(OpenAccountPage.class.getName());

    // click On "Open Account" Tab
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Open Account']")
    WebElement openAccount;



    // Search customer that created in first test
    @CacheLookup
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement searchCustomer;

    // Select currency "Pound"
    @CacheLookup
    @FindBy(xpath = "//select[@id='currency']")
    WebElement currency;

    // 	click on "process" button
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Process']")
    WebElement process;




    // click On "Open Account" Tab
    public void clickOnOpenAccount() throws InterruptedException {
        log.info("click On Open Account Tab"+ openAccount.toString());
        Thread.sleep(1000);
        clickOnElement(openAccount);
    }
    // Search customer that created in first test
    public void clickAndSelectCustomerName() throws InterruptedException {
        log.info("Search customer that created in first test"+ searchCustomer.toString());
        Thread.sleep(1000);
        // clickOnElement(By.xpath("//select[@id='userSelect']"));
        selectByVisibleTextFromDropDown(searchCustomer,"Harry Potter");
    }
    //Select currency "Pound"
    public void selectCurrency() throws InterruptedException {
        log.info("Select currency Pound"+ currency.toString());
        Thread.sleep(1000);
        selectByVisibleTextFromDropDown(currency,"Pound");
    }
    // 	click on "process" button
    public void clickOnProcessButton() throws InterruptedException {
        log.info("click on process button"+ process.toString());
        Thread.sleep(1000);
        clickOnElement(process);
    }

    // Popup Displayed and verify Message
    public String verifyTextFromPopUp() throws InterruptedException {
        log.info("Popup Displayed and verify Message");
        Thread.sleep(2000);
        return getTextFromAlert();
    }
    public void acceptAlert(){
        log.info("Accept alert");

        driver.switchTo().alert().accept();
    }

}
