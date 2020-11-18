Feature: Check Succession & Development page

Scenario: Validate Individual Development Plans page under Succession & Development tab

When Login with valid username and password

Given User is on Succession & Development tab
When User click on Individual Development Plans tab under Succession & Development tab in left navigation 
Then Individual Development Plans page is displayed with correct Employee, Idp name,coach details

When User clicks on My IDP tab under Succession & Development tab in left navigation
Then My Development Plan page is displayed with correct IDP name,Coach details

When User Logout from the page

