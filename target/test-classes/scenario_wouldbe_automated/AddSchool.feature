Feature:  As an existing user I want to be able to add my current and past school.

  Background:
    Given Switch to Profile page as existing User.
    And About tab is opened.
    And Work and Education section is opened.
    And Add School section is opened.

  Scenario Outline: Check that user can add past school.
    When User set <school> to education field.
    When User set education <start date>.
    When User set education <finish date>.
    And User click on Save changes.
    Then University successfully added on user profile.

    Examples:
      | school | start date | finish date |
      | School | 2014       | 2017        |

  Scenario Outline: Check that user can add current school.
    When User set <school> to education field.
    When User set education <start date>.
    When User set education <finish date>.
    And User click on Save changes.
    Then University successfully added on user profile.

    Examples:
      | school | start date | finish date |
      | School | 2017       | 2020        |



