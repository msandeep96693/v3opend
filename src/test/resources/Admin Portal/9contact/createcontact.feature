				
Feature: Contact Module				
				
Scenario:	Create a contact			
Given The admin launches the Chrome browser				
And The admin enters the URL as ""				
And The admin enters valid email as "admin@opend.com" and password as "1234"				
When Clicks the login button				
Then The admin should be redirected to the dashboard page				
When click contact on Left navigation bar				
And click on New contact button				
Then verify the create contact page				
And select publisher from dropdown				
And Enter contact list name into textfield				
And select Audience type from audience type dropdown				
And Enter CPM payout price into textfield				
And Enter Usage limit per day into textfield				
And select permitter sector from permitter sector dropdown				
And upload a CSV file into a field				
And Enter Default from name into textfield				
And click on add button				
Then The admin should be redirected to the contact homepage				
Then verify the created contact should be present				
				
				