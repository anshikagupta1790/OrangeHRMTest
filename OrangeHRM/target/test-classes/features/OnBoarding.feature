Feature: Check Onboarding page

Scenario: Validate Task Types page under Onboarding tab

When Login with valid username and password

Given User is on Onboarding tab
When User click on Task Types tab under Onboarding tab in left navigation 
Then Tasks Types page is displayed with correct Name,Default owner details



When User clicks on Employee tasks tab under Onboarding tab in left navigation
Then Employee tasks Information page is displayed with correct Task, Owner details



Given User is on Reports tab under Onboarding tab in left navigation
When User clicks on Event Progress tab under Onboarding tab in left navigation
Then Event progress Report page is displayed 

When User Logout from the page