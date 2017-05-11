import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		BigInteger a, b, c;
		String n;
		
		while((n = br.readLine()) != null){
			String[] m = n.split(" ");
			
			
			
			a = new BigInteger(m[0]);
			b = new BigInteger(m[2]);
			if(m[1].equals("+")){
				c = a.add(b);
			}
			
			else
				c = a.multiply(b);
			
			sb.append(m[0] + " " + m[1] + " " + m[2] + "\n");
			
			if(a.compareTo(BigInteger.valueOf((long) Math.pow(2, 31) - 1) ) == 1){
				sb.append("first number too big\n");
			}
			
			if(b.compareTo(BigInteger.valueOf((long) Math.pow(2, 31) - 1) ) == 1){
				sb.append("second number too big\n");
			}
			
			if(c.compareTo(BigInteger.valueOf((long) Math.pow(2, 31) - 1) ) == 1){
				sb.append("result too big\n");
			}
			
			
		}
		
		System.out.print(sb);
	}

}
