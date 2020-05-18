import java.nio.file.Files;
import java.nio.file.Path;

public class SortNameUsingStream {
	public static void main(String[] args) throws Exception {
		Path file = Path.of("c:\\classroom\\apr7\\names.txt");
		Files.lines(file)
		     .sorted()
		     .forEach( n -> System.out.println(n.toUpperCase()));
	}
}
