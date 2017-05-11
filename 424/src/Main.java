import java.math.BigInteger;
import java.util.Scanner;


 class Main {

public static void main(String args[])	
{
	Scanner s = new Scanner(System.in);
	
	BigInteger n = new BigInteger("0");
	
	while(true)
	{
		BigInteger b = new BigInteger(s.nextLine());
		
		if(b.compareTo(BigInteger.ZERO) == 0)
		{
			break;
		}
		n = n.add(b);
	}
	
	System.out.println(n);
}
}
