import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = sc.nextInt();
		
		for(int i = 1; i <= t; i++)
		{
			String s = sc.nextLine();
			String x = sc.nextLine();
			//s= "100.44";
			String[] m = s.split("\\.");
			String[]n = x.split("\\.");
			boolean flag = true;
			
			
			//System.out.print(m.length);
			for(int j = 0; j < m.length; j++)
			{
				String k =String.valueOf( Integer.parseInt(m[j], 2));
				
				if(n[j] != k)
				{
					flag = false;
				}
				//System.out.println(n[i] + " " + k);
			}
			
			if(flag == true)
			{
				System.out.println("Case " + i + ": Yes");
			}
			else
				System.out.println("Case " + i + ": No");
		}

	}

}
