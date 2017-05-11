import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main {

	public static void main(String arg[]) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		int n;
		
		String k;
		
		while(true)
		{
			n = Integer.parseInt(br.readLine());
			
			if( n == 0)
				break;
			
			k = Integer.toBinaryString(n);
			
			int num = 0;
			
			for(int i = 0; i < k.length(); i++)
				if(k.charAt(i) == '1')
					num++;
			
			sb.append("The parity of " + k + " is " + num + " (mod 2).").append("\n");
		}
		
		System.out.print(sb);
	}
	
}
