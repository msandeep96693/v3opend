Feature: Dashboard Functionality

Background:
Given user should navigate to the application
When user should enter url as "v3 "
And user should enter email address "admin@opend.com" and password "1234"
And user should click on login button
And user should verify the dashboard home page

Scenario: Validate the campaign Tab
And user should search by campaign name 
And user should select All status dropdown
And user should select campaign status dropdown
And user should select Date filter
And user should validate status name of campaign, open, click, sent data
Then user should successfully validated the campaign Tab
And user should click on admin person
And user should click on logout and close the browser

Scenario: validate the Advertiser Tab
And user should click on advertiser tab
And user should search by campaign
And user should select advertiser dropdown
And user should select All status dropdown
And user should select campaign status dropdown
And user should select Date filter
And user should validate status name of campaign, sent, open, click data
Then user should successfully validated the Advertiser tab
And user should click on admin person
And user should click on logout and close the browser

Scenario: validate the publisher Tab
And user should click on publisher tab
And user should search by publisher
And user should select publisher dropdown
And user should select Date dropdown
And user should validate Active, APIs, opens
Then user should successfully validated the publisher tab
And user should click on admin person
And user should click on logout and close the browser

Scenario: validation of Domain Tab
And user should click on Domain tab
And user should 



