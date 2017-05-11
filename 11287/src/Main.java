import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


class Main {
	static int[] ara = new int[1000010];
	
	
	public static void seive(){
		for(int i = 0; i <= 1000000; i++)
			ara[i] = 0;
		ara[1] = 1;
		
		int n = (int)Math.sqrt(1000000);
		
		for(int i = 2; i <= n; i ++)
		{
			if(ara[i] == 0)
			{
				for(int j = i * i; j <= 1000000; j += i)
					ara[j] = 1;
			}
		}
	}

	
	public static int isPrime(int n){
		if(n <= 1000000)
			return ara[n];
		
		int k = (int) Math.sqrt(n);
		
		for(int i = 2; i <= k; i++){
			if(n % i == 0)
				return 1;
		}
		return 0;
	}

	public static void main(String[] args) throws IOException {
		BigInteger b, c;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		seive();
		
		
		while(true){
			String[] m = br.readLine().split(" ");
			if(m[0] == "0" && m[1] == "0")
				break;
			
			b = new BigInteger(m[0]);
			c = new BigInteger(m[1]);
			
			if(isPrime(Integer.parseInt(m[0])) == 1 && c.modPow(b, b).equals(c)){
				System.out.println("yes");				
			}
			else
				System.out.println("no");
		}
		
		
		

	}

}
