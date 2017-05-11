import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		BigInteger a, b, c;
		int t;
		
			
		
		 t = Integer.parseInt(br.readLine());
		
		
		
		
		while(t-- > 0){
			String[] m = br.readLine().split(" ");
			
			a = new BigInteger(m[0]);
			b = new BigInteger(m[1]);
			c = new BigInteger(m[2]);
			
			sb.append(a.modPow(b, c)).append("\n");
		}
		
		System.out.print(sb);
	}
	}
	


