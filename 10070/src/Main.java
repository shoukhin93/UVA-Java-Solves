import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		BigInteger b;
		boolean flag = false;
		while (sc.hasNext()) {
			b = sc.nextBigInteger();

			if (flag) {
				System.out.println();
			}
			flag = true;
			
			if (b.mod(BigInteger.valueOf(4)).equals(BigInteger.ZERO)
					&& !(b.mod(BigInteger.valueOf(100)).equals(BigInteger.ZERO))
					|| b.mod(BigInteger.valueOf(400)).equals(BigInteger.ZERO)) {

				System.out.println("This is leap year.");

				if (b.mod(BigInteger.valueOf(15)).equals(BigInteger.ZERO)) {
					
					System.out.println("This is huluculu festival year.");
				}

				if (b.mod(BigInteger.valueOf(55)).equals(BigInteger.ZERO)) {
					System.out.println("This is bulukulu festival year.");
				}
			}
			
			else if(b.mod(BigInteger.valueOf(15)).equals(BigInteger.ZERO)){
				System.out.println("This is huluculu festival year.");
			}

			else {
				System.out.println("This is an ordinary year.");
			}
		}

	}

}
