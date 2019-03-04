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


I selected these scenarios cause its functional tests and it can be runned on regression. It was taken 4h.
I used tools Cucumber, Selenium Webdriver, Java, TestNG and Maven to build project

