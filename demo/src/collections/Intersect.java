package collections;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashSet;
import java.util.List;

public class Intersect {

	public static void main(String[] args) throws Exception {
		
		Path p1 = Path.of("c:\\classroom\\apr7\\names.txt");
		Path p2 = Path.of("c:\\classroom\\apr7\\names2.txt");
		
		var common = new LinkedHashSet<String>();
				
		List<String> firstLines = Files.readAllLines(p1);
    	
		for(String line : Files.readAllLines(p2)) {
		    if (firstLines.contains(line))  // common line
		    	  common.add(line);
		}
		
		for(String name : common)
			System.out.println(name);

	}

}
