import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int b;
		
		BigInteger p, m;
		
		while(true){
			String[] n = br.readLine().split(" ");
			
			b = Integer.parseInt(n[0]);
			
			if(b == 0)
				break;
			
			p = new BigInteger(n[1], b);
			m = new BigInteger(n[2], b);
			
			sb.append(p.mod(m).toString(b) + "\n");
		}
		
		System.out.print(sb);

	}

}
