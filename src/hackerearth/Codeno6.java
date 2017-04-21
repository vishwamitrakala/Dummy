package hackerearth;


import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Codeno6 {

	private static Scanner s;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> a = new ArrayList<>();
		int k=0;
		int l=0;
		
		String[][] multi = new String[30][30];
		s = new Scanner(System.in);
		int t = s.nextInt();
		while(--t>=0){
			int n = s.nextInt();
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
				multi[i][j]=s.next();
			//	System.out.println("one");
				if(multi[i][j].equalsIgnoreCase("*")){
                   k=i;
                     l=j;
                    // System.out.println(k);
                   //  System.out.println("two");
                    // System.out.println(l);
                }
				}
				System.out.println();
			}
            int mid=n/2;
            k=mid-k;
            l=mid-l;
            /*System.out.println(mid);
            System.out.println(k);
            System.out.println(l);*/
            System.out.println(k+l);
            }
			}
			
		}
	


