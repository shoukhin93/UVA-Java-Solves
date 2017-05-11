import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		BigInteger a, b, c;
		BigInteger[] ara = new BigInteger[1020];
		
		a = BigInteger.ZERO;
		b = BigInteger.ONE;
		c = BigInteger.ONE;
		
		ara[0] = BigInteger.ZERO;
		for(int i = 1; i < 1010; i++){
			c = a.add(b);
			ara[i] = c;
			a = b;
			b = c;
		}
		
		String m;
		
		while((m = br.readLine())!= null){
			sb.append(ara[Integer.parseInt(m) + 1]).append("\n");
		}
		
		System.out.print(sb);
	}

}
