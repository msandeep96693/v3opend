Feature: Login functionality

Background:
Given user should navigate to the login page
And user click on login button

Scenario:  Login by valid credentials
When user enter the valid email address "admin@opend.com"
And user enter the valid password "1234"
Then user should able to login successfully and close the browser

Scenario: Login by invalid credentials
And user enter the invalid email address "admin@ppppend.com"
And user enter the invalid password "1111"
Then user should get response message as "Email Id is not registered with us" and close the browser

Scenario: Login by valid email and invalid password
And user enter the valid email address "admin@opend.com"
And user enter the invalid password "1111"
Then user should get response message as "invalid password" and close the browser

Scenario: Login by invalid email and valid password
And user enter the invalid email address "admin@ppppend.com"
And user enter the valid password "1234"
Then user should get response message as "Email Id is not registered with us" and close the browser

Scenario: Login by empty field
And user donot enter email address ""
And user donot enter password ""
Then user should get response message as "Please enter a email id and password" and close the browser 











