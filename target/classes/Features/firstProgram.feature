
Feature: Application login
Scenario: Admin page default login 

Given User is on Netbanking landing page 
When User login into application with "admin" and password "adminpass"
Then home page is displayed 
And cards are displayed


Scenario: user page default login 

Given User is on Netbanking landing page 
When User login into application with "user" and password "userpass"
Then home page is displayed 
And cards are displayed

@SmokeTest
Scenario Outline: user page default login 

Given User is on Netbanking landing page 
When User login into application with "<username>" and password "<password>" 
Then home page is displayed 
And cards are displayed

Examples:
 |user name	|password |
 |admin |hello12|
  |user|hi12|
  
Scenario: user page default login1

Given User is on Netbanking landing page 
When User login into application 
|sham|
|Donthi|
|Mani|
|Isha| 
Then home page is displayed 
And cards are displayed





 
