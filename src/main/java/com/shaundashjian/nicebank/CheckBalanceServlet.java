package com.shaundashjian.nicebank;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CheckBalanceServlet extends HttpServlet {
	
	private CashSlot cashSlot;
	private Account account;
	
	public CheckBalanceServlet(CashSlot cashSlot, Account account) {
		this.cashSlot = cashSlot;
		this.account = account;
	}

	protected void doGet(HttpServletRequest request,
						HttpServletResponse response)
						throws ServletException, IOException {
		Teller teller = new AutomatedTeller(cashSlot);
		teller.checkBalance(account);
		
		response.setContentType("text/html");
		response.setStatus(HttpServletResponse.SC_OK);
		response.getWriter().println("<html><head><title>Nice Bank ATM</title></head>"
				+ "<body>" + account.getDisplay() + "</body></html>");
			
	}
}