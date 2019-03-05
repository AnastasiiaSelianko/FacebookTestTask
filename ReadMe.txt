# FacebookTestTask

+---.idea
+---main
|   +---java
|   +---resources
\---test
|   +---java
|   |   +---stepdefs
|   |   |---TestRunner.java
|   \---resources
|   |   \---scenario_wouldbe_automed <-- Here scenarios without implementations
|       \---features
|           |---AddProfSkills.feature
|---pom.xml
|---testng.xml

1) In config.properties set login and password to login Facebook. Notice test fb user shouln't have any Professional Skill 
2) You can run test on Chrome & Edge, so please in config.properties set path to drivers

+---.idea
+---main
|   +---java
|   \---resources
|   |   |---config.properties


UI tests are not stable(always) and take a lot of time, so I think that it is necessary to automate those tests that will be used on the regression testing and the scenarios should be positive

Tools that was used:
Cucumber - convenient BDD Framework 
Selenium Web Driver - in order to manage work the browser
TestNG - for annotations and runner
Maven -  to build project 
Checkstyle Maven plugin - for code review 
Cucumber reports - to create reports 

As for me if it big project i would be use also Spring and Allure 
