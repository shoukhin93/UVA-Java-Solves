import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class Main {

	public static void main(String[] args) throws IOException,
			NullPointerException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		ArrayList<Long> a = new ArrayList<>();
		ArrayList<Long> b = new ArrayList<>();

		HashMap<Long, Long> hm = new HashMap<Long, Long>();
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			b.add(sc.nextLong());
		}

		int l = b.size();

		for (int i = 0; i < l; i++) {
			long tmp = b.get(i);

			if (!hm.containsKey(tmp)) {
				a.add(tmp);
				hm.put(tmp, (long) 0);
			}

			hm.put(tmp, hm.get(tmp) + 1);

		}

		l = a.size();

		for (int i = 0; i < l; i++) {
			long tmp = a.get(i);
			sb.append(tmp).append(" ").append(hm.get(tmp)).append("\n");
		}

		System.out.print(sb);

	}

}
