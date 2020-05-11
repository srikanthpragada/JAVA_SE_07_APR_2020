package network;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class UpperCaseServer {

	public static void main(String[] args) throws Exception {

		ServerSocket ss = new ServerSocket(5000, 10);
		System.out.println("UpperCaseServer is ready!");
		while (true) {
			Socket cs = ss.accept();
			Scanner s = new Scanner(cs.getInputStream());
			String name = s.nextLine(); // read line from client

			PrintWriter pw = new PrintWriter(cs.getOutputStream(), true);
			pw.println(name.toUpperCase());
		} // end of while
	}
}
