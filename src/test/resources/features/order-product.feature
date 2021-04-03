

Feature: Buying a MacBook Pro on the website
  As an online customer
  I want to choose a MacBook with accessories on the website
  So that I can buy it online

  Background:
    Given I go to the url
    When I choose a MacBook Pro with the following features and accessories
      | Screen                        | Processor | MemoryRAM | Colour | Software    | Storage |
      | MacBook Pro 13-in. (M1, 2020) | 2.3 GHz   | 16 GB     | Silver | Logic Pro X | 2TB SSD |

  @choose
  Scenario: A MacBook 13” with accessories can be ordered on the website
    Then I can add it to the order
    And the price is "£2,299.00" GBP

  @check
  Scenario: The correct price and VAT are displayed for a MacBook 13” with accessories
    Then I add accessories
      | Accessories |
      | Adapter     |
    When I proceed to the checkout
    Then a total price of "£2,318.00" will be displayed
    And "£386.34" will be listed for VAT
