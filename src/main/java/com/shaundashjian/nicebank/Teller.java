package com.shaundashjian.nicebank;

public interface Teller {

	public void withdrawFrom(Account account, int dollars);

	public void checkBalance(Account account);

}
