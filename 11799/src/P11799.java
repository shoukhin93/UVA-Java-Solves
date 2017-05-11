import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
 
/**
 * 
 * @author Sanchit M. Bhatnagar
 * @see http://uhunt.felix-halim.net/id/74004
 * 
 */
class P11799 {
 
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);
 
    int N = Integer.parseInt(br.readLine());
    for (int i = 1; i <= N; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int ans = 0;
      while (st.hasMoreTokens()) {
        ans = Math.max(ans, Integer.parseInt(st.nextToken()));
      }
      out.println("Case " + i + ": " + ans);
    }
    out.close();
    br.close();
  }
}