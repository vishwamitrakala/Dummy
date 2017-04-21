//Done AC//
package hackerearth;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TestClass {
	private static Scanner s;

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		ArrayList<String> a = new ArrayList<>();
		ArrayList<String> a1 = new ArrayList<>();

		// BufferedReader
		/*
		 * BufferedReader br = new BufferedReader(new
		 * InputStreamReader(System.in)); String line = br.readLine();
		 */
		s = new Scanner(System.in);

		int k = s.nextInt();
		for (int i = 0; i < k; i++) {

			String b = s.next();
			a.add(b);
		}
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			String b = s.next();
			a1.add(b);
		}

		a1.removeAll(a);
		int cnt = 0;
		for (String m : a1) {

			String aaa = m.toUpperCase();
			System.out.print(aaa.charAt(0));
			if (cnt < a1.size() - 1) {
				System.out.print(".");
				cnt++;
			}
		}
	}
}
/*W.T.H.S.E.C

Confused? Well it stands for Welcome To HackerEarth September Easy Challenge :). It's quite amazing when long words like this get reduced to such a short string. They sound pretty cool and often make the chat interesting. They are almost used everywhere these days.

Our friend Harsh has been recently reducing every sentence he receives to acronym. Since Harsh is a young lad he has his own personal likes and dislikes. There are some words which he just does not want to see in a sentence. So whenever he encounters such a word he simply ignores it. Harsh is thinking of converting a book to an acronym book where each sentence of the book is reduced to its short form. Since Harsh is quite busy in promoting his new book he wants you to help him in doing so.

So he gives you a set of words which he dislikes and a sentence for which he wants to abbreviate. Help him in getting the required abbreviation.

Input:

The first line contains an integer K which denotes the number of disliked words, This is followed by k lines where each line contains a disliked word, the next line will contain an integer donating the number of words in the given sentence, The last line contains the sentence of which Harsh wants to abbreviate.

The sentence will consist of number of words separated by a space

All words will consist of lowercase English alphabets(a-z)

Output:

In a single line print the required acronym. The Acronym should be printed in Upper Case English alphabets separated by "." (dots).

Note:

changing a sentence to acronym means taking first character of each word of the sentence and changing it to upper case then writing the characters separated by "." (dots), remember that Harsh doesn't like some words so he will not take their first character if they appear in the sentence

If a disliked word is present as a proper substring of a word in the given sentence then it should not be ignored.

The final Output will never be an empty string.

Constraints:

1<= K <=10

1<= length of each word <=100

1<= length of the sentence <=100

SAMPLE INPUT 
5
hey
girls
i
am
single
11
hey all boys and girls welcome to hackerearth easy september challenge
SAMPLE OUTPUT 
A.B.A.W.T.H.E.S.C
Explanation
The required string after ignoring disliked strings would be

all boys and welcome to hackerearth easy september challenge

So equivalent acronym would be

A.B.A.W.T.H.E.S.C*/