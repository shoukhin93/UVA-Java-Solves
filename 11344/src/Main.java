import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;


class Main {

	
	public static void main(String[] args) throws IOException {
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BigInteger b;
		int n;
		boolean flag;
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0){
			b = new BigInteger(br.readLine());
			//System.out.println(b);
			flag = false;
			sb.append(b).append(" - ");
			String[] m = br.readLine().split(" ");
			n = m.length;
			//System.out.println(m[2]);
			
			for(int i = 1; i < n ;i++){
				if((b.mod(new BigInteger(m[i]))) != BigInteger.ZERO){
					flag = true;
				}
			}
			if(!flag){
				sb.append("Wonderful.").append("\n");
			}
			else
				sb.append("Simple.").append("\n");
		}
		System.out.print(sb);

	}

}
