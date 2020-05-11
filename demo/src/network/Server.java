package network;

// A Simple Server Socket that sends current date and time to client
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;

public class Server {

	public static void main(String args[]) throws Exception {
		ServerSocket ss = new ServerSocket(2000);
		System.out.println("Server has started and is ready to accept client requests...");
		while (true) {
			// Wait for client 
			Socket cs = ss.accept();
			// convert output stream of client to PrintWriter with autoflush
			PrintWriter pw = new PrintWriter(cs.getOutputStream(), true);
			pw.println(LocalDateTime.now().toString()); // write date and time to client
		} // end of while

	}// end of main
} // end of class
