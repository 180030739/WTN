package com.wipro.ccbill.main;

import com.wipro.ccbill.service.ConnectionService;

public class EBMain {
	public static void main(String args[]) {
		ConnectionService cs=new ConnectionService();
		System.out.println(cs.generateBill(2150, 1130,"Commercial"));
		System.out.println(cs.generateBill(2520,10,"Commercial"));
		System.out.println(cs.generateBill(2530, 1130,"Domestic"));
		System.out.println(cs.generateBill(2500, 1350,"Domestic"));
		
	}

}
