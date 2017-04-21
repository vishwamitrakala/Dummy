package hackerearth;

import java.util.Scanner;

public class Codeno8 {
	private static Scanner s;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[1000];
		s=new Scanner(System.in);
		int n=s.nextInt();
		double m=s.nextDouble();
		double cnt=0;
		 for(int i=0;i<n;i++){
			 a[i]=s.nextInt();
			 cnt=cnt+a[i];
		 }
		if(cnt%m==0){
			int days=(int) cnt/(int)m;
			System.out.println(days);
		}
		else{
		double day=cnt/m;
		int result=(int) Math.ceil(day);
		int res =(int) Math.abs(day);
		System.out.println(res);
	}
	}
}
/*The hero of this story is a toddler named BooBoo. Inspired by the legendary competitive coder Gena, BooBoo has also started preparing to race to the top of the ranks.

BooBoo is going to practice  
N
N  different problems in the exact given order over the next 
M
M days. For each problem, he writes down the amount of time 
q
i
qi he will take to think and code the 
i
t
h
ith problem (He is quite good at estimating!). Before starting on the problems, he took advice from experienced competitive programmers on his practice routine and almost all of them advised him to keep his daily load at the minimum possible and avoid over training.

Since BooBoo already has 
N
N problems to solve, he asks you to find the minimum time 
T
T such that training everyday for a time 
t
i
≤
T
ti≤T is sufficient to solve all the 
N
N problems in 
M
M days.

Note : Unlike in real world, you cannot think on a problem on one day and solve it on the other day. You need to do it on the very same day!

Input Format:

The first line contains two space separated integers 
N
N and 
M
M. The next line contains 
N
N space separated integers denoting the time 
q
i
qi required to solve the 
i
t
h
ith problem.

Output Format:

The output consists of one integer, the minimum time 
T
T as described in the problem statement.

Constraints:

1
≤
N
≤
10
5
1≤N≤105
 1
≤
M
≤
N
1≤M≤N
 1
≤
q
i
≤
10
12
1≤qi≤1012

Subtasks

20 points: 
1
≤
N
≤
1000
,
1
≤
M
≤
100
,
1
≤
q
i
≤
100
1≤N≤1000,1≤M≤100,1≤qi≤100.
80 points: Original Constraints

SAMPLE INPUT 
5 3
1 2 2 1 3
SAMPLE OUTPUT 
3
Explanation
By setting T = 3, we can solve 1st two questions on day 1, next two on day 2 and 5th one on day 3.*/
