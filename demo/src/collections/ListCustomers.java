package collections;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.TreeMap;

public class ListCustomers {

	public static void main(String[] args) throws Exception {
		 
		Path p = Path.of("c:\\classroom\\apr7\\customers.txt");
		TreeMap<String,String> customers = new TreeMap<>();
		
		for (String line : Files.readAllLines(p))
		{
			String parts[] = line.split(",");
			customers.put(parts[0], parts[1]);
		}
		
		for(String name : customers.keySet()) {
			System.out.printf("%-10s %s\n", name, customers.get(name));
		}
		
	}

}
