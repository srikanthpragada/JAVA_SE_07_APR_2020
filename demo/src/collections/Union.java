package collections;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.TreeSet;

public class Union {

	public static void main(String[] args) throws Exception {
		
		Path p1 = Path.of("c:\\classroom\\apr7\\names.txt");
		Path p2 = Path.of("c:\\classroom\\apr7\\names2.txt");
		
		var union = new TreeSet<String>();
				
		union.addAll( Files.readAllLines(p1));
		union.addAll( Files.readAllLines(p2));
		
		for(String name : union)
			System.out.println(name);

	}

}
