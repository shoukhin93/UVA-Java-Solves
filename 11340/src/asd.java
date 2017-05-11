import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

class asd {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int cases = Integer.parseInt(br.readLine());
		String m = "";
		for (int i = 0; i < cases; i++) {
			int n = Integer.parseInt(br.readLine());
			HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
			for (int j = 0; j < n; j++) {
				StringTokenizer str = new StringTokenizer(br.readLine());
				hm.put(str.nextToken().charAt(0),
						Integer.parseInt(str.nextToken()));
			}
			long sum = 0;
			n = Integer.parseInt(br.readLine());
			for (int j = 0; j < n; j++) {
				m = br.readLine();
				for (int z = 0; z < m.length(); z++) {
					if (hm.containsKey(m.charAt(z))) {
						sum += hm.get(m.charAt(z));
					}
				}

			}
			String temp = sum % 100 + "";
			if (temp.length() < 2) {
				temp = "0" + temp;
			}
			sb.append(sum / 100).append(".").append(temp).append("$\n");
		}
		System.out.print(sb);
	}
}
