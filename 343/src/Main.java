import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;


class Main {

	public static void main(String arg[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Scanner s = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder();
		
		String m = "";
		
		String  a, b;
		
		BigInteger t1, t2;
		
		boolean flag;
		
		while(s.hasNext())
		{
			
			
			a = s.next();
			b = s.next();
			
			flag = false;
			
			for(int i = 2; i <= 36; i++)
			{
				try
				{
				t1 = new BigInteger(a, i);
				}
				catch (Exception e) {
					continue;
				}
				
				for(int j = 2; j <= 36; j++)
				{
					try
				{
				t2 = new BigInteger(b, j);
				}
				catch (Exception e) {
					continue;
				}
					
					if(t1.equals(t2))
					{
						flag = true;
						sb.append(a + " (base " + i + ") = " + b 
										+ " (base " + j + ")").append("\n");
						
						break;
					}
				}
				
				if(flag == true)
					break;
			}
			
			if(flag == false)
			{
				sb.append(a + " is not equal to " + b 
						+ " in any base 2..36").append("\n");
			}
			
			
		}
		
		System.out.print(sb);
	}
}
