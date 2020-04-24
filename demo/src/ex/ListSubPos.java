package ex;

import java.util.Arrays;

public class ListSubPos {

	public static void main(String[] args) {
		 String input = "Rajaitha,Akhil,Prasad,Ratna,Surya,Harshini";
		 
		 String names[] = input.split(",");
		 
		 Arrays.sort(names);
		 
		 for(String name : names)
			 System.out.println(name);
	}

}
