Feature:  Bank Test

  @sanity @regression
  Scenario: Bank manager should add customer successfully
    Given User is on homepage
    When Click on "Bank Manager Login" tab on Homepage
    And click On "Add Customer" Tab on Bank manager login page
    And Enter FirstName "Alfa"
    And Enter LastName "Romio"
    And Enter PostCode "WD19 1AA"
    And Click On "Add Customer" Button
    Then Popup display
    Then Verify message "Customer added successfully with customer id :6"
    And Click on "ok" button on popup.

  @smoke @regression
  Scenario: Bank manager should open account successfully
    Given User is on homepage
    When Click on "Bank Manager Login" tab on Homepage
    And Click on Open Account Tab on Bank manager login page
    And Search customer that created in first test
    And Select currency Pound
    And Click on process button
    Then Popup display
#    Then Verify message "Account created successfully with account Number :1016" on Open account page
    And Click on ok button on popup on open account page

    @regression
    Scenario: Customer should Login and Logout successfully
      Given User is on homepage
      When click on Customer Login Tab
      And search customer that you created.
      And click on Login Button
      And verify Logout Tab displayed.
      And click on Logout
      Then verify "Your Name :" text displayed

      @regression
    Scenario: Customer should Deposit and Withdraw money successfully
     Given User is on homepage
      When click on Customer Login Tab
      And search customer that you created.
      And click on Login Button
      And click on Deposit Tab on top menu.
      And Enter amount "100"
      And click on Deposit Button at bottom
     Then Verify message "Deposit Successful" after Deposit amount
      And click on Withdraw Tab
      And Enter amount "50" to withdraw amount
      And click on Withdraw Button
      And verify message "Transaction successful"after withdraw money




