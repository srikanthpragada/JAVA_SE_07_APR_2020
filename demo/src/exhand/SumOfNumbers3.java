package exhand;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOfNumbers3 {

	public static void main(String[] args) {
		 
		Scanner s = new Scanner(System.in);
		int total = 0;
		
		while(true)
		{
			System.out.print("Enter a number [0 to stop] :");
			try {
			   String st = s.nextLine();
			   int num = Integer.parseInt(st);
			   if(num == 0)
				   break;
			   total += num;
			}
			catch(NumberFormatException ex) {
				System.out.println("Sorry! Invalid Number!");
			}
		}
		
		System.out.printf("Total = %d\n", total);
	}

}
