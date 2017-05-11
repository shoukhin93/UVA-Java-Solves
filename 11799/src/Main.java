import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


class Main {

	public static void  main(String arg[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Scanner s = new Scanner(System.in);
		
		int t, n, m, b;
		
		 t = s.nextInt();
		 
		 //System.out.println(t);

		    for(int i = 1; i <= t; i++)
		    {
		        n = s.nextInt();

		        m = s.nextInt();

		        b = m;

		        for(int j = 0; j < n - 1; j++)
		        {
		        	m = s.nextInt();

		            if(b < m)
		                b = m;
		        }

		        System.out.println("Case " + i + ": " + b);
		    }

		}
		
	}

