package network;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) throws Exception {
		// connect to server socket
		Socket s = new Socket("localhost", 2000);
		// take input
		Scanner scanner = new Scanner(s.getInputStream());
		System.out.println(scanner.nextLine());
		scanner.close();
		s.close();
	} // end of main
}
