import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int len = 1010;
		BigInteger[] b = new BigInteger[len];
		int[] ara = new int[len];
		for (int i = 0; i < len; i++) {
		    // calculate factorial.
		    b[i] = BigInteger.valueOf(i + 1);
		    for (int j = i; j > 1; j--) {
		        b[i] = b[i].multiply(BigInteger.valueOf(j));
		    }
		    // now sum digits.
		    for (char ch : b[i].toString().toCharArray()) {
		        ara[i] += Character.getNumericValue(ch);
		    }
		}
		
		int n;
		while (sc.hasNext()) {
			n = sc.nextInt();
			sb.append(ara[n-1]).append("\n");
		}
		System.out.print(sb);

	}

}
