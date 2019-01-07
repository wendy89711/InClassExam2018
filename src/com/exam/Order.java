package com.exam;

import java.util.ArrayList;

public class Order {
	ArrayList ticket = new ArrayList();
/*	public Order() {
		Ticket ticket = new Ticket("Taipei", "Keelung", 37, 2);
		bag.add(ticket);
	}*/
	public void add(Ticket t) {
		ticket.add(t);
	}
	public void print(){
		System.out.println("Result :");
		for(int i = 0;i<ticket.size();i++) {
			Ticket t = (Ticket)ticket.get(i);
			System.out.println(t.get());
		}
	}
}
