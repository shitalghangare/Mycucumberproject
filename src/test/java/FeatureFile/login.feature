Feature: Application Login




Scenario Outline: Salesforce Home page login
Given Initialize the chrome driver
When user navigates to "https://login.salesforce.com/ "
And user enter <username>and <password>clicks on login button
Then user should be able to login

Examples:
|username|password|
|test12|secure123|
|test23|secure456|