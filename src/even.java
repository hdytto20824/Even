public class even {
	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			int j = i % 2;
			if (j == 0)
				System.out.printf(i + ",");
		}
	}
}