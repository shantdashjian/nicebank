package com.shaundashjian.nicebank;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.javalite.activejdbc.Base;

public class AtmServer {
	private final Server server;

	public AtmServer(int port, CashSlot cashSlot, Account account) {
		server = new Server(port);

		ServletContextHandler contextHandler = new ServletContextHandler(ServletContextHandler.SESSIONS);
		contextHandler.setContextPath("/");
		server.setHandler(contextHandler);

		contextHandler.addServlet(new ServletHolder(new WithdrawalServlet(cashSlot, account)), "/withdraw");
		contextHandler.addServlet(new ServletHolder(new CheckBalanceServlet(cashSlot, account)), "/checkbalance");
		contextHandler.addServlet(new ServletHolder(new AtmServlet()), "/");
	}

	public void start() throws Exception {
		server.start();
		System.out.println("Listening on " + server.getURI());
	}

	public void stop() throws Exception {
		server.stop();
		System.out.println("Server stopped!");
	}

	public static void main(String[] args) throws Exception {
		Base.open("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/bank", "teller", "password");
		new AtmServer(9988, new CashSlot(), new Account()).start();
	}
}
