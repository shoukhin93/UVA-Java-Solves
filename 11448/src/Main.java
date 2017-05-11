import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		BigInteger a, b, c;
		
		int t = Integer.parseInt(br.readLine());
		
		while(t-- > 0){
			String[] m = br.readLine().split(" ");
			
			a = new BigInteger(m[0]);
			b = new BigInteger(m[1]);
			
			sb.append(a.subtract(b)).append("\n");
		}
		
		System.out.print(sb);
	}

}
