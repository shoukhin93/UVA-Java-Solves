import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


class Main {

	public static void main(String[] args) throws NumberFormatException, IOException, ParseException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		SimpleDateFormat parser = new SimpleDateFormat("HH:mm");;
		
		int a, b, c, d;
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= t; i++){
			
			String[] m = br.readLine().split(" ");
			String[] n = br.readLine().split(" ");
			
			String[] o = m[0].split(":");
			String[] p = m[1].split(":");
			String[] q = n[0].split(":");
			String[] r = n[1].split(":");
			
			a = (Integer.parseInt(o[0]) * 60) + Integer.parseInt(o[1]);
			b = (Integer.parseInt(p[0]) * 60) + Integer.parseInt(p[1]);
			c = (Integer.parseInt(q[0]) * 60) + Integer.parseInt(q[1]);
			d = (Integer.parseInt(r[0]) * 60) + Integer.parseInt(r[1]);
			
			if(Integer.parseInt(o[0]) < a && d < a){
				if(c < b)
					sb.append("Case " + t + ": Hits Meeting\n");
				
				else
					sb.append("Case " + t + ": Mrs Meeting\n");
			}
			
			else if(c > a && d > a){
				if(c > b)
					sb.append("Case " + t + ": Hits Meeting\n");
				
				else
					sb.append("Case " + t + ": Mrs Meeting\n");
			}
			
			else
				sb.append("Case " + t + ": Mrs Meeting\n");
		}
		
		System.out.print(sb);

	}

}
