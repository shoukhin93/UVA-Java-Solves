import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main {

	public static void main(String args[]) throws NumberFormatException, IOException
	{
		System.out.println(Integer.toString(01000001, 10));
		
		StringBuilder sb = new StringBuilder();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		String a, b, c, d;
		
		for(int i = 1; i <= t; i++)
		{
			a = br.readLine();
			b = br.readLine();
			
			String[] m = a.split("\\.");
			String[] n = b.split("\\.");
			
			boolean flag = true;
			
			//System.out.println(m[0] + " " + n[0]);
			
			System.out.println(m.length + " " + n.length);
			
			for(int j = 0; j < m.length; j++)
			{
				c = Integer.toString(Integer.parseInt(n[i], 2));
				
				//System.out.println(c);
				
				if(c != m[i])
				{
					flag = false;
					break;
				}
				 c = "";
			}
			
			if(flag)
				sb.append("Case " + i + ": Yes\n");
			
			else
				sb.append("Case " + i + ": No\n");
			
		}
		
		System.out.print(sb);
	}
}
