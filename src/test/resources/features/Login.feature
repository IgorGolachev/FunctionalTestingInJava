Feature: Login

  @Smoke
  Scenario: Login as user
    Given Click Sing In Button
    When Sign In Page is loaded
    And Sign in with credentials
      | Email         | Password   |
      | test@test.org | test_pass! |
    Then Verify current user is "Igor Golachev"


  @Smoke
  Scenario: Create an account and login
    Given Click Sing In Button
    Then Sign In Page is loaded
    When Create a new account with a random email
    Then Create Account Page is loaded
    And Set email and password for new account
    And Fill out your personal information with values
      | Mr   | FirstName | LastName | Newsletter | SpecialOffer |
      | True | Igor      | Golachev | True       | True         |
    And Set "31-10-1984" as birth date
    And Fill out your address with values
      | FirstName | LastName | Company     | Address    | AddressLine2 | City   | State         | Zip   |
      | Igor      | Golachev | SomeCompany | SomeStreet | SomeAddress  | Boston | Massachusetts | 02760 |
    And Fill out your address with values
      | Country       | AdditionalInformation | HomePhone | MobilePhone | AddressAlias |
      | United States | SomeInfo              | 12356789  | 12345678909 | SomeAlias    |
    And Submit Account
    Then Verify current user is "Igor Golachev"
    And My Account Page Is Loaded
    When Click My Personal Information Button
    Then Your Personal Information Page Is Loaded
    And Personal Information is as following
      | Mr   | FirstName | LastName | Newsletter | SpecialOffer |
      | True | Igor      | Golachev | True       | True         |