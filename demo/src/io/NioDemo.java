package io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class NioDemo {

	public static void main(String[] args) throws IOException {
		Path  p = Path.of("c:\\classroom\\apr7\\hello.java");
		// Files.delete(p);
		
		String data = Files.readString(p);
		System.out.println(data);
	}

}
