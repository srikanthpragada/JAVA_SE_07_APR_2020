package oop;

public class Account {
	// Instance variables
	private int acno;
	private String ahname;
	private double balance;

	// Methods
	public void open(int no, String name) {
		acno = no;
		ahname = name;
	}

	public void print() {
		System.out.println(acno);
		System.out.println(ahname);
		System.out.println(balance);
	}
}
