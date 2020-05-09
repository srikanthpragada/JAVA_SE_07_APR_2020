package io;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		 File f = new File("c:\\classroom\\apr8");
		 System.out.println(f.exists());
		 System.out.println(f.isDirectory());
		 
		 File f2 = new File("c:\\classroom\\apr7\\marks.dat");
		 f2.delete();
		 
	}

}
