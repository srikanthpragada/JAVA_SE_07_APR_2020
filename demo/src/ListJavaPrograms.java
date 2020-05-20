import java.nio.file.Files;
import java.nio.file.Path;

public class ListJavaPrograms {
	public static void main(String[] args) throws Exception {
		Path dir = Path.of("c:\\classroom\\apr7");
		
		Files.walk(dir)
		     .filter(p -> p.toString().endsWith(".java"))
		     .forEach( ListJavaPrograms::showFile);
	}
	
	
	public static void showFile(Path path) {
		try {
			System.out.printf("\nFilename : %s\n",path.toString());
			Files.lines(path)
			     .forEach(System.out::println);
		}
		catch(Exception ex) {
			
		}
		
	}
}
