package oop;

public class TestStudent {

	public static void main(String[] args) {
		Student s1 = new Student("Billy", 2, 4000);
		s1.payment(5000);
		System.out.println(s1.getDueAmount());

	}

}
