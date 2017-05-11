import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


class Main {

	public static void main(String arg[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		String m = "";
		
		BigInteger t1;
		
		while((m = br.readLine())!= null)
		{
			String[] str = m.split(" ");
			
			
			
			try
			{
				
				t1 = new BigInteger(str[2], Integer.parseInt(str[0]));
				
				String ans = t1.toString(Integer.parseInt(str[1])).toUpperCase();
				sb.append(str[2] + " base " + str[0] +" = " + ans +" base " + str[1]).append("\n");
				
			}
			
			catch (Exception e) {
				sb.append(str[2] + " is an illegal base " + str[0] +" number").append("\n");
				
			}
			
			
			
			
		}
		
		System.out.print(sb);
	}
}
