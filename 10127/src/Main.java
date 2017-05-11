import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;


class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Scanner s = new Scanner(System.in);
		BigInteger b, n;
		int i;
		
		while(s.hasNext()){
			n = s.nextBigInteger();
			b = BigInteger.ONE;
			
			for(i = 1; ; i++ ){
				if(b.mod(n).equals(BigInteger.ZERO))
					break;
				
				b = b.multiply(new BigInteger("10"));
				b = b.add(new BigInteger("1"));
			}
			
			sb.append(i + "\n");
			
		}
		System.out.print(sb);

	}

}
