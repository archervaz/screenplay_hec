Feature: Check product availability

  Scenario: Successful product search
    Given that the user navigates to the online store
    When they search for the product "tenis"
    Then they should see results related to "Filtros"