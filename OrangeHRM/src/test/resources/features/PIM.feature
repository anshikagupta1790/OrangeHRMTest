Feature: Check PIM tab

Scenario: Validate User Employee list tab page under PIM tab

When Login with valid username and password

Given User is on PIM tab
When User click on Employee list tab under PIM tab in left navigation 
Then Employee list page is displayed with employee name search text box and correct Employee id,name details

Given User is on Add Employee tab
When User clicks on Add Employee tab under PIM tab in left navigation
Then Add Employee window is displayed 

When User Logout from the page


