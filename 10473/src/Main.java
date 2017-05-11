import java.util.Scanner;


class Main {
public static void main(String arg[]) 
{
	String str;
	
	Scanner s = new Scanner(System.in);
	
	while(true)
	{
		str = s.next();
		
		//System.out.println(str.length());
		
		if(str.length() > 1 && str.charAt(1) == 'x')
		{
			String a = str.substring(2, str.length());
			
			int result = Integer.parseInt(a, 16);
			
			System.out.println(result);
		}
		
		else if(Integer.parseInt(str) < 0)
		{
			break;
		}
		
		else
		{
			String a = Integer.toHexString(Integer.parseInt(str)).toUpperCase();		
			
			System.out.println("0x" + a);
			
		}
	}
}
}
