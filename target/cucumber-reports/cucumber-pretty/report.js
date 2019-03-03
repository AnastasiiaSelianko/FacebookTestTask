$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AddProfSkills.feature");
formatter.feature({
  "line": 1,
  "name": "As an existing user I want to be able to add my professional skills.",
  "description": "",
  "id": "as-an-existing-user-i-want-to-be-able-to-add-my-professional-skills.",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 9,
  "name": "Check that User can add professional skills.",
  "description": "",
  "id": "as-an-existing-user-i-want-to-be-able-to-add-my-professional-skills.;check-that-user-can-add-professional-skills.",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 10,
  "name": "User set \u003cskill\u003e to skills field.",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User click on Save changes.",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Professional \u003cskill\u003e successfully added.",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Delete \u003cskill\u003e after test.",
  "keyword": "But "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "as-an-existing-user-i-want-to-be-able-to-add-my-professional-skills.;check-that-user-can-add-professional-skills.;",
  "rows": [
    {
      "cells": [
        "skill"
      ],
      "line": 16,
      "id": "as-an-existing-user-i-want-to-be-able-to-add-my-professional-skills.;check-that-user-can-add-professional-skills.;;1"
    },
    {
      "cells": [
        "Motivated"
      ],
      "line": 17,
      "id": "as-an-existing-user-i-want-to-be-able-to-add-my-professional-skills.;check-that-user-can-add-professional-skills.;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 53695839574,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Switch to Profile page as existing User.",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "About tab is opened.",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "Work and Education section is opened.",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Add a Professional Skill section is opened.",
  "keyword": "And "
});
formatter.match({
  "location": "ProfileSteps.switchToProfile()"
});
formatter.result({
  "duration": 3453267627,
  "status": "passed"
});
formatter.match({
  "location": "ProfileSteps.aboutTabIsOpened()"
});
formatter.result({
  "duration": 2488016213,
  "status": "passed"
});
formatter.match({
  "location": "ProfileSteps.workAndEducationSectionIsOpened()"
});
formatter.result({
  "duration": 3165249707,
  "status": "passed"
});
formatter.match({
  "location": "ProfileSteps.addAProfessionalSkillSectionIsOpened()"
});
formatter.result({
  "duration": 1457860694,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Check that User can add professional skills.",
  "description": "",
  "id": "as-an-existing-user-i-want-to-be-able-to-add-my-professional-skills.;check-that-user-can-add-professional-skills.;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 10,
  "name": "User set Motivated to skills field.",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User click on Save changes.",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Professional Motivated successfully added.",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Delete Motivated after test.",
  "matchedColumns": [
    0
  ],
  "keyword": "But "
});
formatter.match({
  "arguments": [
    {
      "val": "Motivated",
      "offset": 9
    }
  ],
  "location": "ProfileSteps.userSetSkillToSkillsField(String)"
});
formatter.result({
  "duration": 3320657067,
  "status": "passed"
});
formatter.match({
  "location": "ProfileSteps.userClickOnSaveChanges()"
});
formatter.result({
  "duration": 151867307,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Motivated",
      "offset": 13
    }
  ],
  "location": "ProfileSteps.professionalSkillsSuccessfullyAdded(String)"
});
formatter.result({
  "duration": 59831893,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Motivated",
      "offset": 7
    }
  ],
  "location": "ProfileSteps.deleteChangesAfterTest(String)"
});
formatter.result({
  "duration": 2362726826,
  "status": "passed"
});
formatter.after({
  "duration": 4947178666,
  "status": "passed"
});
});