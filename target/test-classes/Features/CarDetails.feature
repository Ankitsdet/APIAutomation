
Feature: As a customer , I want to select the car details, I want to sell , so that i can receive an offer from acompany

 
  Scenario: Verify the dropdown values for fields on search page of auto1.com
    Given I get the brand list with below parameters
      | ResourceUrl                | wa_key                       |
      | /v1/car-types/manufacturer | coding-puzzle-client-449cc9d |
    Then I validate brand dropdown values for Manufacturer field
    Given I get the model l  ist with below parameters
      | ResourceUrl              | wa_key                       | manufacturer |
      | /v1/car-types/main-types | coding-puzzle-client-449cc9d |          860 |
    Then I validate model dropdown values for 'Model Type' field
    Given I get the initial registration dates with below parameters
      | ResourceUrl               | wa_key                       | manufacturer | main-type |
      | /v1/car-types/built-dates | coding-puzzle-client-449cc9d |          860 | Corolla   |
    Then I validate initial registration dropdown values for 'Registration Date' field
