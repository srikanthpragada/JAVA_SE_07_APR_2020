import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortNamesWithLambda {
	public static void main(String[] args) {
		var names = new ArrayList<String>();
		
		names.add("Stephen");
		names.add("James");
		names.add("Larry");
		names.add("Li");
		names.add("Joe");
		
		Collections.sort(names,  (s1,s2) -> s1.length() - s2.length());
		
		for(String name : names)
			System.out.println(name);
	}

}
