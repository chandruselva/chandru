Feature: Elearning login page

  Background: Background selection
    Given User is on homepage

  Scenario Outline: Login with unauthorized user
    When user enter invalid Username "<username>" and password "<password>"
    When user click on Submit button
    When user navigate ot orders
    When click add icon button
    When User enter valid Message

    Examples: 
      | username | password  |
      | admin    | Admin@123 |