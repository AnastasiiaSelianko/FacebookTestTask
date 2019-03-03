Feature:  As an existing user I want to be able to add my current and past workplace.

  Background:
    Given Switch to Profile page as existing User.
    And About tab is opened.
    And Work and Education section is opened.
    And Add Workplace section is opened.


  Scenario Outline: Check that User can add past workplace

    When User set <employer> field.
    When User set job <start date>.
    When User set job <finish date>.
    And User click on Save changes.
    Then Workplace successfully added on user profile.

    Examples:
    | employer | start date | finish date |
    | employer | start date | finish date |

  Scenario Outline: Check that User can add current workplace

    When User set <employer> field.
    When User set job <start date>.
    When User set job <finish date>.
    And User click on Save changes.
    Then Workplace successfully added on user profile.

    Examples:
      | employer | start date | finish date |
      | employer | start date | finish date |






