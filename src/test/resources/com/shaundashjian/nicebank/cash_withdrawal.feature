Feature: Cash Withdrawal
	Scenario: Successful withdrawal from an account in credit
		Given my account has been credited with $100.0
		When I withdraw $20
		Then $20 should be dispensed
		And the balance of my account should be $80.00
		And the balance of my account should be $80.00
		
#	Scenario: Failed withdrawal from an account in credit
#		Given my account has been credited with $100.0
#		When I withdraw $120
#		Then $0 should be dispensed
#		And the balance of my account should be $100.00