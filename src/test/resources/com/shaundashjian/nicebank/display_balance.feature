Feature: Display balance
	
	Scenario: User checks balance of an account in credit
		Given my account has been credited with $100.00
		When I check my balance
		Then I should see that my balance is $100.00