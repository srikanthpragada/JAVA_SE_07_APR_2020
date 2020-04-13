
public class OneToTwentyFive {

	public static void main(String[] args) {
		int a[][] = new int[5][5];
		int n = 1;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				a[i][j] = n;
				n++;
			}
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%5d", a[i][j]);
			}
			System.out.println();
		}

	}

}
