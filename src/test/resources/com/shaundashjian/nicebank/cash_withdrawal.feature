@dev
Feature: Cash Withdrawal
	Scenario Outline: Successful withdrawal from an account in credit
		Given my account has been credited with $100.00
		When I withdraw $<amount>
		Then $<amount> should be dispensed
		And the balance of my account should be $<balance>

	Examples:
		| amount	| balance	|
		| 20			| 80.00		|		
#		| 40			| 60.00		|
#		| 60			| 40.00		|