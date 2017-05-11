import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;


class Main {
public static void main(String args[]) throws IOException
{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	StringBuilder sb = new StringBuilder();
	
	Scanner s = new Scanner(System.in);
	
	int N, A;
	
	BigInteger b, t;
	
	String m = "";
	
	while((m = br.readLine()) != null)
	{
		String[] ar = m.split(" ");
		
		N = Integer.parseInt(ar[0]);
		A = Integer.parseInt(ar[1]);
		
		
		b = BigInteger.ZERO;
		t = BigInteger.valueOf(A);
		
		 for(int i = 1; i <= N; i++)
	        {
	            b = b.add(BigInteger.valueOf(i).multiply(t.pow(i)));
	        }
		 
		 sb.append(b).append("\n");
		
	}
	
	System.out.print(sb);
}
}
