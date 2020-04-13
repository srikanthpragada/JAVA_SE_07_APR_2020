// Print factors of the given number

public class PrintFactors {

	public static void main(String[] args) {
		
		if(args.length == 0)
		{
			System.out.println("Usage : java PrintFactors number");
			return; // stop main()
		}
		
		int num = Integer.parseInt(args[0]);  // String to int 

		for (int i = 2; i <= num / 2; i++)
			if (num % i == 0)
				System.out.println(i);
	}
}
