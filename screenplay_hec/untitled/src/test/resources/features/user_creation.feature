Feature: Create user

  Scenario: Successful user creation
    Given that the user navigates to the online store
    When they register a user account
    Then Then they should see a message related to "No has realizado ningún pedido aún"