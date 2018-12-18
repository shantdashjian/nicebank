package com.shaundashjian.nicebank;

import static org.hamcrest.CoreMatchers.nullValue;

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
			teller = new Teller(getCashSlot());
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
