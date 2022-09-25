Feature: Case Study Tests

  Background:
    Given homepage is open
    And close pop-up

  Scenario: Verify payment page
    Then Go to Dizaltı Çorap category page
    And Filter product color with Siyah
    And Go to any product detail page
    And Add product to basket
    And Go to basket page
    When Go to payment page
    Then Verfiy payment page

