package oop;

public class TestAccount {

	public static void main(String[] args) {
		Account a; // object reference

		a = new Account(1001, "Scott");
		a.print();
		
		Account a2 = new Account(1002,"Mark",10000);
		a2.print();
		
		Account a3 = new Account();
	}
}
