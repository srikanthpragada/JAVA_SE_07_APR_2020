package oop;

public class TestAccount {

	public static void main(String[] args) {

		System.out.println(Account.getMinbal());

		Account a; // object reference

		a = new Account(1001, "Scott");
		a.deposit(10000);
		System.out.println(a.getBalance());

		Account a2 = new Account(1002, "Mark", 10000);
		a2.withdraw(2000);
		a2.print();

		Account a3 = new Account();
	}
}
