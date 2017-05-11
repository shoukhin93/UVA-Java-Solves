import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main {


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		
		String[]m = br.readLine().split(",");
		
		for(int k = 0; k < m.length; k++ ){
			if(isPrime(Integer.parseInt(m[k]))){
				sb.append("Yes\n");
			}
			else
				sb.append("No\n");
		}
		
		System.out.print(sb);

	}

	private static boolean isPrime(int parseInt) {
		for(int i = 2; i <= Math.sqrt(parseInt); i++)
		{
			if (parseInt % i == 0)
				return false;
		}
		return true;
	}

}
