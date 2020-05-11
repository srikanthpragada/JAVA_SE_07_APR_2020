package network;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class Download {

	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		String url, trg;
		System.out.println("Enter URL :");
		url = s.nextLine();
		System.out.println("Enter target file :");
		trg = s.nextLine();
		int ch;
		InputStream is = new URL(url).openStream();
		FileOutputStream os = new FileOutputStream(trg);
		ch = is.read();
		while (ch != -1) {
			os.write(ch);
			ch = is.read();
		}
		is.close();
		os.close();
		System.out.println("Download is complete!");
	}

}
