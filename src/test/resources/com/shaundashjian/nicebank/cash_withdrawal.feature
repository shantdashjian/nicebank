Feature: Cash Withdrawal
	Scenario: Successful withdrawal from an account in credit
		Given I have deposited $100.00 in my account
		When I withdraw $20
		Then $20 should be dispensed
		
	Scenario: Failed withdrawal from an account in credit
		Given I have deposited $100.00 in my account
		When I withdraw $120
		Then $0 should be dispensed