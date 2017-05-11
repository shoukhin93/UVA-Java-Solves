import java.math.BigInteger;
import java.util.Scanner;


class Main {

	public static void  main(String args[])
	{
		
		Scanner s = new Scanner(System.in);
		
		while(s.hasNext())
		{
			BigInteger result = new BigInteger("1");
			
			int n = Integer.parseInt(s.nextLine());
			int m = n;
			
			while(n > 0)
			{
				result = result.multiply(new BigInteger(n + ""));
				n--;
			}
			
			System.out.println(m + "!");			
			
			System.out.println(result);
		}
	}
	
}
