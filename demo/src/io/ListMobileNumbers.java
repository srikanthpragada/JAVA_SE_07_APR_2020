package io;

import java.io.BufferedReader;
import java.io.FileReader;

public class ListMobileNumbers {

	public static void main(String[] args) throws Exception {

		FileReader fr = new FileReader("c:\\classroom\\apr7\\mobiles.txt");
		
		BufferedReader br = new BufferedReader(fr);

		while (true) {
			String line = br.readLine();
			if (line == null)
				break;

			String mobiles[] = line.split(",");
			for (String number : mobiles)
				if (number.length() == 10)
					System.out.println(number);
		}

	}

}
