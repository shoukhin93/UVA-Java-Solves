import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int bx = scanner.nextInt();
		BigInteger b1 = BigInteger.ZERO;

		for (int i = 1; i <= n; i++) {
			int t = scanner.nextInt();
			String s = String.valueOf((long) (t * (Math.pow(bx, n - i))));
			BigInteger temp = new BigInteger(s);
			b1 = b1.add(temp);

		}

		int n1 = scanner.nextInt();
		int by = scanner.nextInt();

		BigInteger b2 = BigInteger.ZERO;

		for (int i = 1; i <= n1; i++) {
			int t = scanner.nextInt();

			b2 = b2.add(new BigInteger(String.valueOf((long) (t * (Math.pow(by,
					n1 - i))))));
		}

		if (b1.compareTo(b2) == 0)
			System.out.println("=");
		else if (b1.compareTo(b2) == 1)
			System.out.println(">");
		else
			System.out.println("<");

	}

}
