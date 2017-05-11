import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.TreeMap;

class Main {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n, l;
		long sum = 0;

		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			n = Integer.parseInt(br.readLine());
			HashMap<Character, Integer> tm = new HashMap<Character, Integer>();

			while (n-- > 0) {
				 String[] m = br.readLine().split(" ");
				tm.put(m[0].charAt(0),
						Integer.parseInt(m[1]));
			}

			n = Integer.parseInt(br.readLine());
			sum = 0;

			while (n-- > 0) {
				String tmp = br.readLine();
				l = tmp.length();

				for (int i = 0; i < l; i++) {
					if (tm.containsKey(tmp.charAt(i)))
						sum += tm.get(tmp.charAt(i));
				}

			}

			String temp = sum % 100 + "";

			if (temp.length() < 2)
				temp = "0" + temp;
			

			sb.append(sum / 100).append(".").append(temp).append("$\n");
		}

		System.out.print(sb);

	}

}
