Feature: Signup
User tries to sign up with existing credentials
Scenario: Unsuccessful signup to github
Given User is in the home page of github
But User enters an already existing account
And clicks on signup button
Then  User should be given a message that login is already taken