package collections;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

public class SortNames {

	public static void main(String[] args) throws Exception {
		 
		Path file = Path.of("c:\\classroom\\apr7\\names.txt");
		List<String> names = Files.readAllLines(file);
		
		Collections.sort(names);
		
		for(String name : names)
			System.out.println(name);
		
		
	}

}
