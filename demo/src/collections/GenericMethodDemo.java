package collections;

import java.time.LocalDate;

public class GenericMethodDemo {

	public static void print(String a[]) {
		for (String s : a)
			System.out.println(s);
	}

	public static void print(Integer a[]) {
		for (Integer s : a)
			System.out.println(s);
	}
	
	public static void print(LocalDate a[]) {
		for (LocalDate s : a)
			System.out.println(s);
	}

	public static <T> void printGeneric(T a[]) {
		for(T v : a) {
			System.out.println(v);
		}
	}
	
	public static void main(String[] args) {
        String [] names = {"Java","Python","Ruby","C#"};
        printGeneric(names);
        
        LocalDate [] dates = { LocalDate.now(), LocalDate.now()};
        printGeneric(dates);
	}

}
