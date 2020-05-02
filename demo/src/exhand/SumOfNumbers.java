package exhand;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		 
		Scanner s = new Scanner(System.in);
		int total = 0;
		
		while(true)
		{
			System.out.print("Enter a number [0 to stop] :");
			int num = s.nextInt();
			if(num == 0)
				break;
			total += num;
		}
		
		System.out.printf("Total = %d\n", total);
	}

}
