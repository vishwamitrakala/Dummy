//DONE//

package hackerearth;

import java.io.IOException;
import java.util.Scanner;

public class Codeno4 {
	private static Scanner s;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/*
		 * BufferedReader br = new BufferedReader(new
		 * InputStreamReader(System.in)); String line = br.readLine();
		 */
		s = new Scanner(System.in);
		int k = s.nextInt();
		/* int k = Integer.parseInt(line); */
		while (--k >= 0) {
			int t = s.nextInt();
			int p = s.nextInt();
			for (int i = 0; i < p; i++) {
				if (t % 2 == 0) {
					t = t / 2 + 1;
				} else
					t = t - 1;
			}
			System.out.println(t);
		}
	}

}
/*Betty had invited her friends over for breakfast. Being great at tongue twisters, Betty decides to have some fun with the others by making them repeat one of her tongue twisters while she made the sandwich.

Betty bought a bit of butter, but the butter was too bitter 
So, Betty bought some better butter to make the bitter butter better.

Her friends knew they could never beat her at her game, so they made a puzzle for her. 
They knew that Betty is making an N-sided sandwich. So they decide that for every person in the room except Betty, each person will come one by one and cut the sandwich into 2 parts starting from any one vertex to the symmetrically opposite point and they will remove one of the parts. They ask her in advance to guess how many sided sandwich will be left for her after they have performed the cuts. Now Betty is confused. Can you help her?

Note: A symmetrical cut in this context means that if there are even number of sides of the sandwich, then you cut from one vertex to the opposite vertex in your turn. Otherwise you cut from one vertex to the middle of the edge opposite to the vertex.

Sandwich Example

Input:

First line contains T which is the number of test cases.
T lines follow each containing two integers N and P where N is the number of sides of the sandwich and P is the number of friends present that day.

Output:

For each test case, output the number of sides of the sandwich after everyone has performed their cuts.

Constraints:

1 ≤ T ≤ 105
3 ≤ N ≤ 109
0 ≤ P ≤ 109
Scoring:

1 ≤ T ≤ 100, 3 ≤ N ≤ 1000 , 0 ≤ P ≤ 1000 : (30 pts)
1 ≤ T ≤ 1000, 3 ≤ N ≤ 1000 , 0 ≤ P ≤ 105 : (30 pts)
Original Constraints : (40 pts)
SAMPLE INPUT 
2
4 1
8 2
SAMPLE OUTPUT 
3
4
Explanation
Case 1: Refer to image Case 2: After the first cut, we get a 5-sided sandwich. After the second cut on this 5-sided sandwich, it becomes 4-sided.*/