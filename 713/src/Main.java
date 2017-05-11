import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

class Main {

	public static void main(String[] args) throws NumberFormatException,
			IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		BigInteger a, b, c;

		StringBuffer buffer;

		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {

			String[] m = br.readLine().split(" ");

			buffer = new StringBuffer(m[0]);

			a = new BigInteger(buffer.reverse().toString());

			buffer = new StringBuffer(m[1]);

			b = new BigInteger(buffer.reverse().toString());
			
			
			c = a.add(b);
			
			
			buffer = new StringBuffer(c.toString());
			
			c = new BigInteger(buffer.reverse().toString());
			
			sb.append(c + "\n");
			
		}
		
		System.out.print(sb);

	}

}
