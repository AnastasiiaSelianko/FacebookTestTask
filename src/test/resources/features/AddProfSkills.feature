Feature:  As an existing user I want to be able to add my professional skills.

  Background:
    Given Switch to Profile page as existing User.
    And About tab is opened.
    And Work and Education section is opened.
    And Add a Professional Skill section is opened.

  Scenario Outline: Check that User can add professional skills.
    When User set <skill> to skills field.
    And User click on Save changes.
    Then Professional <skill> successfully added.
    But Delete <skill> after test.

    Examples:
      | skill                              |
      | Motivated                          |
