package libdemo;

public class BoxingDemo {

	public static void main(String[] args) {
		int n = 10;
		
		Object obj =  n;  // Autoboxing, Upcasting
		
		int v = (Integer) obj;
		
		process(10);
		process(10.50);
		process("Abc");
	}
	
	public static void process(Object obj) {
		System.out.println(obj.getClass());
 
	}

}
