import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;


class Main {


	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		
		BigInteger a, b;
		
		while(sc.hasNext()){
			a = sc.nextBigInteger();
			b = BigInteger.ONE;
			b = b.multiply(a);
			sb.append(b + "\n");
			//System.out.println(b);
		}
		
		System.out.print(sb);
		
	}

}
