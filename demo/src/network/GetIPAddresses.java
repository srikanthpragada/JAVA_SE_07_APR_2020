package network;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class GetIPAddresses {
	public static void main(String args[]) throws Exception {
		Scanner s = new Scanner(System.in);
		String domainname;

		while (true) {
			// read domain name
			System.out.println("Enter Domain Name [end to stop]:");
			domainname = s.nextLine();
			if (domainname.equals("end"))
				break;

			try {
				// get IP addresses related to the given domain
				InetAddress ips[] = InetAddress.getAllByName(domainname);

				// display ip addresses
				System.out.println("IP Address(es)");
				System.out.println("==============");

				for (InetAddress addr : ips)
					System.out.println(addr);
			} catch (UnknownHostException ex) {
				System.out.println("Sorry! Host Not Found");
			}
		} // end of while
		System.out.println("Thank you!");
	} // end of main
} // end of class
