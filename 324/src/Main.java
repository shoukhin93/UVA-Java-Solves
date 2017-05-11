import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


class Main {

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		BigInteger b;
		
		int n;
		
		
		while(true){
			n = Integer.parseInt(br.readLine());
			
			if(n == 0)
				break;
			
			b = BigInteger.ONE;
			int[] ara = new int[11];
			
			for(int i = 2; i <= n; i++){
				b = b.multiply(BigInteger.valueOf(i));
			}
			
			String s= b.toString();
			int l = s.length();
			
			for(int i = 0; i < l; i++){
				int t = Character.getNumericValue(s.charAt(i));
				ara[t]++;
			}
			
			sb.append(n + "! --\n");
			
			sb.append("   (0)    "+ ara[0] +"    (1)    "+ ara[1] +"    (2)    "
									+ ara[2] +"    (3)    "+ ara[3] +"    (4)    "+ ara[4]+"\n");
			
			sb.append("   (5)    "+ ara[5] +"    (6)    "+ ara[6] +"    (7)    "
					+ ara[7] +"    (8)    "+ ara[8] +"    (9)    "+ ara[9]+ "\n");
			
		}
		
		System.out.print(sb);

	}

}
