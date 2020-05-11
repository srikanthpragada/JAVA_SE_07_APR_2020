package network;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class UpperCaseClient {
    public static void main(String[] args)   throws Exception {
    // connect to server socket
    Socket s = new Socket("localhost",5000);
    PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
    pw.println("Srikanth");
    Scanner scanner = new Scanner(s.getInputStream());
    System.out.println( scanner.nextLine());
  } // end of main
}




