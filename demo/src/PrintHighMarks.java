import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;

public class PrintHighMarks {

	public static void main(String[] args) throws Exception {
		Path file = Path.of("c:\\classroom\\apr7\\marks.txt");
		
		var avgmarks = 
			 Files.lines(file)
		     .mapToInt(Integer::parseInt)
		     .average()        // OptionalDouble 
		     .getAsDouble();
		
		System.out.println("Average : " +  avgmarks);
		
		Files.lines(file)
		   .mapToInt(Integer::parseInt)
		   .filter(n ->  n > avgmarks)
		   .sorted()
		   .limit(3)
		   .forEach(System.out::println);
	}
	
	
	public static int compareMarks(Integer n1, Integer n2) {
		return  n2 - n1;
	}

}
