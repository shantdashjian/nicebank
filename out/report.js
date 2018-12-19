$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com/shaundashjian/nicebank/cash_withdrawal.feature");
formatter.feature({
  "name": "Cash Withdrawal",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Successful withdrawal from an account in credit",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "my account has been credited with $100.00",
  "keyword": "Given "
});
formatter.step({
  "name": "I withdraw $\u003camount\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "$\u003camount\u003e should be dispensed",
  "keyword": "Then "
});
formatter.step({
  "name": "the balance of my account should be $\u003cbalance\u003e",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "amount",
        "balance"
      ]
    },
    {
      "cells": [
        "20",
        "80.00"
      ]
    },
    {
      "cells": [
        "40",
        "60.00"
      ]
    },
    {
      "cells": [
        "60",
        "40.00"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Successful withdrawal from an account in credit",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "my account has been credited with $100.00",
  "keyword": "Given "
});
formatter.match({
  "location": "AccountSteps.myAccountHasBeenCreditedWith$(Money)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I withdraw $20",
  "keyword": "When "
});
formatter.match({
  "location": "TellerSteps.iWithdraw$(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "$20 should be dispensed",
  "keyword": "Then "
});
formatter.match({
  "location": "CashSlotSteps.$ShouldBeDispensed(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the balance of my account should be $80.00",
  "keyword": "And "
});
formatter.match({
  "location": "AccountSteps.theBalanceOfMyAccountShouldBe$(Money)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Successful withdrawal from an account in credit",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "my account has been credited with $100.00",
  "keyword": "Given "
});
formatter.match({
  "location": "AccountSteps.myAccountHasBeenCreditedWith$(Money)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I withdraw $40",
  "keyword": "When "
});
formatter.match({
  "location": "TellerSteps.iWithdraw$(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "$40 should be dispensed",
  "keyword": "Then "
});
formatter.match({
  "location": "CashSlotSteps.$ShouldBeDispensed(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the balance of my account should be $60.00",
  "keyword": "And "
});
formatter.match({
  "location": "AccountSteps.theBalanceOfMyAccountShouldBe$(Money)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Successful withdrawal from an account in credit",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "my account has been credited with $100.00",
  "keyword": "Given "
});
formatter.match({
  "location": "AccountSteps.myAccountHasBeenCreditedWith$(Money)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I withdraw $60",
  "keyword": "When "
});
formatter.match({
  "location": "TellerSteps.iWithdraw$(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "$60 should be dispensed",
  "keyword": "Then "
});
formatter.match({
  "location": "CashSlotSteps.$ShouldBeDispensed(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the balance of my account should be $40.00",
  "keyword": "And "
});
formatter.match({
  "location": "AccountSteps.theBalanceOfMyAccountShouldBe$(Money)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded2.png");
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("com/shaundashjian/nicebank/display_balance.feature");
formatter.feature({
  "name": "Display balance",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User checks balance of an account in credit",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "my account has been credited with $100.00",
  "keyword": "Given "
});
formatter.match({
  "location": "AccountSteps.myAccountHasBeenCreditedWith$(Money)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I check my balance",
  "keyword": "When "
});
formatter.match({
  "location": "AccountSteps.iCheckMyBalance()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see that my balance is $100.00",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountSteps.iShouldSeeThatMyBalanceIs$(int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded3.png");
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("com/shaundashjian/nicebank/prevent_overdraw.feature");
formatter.feature({
  "name": "Prevent users from going overdrawn",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User tries to overdraw more than their balance",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "my account has been credited with $100.00",
  "keyword": "Given "
});
formatter.match({
  "location": "AccountSteps.myAccountHasBeenCreditedWith$(Money)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I withdraw $200",
  "keyword": "When "
});
formatter.match({
  "location": "TellerSteps.iWithdraw$(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "nothing should be dispensed",
  "keyword": "Then "
});
formatter.match({
  "location": "CashSlotSteps.nothingShouldBeDispensed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be told that I have insufficient funds in my account",
  "keyword": "And "
});
formatter.match({
  "location": "AccountSteps.iShouldBeToldThatIHaveInsufficientFundsInMyAccount()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded4.png");
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});