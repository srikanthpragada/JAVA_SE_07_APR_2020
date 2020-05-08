package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class WriteMobileNumbers {

	public static void main(String[] args) throws Exception {

		// Try with resources or ARM
		try (FileReader fr = new FileReader("c:\\classroom\\apr7\\mobiles.txt");
			 FileWriter fw = new FileWriter("c:\\classroom\\apr7\\valid_mobile.txt")) {
			
			BufferedReader br = new BufferedReader(fr);
			while (true) {
				String line = br.readLine();
				if (line == null)
					break;

				String mobiles[] = line.split(",");
				for (String number : mobiles)
					if (number.length() == 10)
						fw.write(number + "\n");
			}
		}
	}
}
