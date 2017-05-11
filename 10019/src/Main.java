import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

class Main {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		int b1, b2;
		BigInteger b;
		String c;
		int n = sc.nextInt();

		while (n-- > 0) {
			b = sc.nextBigInteger();
			c = b.toString(2);

			b1 = 0;
			b2 = 0;
			for (int i = 0; i < c.length(); i++) {
				if (c.charAt(i) == '1')
					b1++;
			}
			
			c = b.toString();
			b = BigInteger.valueOf(Integer.parseInt(c, 16));
			c = b.toString(2);

			for (int i = 0; i < c.length(); i++) {
				if (c.charAt(i) == '1')
					b2++;
			}

			sb.append(b1 + " " + b2 + "\n");
		}
		System.out.print(sb);

	}

}
