package ex;

public class SortNames {

	public static void main(String[] args) {
		String ms = "How do you do now?. How did you do before";
		String ss = "ow";
		int sl = ss.length();
		int pos = 0;

		while (true) {
			pos = ms.indexOf(ss, pos);
			if (pos == -1)
				break;
			System.out.println(pos);
			pos += sl; // increment by size of substring
		}
	}

}
