import java.math.BigInteger;
import java.util.Scanner;


class Main {

	public static void main(String arg[])
	{
		int t;
		
		Scanner s = new Scanner(System.in);
		
		t = s.nextInt();
		
		int x, y, z = 0;
		
		String f = new String("");
		String g = new String("");
		
		for(int i = 0; i < t; i++)
		{
			String a = s.next();
			String ch = s.next();
			String b = s.next();
			
			 x = Integer.parseInt(a, 16);
			 y = Integer.parseInt(b, 16);
			 
			 f = Integer.toBinaryString(x);
			 g = Integer.toBinaryString(y);
			 
			 for(int j = 0; j < 13 - f.length(); j++)
				 System.out.print("0");
			 
			 System.out.print(f);
			 
			 System.out.print(" " + ch + " ");
			 
			 for(int j = 0; j < 13 - g.length(); j++)
				 System.out.print("0");
			 
			 System.out.print(g);
			 
			 System.out.print(" = ");
			 
			 if(ch.charAt(0) == '+')
				 z = x + y;
				 
			 
			 else if(ch.charAt(0) == '-')
				 z = x - y;
			 
			 System.out.println(z + "" );
		}
	}
	
}
