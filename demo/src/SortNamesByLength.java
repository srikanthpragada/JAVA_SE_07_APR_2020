import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class LengthCompare implements Comparator<String> {
	@Override
	public int compare(String s1, String s2) {
		return  s1.length() - s2.length();
	}
}

public class SortNamesByLength {
	public static void main(String[] args) {
		var names = new ArrayList<String>();
		
		names.add("Stephen");
		names.add("James");
		names.add("Larry");
		names.add("Li");
		names.add("Joe");
		
		Collections.sort(names, new LengthCompare());
		
		for(String name : names)
			System.out.println(name);
		

	}

}
