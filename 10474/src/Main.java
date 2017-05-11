import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

import javax.naming.BinaryRefAddr;
import javax.naming.directory.SearchControls;


class Main {

	public static void main(String args[]) throws IOException
	{
		StringBuilder sb = new StringBuilder();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int k = 1;

		while(true)
		{
			String[] a = br.readLine().split(" ");
			
			int n = Integer.parseInt(a[0]);
			int q = Integer.parseInt(a[1]);
			
			if ( n == 0 && q == 0)
				break;
			
			int [] ara = new int[n];
			
			for(int i = 0; i < n; i++)
			{
				ara[i] = Integer.parseInt(br.readLine());
			}
			
			sb.append("CASE# " + k + ":").append("\n");
			k++;
			
			Arrays.sort(ara);
			
			int index = 0, num;
			
			for(int i = 0; i < q; i++)
			{
				num = Integer.parseInt(br.readLine());
				
				index = Arrays.binarySearch(ara, num);
				
				System.out.println(index);
				
				if(index >= 0)
				{
					sb.append( num + " found at " + (index)).append("\n");
				}
				
				else
					sb.append( num + " not found").append("\n");
			}
		}
		
		//System.out.print(sb);
		
	}
}
