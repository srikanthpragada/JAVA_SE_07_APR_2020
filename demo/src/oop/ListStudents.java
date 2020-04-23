package oop;

import java.util.Scanner;


public class ListStudents {

	public static void main(String[] args) {
		Student students [] = new Student[3];
		
		Scanner s = new Scanner (System.in);
		
		for(int i = 0;  i < students.length; i ++)
		{
			System.out.print("Enter name   : ");
			String name = s.nextLine();
			
			System.out.print("Enter course : ");
			int course = s.nextInt(); 
			
			System.out.print("Enter Feepaid: ");
			int feepaid = s.nextInt();
			
			// clear keyboard buffer
			s.nextLine(); 
			
			students[i] = new Student(name,course,feepaid);
		}
		
		for(Student stud : students)
			System.out.printf("%-20s %-20s %5d\n", 
					stud.getName(), stud.getCourseName(), stud.getDueAmount());
	}

}
