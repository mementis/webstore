Feature: Create an Account 



Scenario: Successful Account Creation with Valid Credentials 
	Given User lands on authentication page 
	When User submits valid e-mail into e-mail address box 
	Then User fills form with valid credentials 
	And  User is redirected to user's account