import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;


class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder();
		BigInteger a;
		
		while(sc.hasNext()){
			a = sc.nextBigInteger();
			
			if(a.equals(BigInteger.ZERO))
				break;
			
			if(a.mod(BigInteger.valueOf(17)).equals(BigInteger.ZERO)){
				sb.append("1").append("\n");
			}
			
			else 
				sb.append("0").append("\n");
				
		}
		
		System.out.print(sb);
	}

}
