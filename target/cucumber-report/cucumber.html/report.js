$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("banktest.feature");
formatter.feature({
  "line": 1,
  "name": "Bank Test",
  "description": "",
  "id": "bank-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3452233300,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Bank manager should add customer successfully",
  "description": "",
  "id": "bank-test;bank-manager-should-add-customer-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@sanity"
    },
    {
      "line": 3,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Click on \"Bank Manager Login\" tab on Homepage",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "click On \"Add Customer\" Tab on Bank manager login page",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Enter FirstName \"Alfa\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Enter LastName \"Romio\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Enter PostCode \"WD19 1AA\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Click On \"Add Customer\" Button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Popup display",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Verify message \"Customer added successfully with customer id :6\"",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Click on \"ok\" button on popup.",
  "keyword": "And "
});
formatter.match({
  "location": "BankTestSteps.userIsOnHomepage()"
});
formatter.result({
  "duration": 80246600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bank Manager Login",
      "offset": 10
    }
  ],
  "location": "BankTestSteps.clickOnTabOnHomepage(String)"
});
formatter.result({
  "duration": 412433700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Add Customer",
      "offset": 10
    }
  ],
  "location": "BankTestSteps.clickOnTabOnBankManagerLoginPage(String)"
});
formatter.result({
  "duration": 345403100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Alfa",
      "offset": 17
    }
  ],
  "location": "BankTestSteps.enterFirstName(String)"
});
formatter.result({
  "duration": 1403803900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Romio",
      "offset": 16
    }
  ],
  "location": "BankTestSteps.enterLastName(String)"
});
formatter.result({
  "duration": 1119766900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "WD19 1AA",
      "offset": 16
    }
  ],
  "location": "BankTestSteps.enterPostCode(String)"
});
formatter.result({
  "duration": 1104695600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Add Customer",
      "offset": 10
    }
  ],
  "location": "BankTestSteps.clickOnButton(String)"
});
formatter.result({
  "duration": 1083532700,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.popupDisplay()"
});
formatter.result({
  "duration": 2022984200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Customer added successfully with customer id :6",
      "offset": 16
    }
  ],
  "location": "BankTestSteps.verifyMessage(String)"
});
formatter.result({
  "duration": 2027653400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ok",
      "offset": 10
    }
  ],
  "location": "BankTestSteps.clickOnButtonOnPopup(String)"
});
formatter.result({
  "duration": 17215700,
  "status": "passed"
});
formatter.after({
  "duration": 660292900,
  "status": "passed"
});
formatter.before({
  "duration": 2218809500,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Bank manager should open account successfully",
  "description": "",
  "id": "bank-test;bank-manager-should-open-account-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@smoke"
    },
    {
      "line": 16,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "User is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "Click on \"Bank Manager Login\" tab on Homepage",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "Click on Open Account Tab on Bank manager login page",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Search customer that created in first test",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Select currency Pound",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Click on process button",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Popup display",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 25,
      "value": "#    Then Verify message \"Account created successfully with account Number :1016\" on Open account page"
    }
  ],
  "line": 26,
  "name": "Click on ok button on popup on open account page",
  "keyword": "And "
});
formatter.match({
  "location": "BankTestSteps.userIsOnHomepage()"
});
formatter.result({
  "duration": 14900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bank Manager Login",
      "offset": 10
    }
  ],
  "location": "BankTestSteps.clickOnTabOnHomepage(String)"
});
formatter.result({
  "duration": 561781000,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.clickOnOpenAccountTabOnBankManagerLoginPage()"
});
formatter.result({
  "duration": 1427584800,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.searchCustomerThatCreatedInFirstTest()"
});
formatter.result({
  "duration": 1349433700,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.selectCurrencyPound()"
});
formatter.result({
  "duration": 1075162700,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.clickOnProcessButton()"
});
formatter.result({
  "duration": 1070380700,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.popupDisplay()"
});
formatter.result({
  "duration": 2028657600,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.clickOnOkButtonOnPopupOnOpenAccountPage()"
});
formatter.result({
  "duration": 15906200,
  "status": "passed"
});
formatter.after({
  "duration": 650836300,
  "status": "passed"
});
formatter.before({
  "duration": 2271450600,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "Customer should Login and Logout successfully",
  "description": "",
  "id": "bank-test;customer-should-login-and-logout-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 28,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 30,
  "name": "User is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": "click on Customer Login Tab",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "search customer that you created.",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "click on Login Button",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "verify Logout Tab displayed.",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "click on Logout",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "verify \"Your Name :\" text displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "BankTestSteps.userIsOnHomepage()"
});
formatter.result({
  "duration": 24400,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.clickOnCustomerLoginTab()"
});
formatter.result({
  "duration": 1598159200,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.searchCustomerThatYouCreated()"
});
formatter.result({
  "duration": 2374081700,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.clickOnLoginButton()"
});
formatter.result({
  "duration": 1059962700,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.verifyLogoutTabDisplayed()"
});
formatter.result({
  "duration": 1065081700,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.clickOnLogout()"
});
formatter.result({
  "duration": 1099635300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Your Name :",
      "offset": 8
    }
  ],
  "location": "BankTestSteps.verifyTextDisplayed(String)"
});
formatter.result({
  "duration": 1055549000,
  "status": "passed"
});
formatter.after({
  "duration": 662965300,
  "status": "passed"
});
formatter.before({
  "duration": 2289814600,
  "status": "passed"
});
formatter.scenario({
  "line": 39,
  "name": "Customer should Deposit and Withdraw money successfully",
  "description": "",
  "id": "bank-test;customer-should-deposit-and-withdraw-money-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 38,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 40,
  "name": "User is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 41,
  "name": "click on Customer Login Tab",
  "keyword": "When "
});
formatter.step({
  "line": 42,
  "name": "search customer that you created.",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "click on Login Button",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "click on Deposit Tab on top menu.",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "Enter amount \"100\"",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "click on Deposit Button at bottom",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "Verify message \"Deposit Successful\" after Deposit amount",
  "keyword": "Then "
});
formatter.step({
  "line": 48,
  "name": "click on Withdraw Tab",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "Enter amount \"50\" to withdraw amount",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "click on Withdraw Button",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "verify message \"Transaction successful\"after withdraw money",
  "keyword": "And "
});
formatter.match({
  "location": "BankTestSteps.userIsOnHomepage()"
});
formatter.result({
  "duration": 18900,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.clickOnCustomerLoginTab()"
});
formatter.result({
  "duration": 1612040700,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.searchCustomerThatYouCreated()"
});
formatter.result({
  "duration": 2378342600,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.clickOnLoginButton()"
});
formatter.result({
  "duration": 1049230800,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.clickOnDepositTabOnTopMenu()"
});
formatter.result({
  "duration": 1378914700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "100",
      "offset": 14
    }
  ],
  "location": "BankTestSteps.enterAmount(String)"
});
formatter.result({
  "duration": 1126653200,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.clickOnDepositButtonAtBottom()"
});
formatter.result({
  "duration": 1085805700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Deposit Successful",
      "offset": 16
    }
  ],
  "location": "BankTestSteps.verifyMessageAfterDepositAmount(String)"
});
formatter.result({
  "duration": 1032820000,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.clickOnWithdrawTab()"
});
formatter.result({
  "duration": 1065478400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "50",
      "offset": 14
    }
  ],
  "location": "BankTestSteps.enterAmountToWithdrawAmount(String)"
});
formatter.result({
  "duration": 1105503500,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.clickOnWithdrawButton()"
});
formatter.result({
  "duration": 1048938500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Transaction successful",
      "offset": 16
    }
  ],
  "location": "BankTestSteps.verifyMessageAfterWithdrawMoney(String)"
});
formatter.result({
  "duration": 1031285300,
  "status": "passed"
});
formatter.after({
  "duration": 638299700,
  "status": "passed"
});
});