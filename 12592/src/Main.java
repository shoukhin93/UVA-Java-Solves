import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;


class Main {

	public static void main(String args[]) throws IOException
	{
		HashMap<String, String> m = new HashMap<String, String>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		
		 int n;

		    String a, b;

		    n = Integer.parseInt(br.readLine());

		    for(int i = 0; i < n; i++)
		    {
		        a = br.readLine();
		        b = br.readLine();

		        m.put(a, b);
		    }

		    n = Integer.parseInt(br.readLine());

		    for(int i = 0; i < n; i++)
		    {
		    	a = br.readLine();

		        sb.append(m.get(a)).append("\n");
		    }
		    
		    System.out.print(sb);
	}
}
