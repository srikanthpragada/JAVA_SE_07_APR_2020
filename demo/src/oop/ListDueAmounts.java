package oop;

import java.util.Scanner;

public class ListDueAmounts {

	public static void main(String[] args) {
		Student students [] = { 
				new Student("Larry Ellison",1,2000),
				new Student("Larry Page",2,2000),
				new Student("Mark Zuker",1,1000),
				new Student("Elon Musk",2,7000),
				new Student("James Gosling",1,3000),
		};
		
		for(Student stud : students)
			System.out.printf("%-20s %-20s %5d\n", 
					stud.getName(), stud.getCourseName(), stud.getDueAmount());
	}

}
