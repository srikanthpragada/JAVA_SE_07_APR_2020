package network;
//  Server to handle multiple clients
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MultiThreadedBookServer {

	public static void main(String args[]) throws Exception {

		try (ServerSocket ssocket = new ServerSocket(3000, 10)) {
			System.out.println("Book server started and ready!");
			while (true) {
				Socket client = ssocket.accept();
				System.out.println("Accepted Client Request...");
				HandleClient thread = new HandleClient(client);
				thread.start();
			}
		}
	}
} // end of class

class HandleClient extends Thread {
	Socket client;

	public HandleClient(Socket s) {
		this.client = s;
	}

	public void run() {
		String books[] = { "Java Complete Reference", "Core Java Vol I & II", "Thinking in Java" };
		try {
			// read string from client
			Scanner cin = new Scanner(client.getInputStream());
			PrintWriter pw = new PrintWriter(client.getOutputStream(), true);
			int bookno;
			String title;

			while (true) {
				bookno = cin.nextInt();  // Read number from client 
				if (bookno == 0)
					break;
				if (bookno - 1 < books.length)
					title = books[bookno - 1];
				else
					title = ""; // book not found

				// send title back to client
				pw.println(title);
			} // end of while
			System.out.println("Client Connection Closed");
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	} // end of run
} // end of class
