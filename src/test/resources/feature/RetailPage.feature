@RetailPage @smokeTest
Feature: Retail Page

  Background: 
    Given User is on Retail website
    And User click on MyAccount
    When User click on Login
    And User enter username 'userName' and password 'password’
    And User click on Login button
    Then User should be logged in to MyAccount dashboard

  @AffiliateReg
  Scenario: Register as an Affiliate user with Cheque Payment Method
    When User click onn 'Register for an Affiliate Account' link
    And User fill affiliate form with below information
      | company   | website          | taxID | paymentMethod | ChequePayeeName |
      | TekSchool | www.tekschool.us |  0987 | cheque        | check           |
    And User check on About us check box
    And User click on Continue button
    Then User should see a success message

  @EditAffiliate
  Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
    When User click on 'Edit your affiliate information' link
    And user click on Bank Transfer radio button
    And User fill Bank information with below information
      | bankName   | abaNumber | swiftCode | accountName | accountNumber |
      | CapitalOne |   0987654 |  00789456 | Checking    | 0012345678900 |
    And User click on Continue button
    Then User should see a success message

  @EditAccount
  Scenario: Edit your account Information
    When User click on 'Edit your account information' linkk
    And User modify below information
      | firstname | lastName | email                   | telephone  |
      | Beheshta  | Bareen        | bk.bareen20@gmail.com | 1239872323 |
    And User click on continue button1
    Then User should see a message 'Success: Your account has been successfully updated.'
