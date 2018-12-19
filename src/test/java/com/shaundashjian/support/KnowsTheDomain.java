package com.shaundashjian.support;

import com.shaundashjian.nicebank.Account;
import com.shaundashjian.nicebank.CashSlot;
import com.shaundashjian.nicebank.Teller;

public class KnowsTheDomain {

	private Account account;
	private Teller teller;
	private CashSlot cashSlot;
	
	public Account getAccount() {
		if (account == null) {
			account = new Account();
		}
		return account;
	}

	public Teller getTeller() {
		if (teller == null) {
			teller = new AtmUserInterface();
		}
		return teller;
	}

	public CashSlot getCashSlot() {
		if (cashSlot == null) {
			cashSlot = new CashSlot();
		}
		return cashSlot;
	}

}
