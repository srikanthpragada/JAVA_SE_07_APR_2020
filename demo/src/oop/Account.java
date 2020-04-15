package oop;

public class Account {
	// Instance variables
	private int acno;
	private String ahname;
	private double balance;

	// Overloading Constructor
	public Account() {
		
	}
	
	public Account(int no, String name) {
		acno = no;
		ahname = name;
	}
	public Account(int no, String name, double bal) {
		acno = no;
		ahname = name;
		balance = bal;
	}
	
    // Methods 
	public void print() {
		System.out.println(acno);
		System.out.println(ahname);
		System.out.println(balance);
	}
}
