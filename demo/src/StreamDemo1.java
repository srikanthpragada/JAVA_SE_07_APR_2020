import java.util.Arrays;

public class StreamDemo1 {

	public static void main(String[] args) {
      String names[] = {"Java","Python","C","TypeScript","C#","JavaScript"};
      
      Arrays.stream(names)
         .filter(n -> n.length() > 3)   // boolean test(T v)
         .sorted()
         .forEach(n -> System.out.println(n)); // void accept(T v)

	}

}
