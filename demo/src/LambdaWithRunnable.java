class Task implements Runnable {
	public void run() {
		System.out.println("New Thread!");
	}
}

public class LambdaWithRunnable {

	public static void printNumbers() {
		for (int i = 1; i <= 5; i++)
			System.out.println(i);
	}

	public static void main(String[] args) {

		Thread t = new Thread(new Task());
		t.start();

		// Lambda Expression
		Thread t2 = new Thread(() -> System.out.println("Another Thread!"));
		t2.start();

		// Lambda Block
		Thread t3 = new Thread(() -> {
			for (int i = 1; i <= 5; i++)
				System.out.println(i);
		});

		t3.start();

		// Method Reference
		Thread t4 = new Thread(LambdaWithRunnable::printNumbers);
		t4.start();
	}

}
