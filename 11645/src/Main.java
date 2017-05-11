import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


class Main {

	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		BigInteger b;
		String m;
		int c;
		
		while((m = br.readLine()) != null){
			b = new BigInteger(m);
			m = b.toString(2);
			System.out.println(m);
			c = 0;
			for(int i = 0; i < m.length() - 1; i++){
				if(m.charAt(i) == '1' && m.charAt(i+1) == '1'){
					c++;
				}
			}
			System.out.println(c);
		}

	}

}
