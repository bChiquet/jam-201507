Feature: home page feature

  Scenario: Root scenario with simplelenium
    Given I'm on the home page simplelenium
    Then I should see a welcome message simplelenium

  Scenario: Home link click scenario with simplelenium
    Given I'm on the home page simplelenium
    When I click on the home button simplenium
    Then I should see a welcome message simplelenium

  Scenario: Root scenario with fluentlenium
    Given I'm on the home page fluentlenium
    Then I should see a welcome message fluentlenium

  Scenario: Home link click scenario with fluentlenium
    Given I'm on the home page fluentlenium
    When I click on the home button fluentlenium
    Then I should see a welcome message fluentlenium
