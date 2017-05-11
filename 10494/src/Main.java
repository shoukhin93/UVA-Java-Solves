import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;


class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		BigInteger a, b, c;
		
		String ch;
		
		while (sc.hasNext()) {
			
			//System.out.println(m[2]);
			
			a = sc.nextBigInteger();
			ch = sc.next();
			b = sc.nextBigInteger();
			
			if(ch.equals("/"))
				c = a.divide(b);
			else
				c = a.mod(b);
			
			sb.append(c).append("\n");
			
			//break;
		}
		
		System.out.print(sb);
	}

}
