
public class VarryingArgsDemo {

	public static int add(int ... nums)
	{
		int total = 0;
		for(int n : nums)
			total += n;
		
		return total;
	}
	
	public static void main(String[] args) {
        System.out.println(add(10,20));		 
        System.out.println(add(10,20,30));
 
	}

}
