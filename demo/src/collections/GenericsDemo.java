package collections;

import java.time.LocalDate;
import java.util.ArrayList;

public class GenericsDemo {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("Abc");
		al.add("Xyz");
		// al.add(10); // Error

		String s1 = al.get(0);
		String s2 = al.get(1);

	}

}
