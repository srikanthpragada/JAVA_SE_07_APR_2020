package oop;

public class Account {
	// Instance variables
	private int acno;
	private String ahname;
	private double balance;

	// static variables or class variables
	private static int minbal = 5000;
	
	public static int getMinbal() {
		return Account.minbal;
	}

	// Overloading Constructor
	public Account() {

	}

	public Account(int no, String name) {
		acno = no;
		ahname = name;
	}

	public Account(int acno, String ahname, double balance) {
		this.acno = acno;
		this.ahname = ahname;
		this.balance = balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		if (this.balance - Account.minbal >= amount)
			this.balance -= amount;
		else
			System.out.println("Sorry! Insufficient Balance!");
	}

	public double getBalance() {
		return balance;
	}

	// Methods
	public void print() {
		System.out.println(acno);
		System.out.println(ahname);
		System.out.println(balance);
	}
}
