import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		int  l, o, k;
		
		String m ;
		
		while((m = br.readLine()) != null){
			
			if(m.equalsIgnoreCase("0"))
				break;
			
			String[] n = m.split(" ");
			
			o = Integer.parseInt(n[0]);
			
			l = n[1].length();
			
			k = l / o;
			
			o = k;
			
			for(int i = 0; i < l; i += k){

				for(int j = o - 1; j >= i ; j--){
					
					sb.append(n[1].charAt(j));
					

				}
				
				o += k;
			}
			
			sb.append("\n");
		}
		
		System.out.print(sb);

	}

}
