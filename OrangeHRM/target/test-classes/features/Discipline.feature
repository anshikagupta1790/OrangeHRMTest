Feature: Check Discipline page

Scenario: Validate Disciplinary Cases page under Discipline tab

When Login with valid username and password

Given User is on Discipline tab
When User click on Disciplinary Cases under Discipline tab in left navigation
Then Disciplinary Cases page  is displayed with correct Employee,Case Name,Description

When User clicks on My Actions tab under Discipline tab in left navigation
Then View My Actions page is displayed with correct Employee,Action,Description 

When User Logout from the page
