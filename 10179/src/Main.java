import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main {
	
	public static int eulersTotient(int n) {
		  int sqrtN = (int) Math.sqrt(n);
		  int relPrimeNum = n;
		 
		  if (n % 2 == 0) {
		   relPrimeNum -= relPrimeNum / 2;
		 
		   while (n % 2 == 0) {
		    n /= 2;
		   }
		  }
		 
		  for (int i = 3; i <= sqrtN && n != 1; i += 2) {
		   if (n % i == 0) {
		    relPrimeNum -= relPrimeNum / i;
		 
		    while (n % i == 0) {
		     n /= i;
		    }
		   }
		  }
		   
		  if(n != 1){
		   relPrimeNum -= relPrimeNum / n;
		  }
		 
		  return relPrimeNum;
		 }
		
	

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n;
		
		while(true){
			
			n = Integer.parseInt(br.readLine());
			if(n == 0)
				break;
			
			sb.append(eulersTotient(n) + "\n");
			
			
			
			
		}
		System.out.print(sb);

	}

}

