package com.shaundashjian.nicebank;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AtmServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request,
						HttpServletResponse response) 
						throws ServletException, IOException {
		response.setContentType("text/html");
		response.setStatus(HttpServletResponse.SC_OK);
		response.getWriter().println(
				"<html><head><title>Nice Bank ATM</title></head>"
				+ "<body><h1>Welcome to our nice bank!</h1>"
				+ "<form action=\"/withdraw\" method=\"post\">"
				+ "<input type=\"hidden\" id=\"amount\" name=\"amount\" value=\"20\">"
				+ "<button type=\"submit\" id=\"withdraw20\">$20</button>"
				+ "</form>"
				+ "<form action=\"/withdraw\" method=\"post\">"
				+ "<input type=\"hidden\" id=\"amount\" name=\"amount\" value=\"40\">"
				+ "<button type=\"submit\" id=\"withdraw40\">$40</button>"
				+ "</form>"
				+ "</form>"
				+ "<form action=\"/withdraw\" method=\"post\">"
				+ "<input type=\"hidden\" id=\"amount\" name=\"amount\" value=\"60\">"
				+ "<button type=\"submit\" id=\"withdraw60\">$60</button>"
				+ "</form>"
				+ "<form action=\"/withdraw\" method=\"post\">"
				+ "<input type=\"hidden\" id=\"amount\" name=\"amount\" value=\"200\">"
				+ "<button type=\"submit\" id=\"withdraw200\">$200</button>"
				+ "</form>"
				+ "<form action=\"/checkbalance\" method=\"get\">"
				+ "<button type=\"submit\" id=\"checkBalance\">Check Balance</button>"
				+ "</form>"
				+ "</body></html>");
//		response.getWriter().println(
//				"<html><head><title>Nice Bank ATM</title></head>"
//						+ "<body><h1>Welcome to our nice bank!</h1>"
//						+ "<form action=\"/withdraw\" method=\"post\">"
//						+ "<label for=\"amount\">Amount</label>"
//						+ "<input id=\"amount\" name=\"amount\">"
//						+ "<button type=\"submit\" id=\"withdraw\">Withdraw</button>"
//						+ "</form>"
//						+ "</body></html>");
	}
	
}