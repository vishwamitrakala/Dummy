package hackerearth;

import java.math.BigInteger;

import java.util.Scanner;

public class Codeno7 {
	private static Scanner s;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A[] = new int[10000];
		int B[] = new int[10000];
		s = new Scanner(System.in);
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {

			A[i] = s.nextInt();

		}

		int q = s.nextInt();
		while (--q >= 0) {
			int first = s.nextInt();
			if (first == 1) {
				int id = s.nextInt();

				for (int i = 0; i < n; i++) {
					B[i] = 1;
					for (int j = 0; j < n; j++) {
						if (i != j) {
							B[i] = B[i] * A[j];
							// System.out.println(B[i]);
						}
					}
					// System.out.println(B[i]);

				}

				BigInteger big = BigInteger.valueOf(B[id - 1] % ((long) Math.pow(10, 9) + 7));
				System.out.println(big);
			} else {
				int id1 = s.nextInt();
				int v = s.nextInt();
				A[id1 - 1] = v;
				// System.out.println(A[id1]);
			}

		}
	}

}
