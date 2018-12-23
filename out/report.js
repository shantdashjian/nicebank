$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com/shaundashjian/nicebank/cash_withdrawal.feature");
formatter.feature({
  "name": "Cash Withdrawal",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@dev"
    }
  ]
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
    }
  ]
});
formatter.scenario({
  "name": "Successful withdrawal from an account in credit",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@dev"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
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
formatter.after({
  "status": "passed"
});
});