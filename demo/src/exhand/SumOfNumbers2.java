package exhand;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOfNumbers2 {

	public static void main(String[] args) {
		 
		Scanner s = new Scanner(System.in);
		int total = 0;
		
		while(true)
		{
			System.out.print("Enter a number [0 to stop] :");
			try {
			   int num = s.nextInt();
			   if(num == 0)
				   break;
			   total += num;
			}
			catch(InputMismatchException ex) {
				System.out.println("Sorry! Invalid Number!");
				s.nextLine(); // take line and ignore 
			}
		}
		
		System.out.printf("Total = %d\n", total);
	}

}
