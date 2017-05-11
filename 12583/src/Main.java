import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringBuilder sb = new StringBuilder();
		
		    int t, a, b, count;

		    t = Integer.parseInt(br.readLine());

		    for(int i = 1; i <= t; i++)
		    {
		        String[] m = br.readLine().split(" ");
		        count = 0;
		        
		        a = Integer.parseInt(m[0]);
		        b = Integer.parseInt(m[1]);

		        for(int k = 0; k < a; k++)
		        {
		            for(int j = k - 1, c = 0; j >= 0 && c != b; j--, c++)
		            {
		                if(m[2].charAt(k) == m[2].charAt(j))
		                {
		                	
		                	count++;
		                	break;
		                }
		            }
		        }


		        sb.append("Case " + i + ": " + count + "\n");
		    }
		    
		    System.out.print(sb);
		}


	}


