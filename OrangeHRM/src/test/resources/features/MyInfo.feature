Feature: Check MyInfo page

Scenario: Validate user information on MyInfo page


When Login with valid username and password

Given User is on Dashboard page
When User clicks on MyInfo tab in left navigation

Given User is on MyInfo page
When User validate firstname,employee Id,Gender 
Then MyInfo validation is successful

When User Logout from the page


 