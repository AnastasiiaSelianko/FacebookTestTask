Feature:  As an existing user I want to be able to add my current and past university.

  Background:
    Given Switch to Profile page as existing User.
    And About tab is opened.
    And Work and Education section is opened.
    And Add University section is opened.

  Scenario Outline: Check that user can add past university.
    When User set <university> to education field.
    When User set education <start date>.
    When User set education <finish date>.
    And User click on Save changes.
    Then University successfully added on user profile.

    Examples:
      | university | start date | finish date |
      | KPI        | 2014       | 2017        |


  Scenario Outline: Check that user can add past university.
    When User set <university> to education field.
    When User set education <start date>.
    When User set education <finish date>.
    And User click on Save changes.
    Then University successfully added on user profile.

    Examples:
      | university | start date | finish date |
      | KNU        | 2016       | 2020        |


