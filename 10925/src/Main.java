import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

class Main {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n, f;

		BigInteger sum, t;

		int c = 1;

		while (true) {
			String[] m = br.readLine().split(" ");
			n = Integer.parseInt(m[0]);
			f = Integer.parseInt(m[1]);;

			if (n == 0 && f == 0)
				break;

			sum = BigInteger.ZERO;

			for (int i = 0; i < n; i++) {
				t = new BigInteger(br.readLine());

				sum = sum.add(t);
			}

			sb.append("Bill #" + (c++) + " costs " + sum
					+ ": each friend should pay "
					+ sum.divide(BigInteger.valueOf(f)) + "\n\n");

		}
		
		System.out.print(sb);

	}

}
