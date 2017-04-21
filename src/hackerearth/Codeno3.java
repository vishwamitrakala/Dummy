package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codeno3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int n = Integer.parseInt(line);
		
		int m=n*2+1;
		
		for(int i=0;i<m-1;i++){
			for(int j=0;j<m;j++){
				if(i==n-j){
					if(j==0||j==n-j)
						System.out.print("/");
					else if(j==n-1||j==2*n-1)
						System.out.print("\\");
					else
						System.out.print(" ");
				}
				/*if(i==n-2){
					if(j==n-1)
						System.out.print("/");
					else if(j==n)
						System.out.print("\\");
					else
						System.out.print(" ");
				}
				if(i==1){
					if(j==n-2)
						System.out.print("/");
					else if(j==n+1)
						System.out.print("\\");
					else
						System.out.print(" ");
				}
				if(i==2){
					if(j==n-1)
						System.out.print("/");
					else if(j==n)
						System.out.print("\\");
					else
						System.out.print(" ");
				}*/
				/*if((j==n-1))
				System.out.print("/");
				if(j==n)
					System.out.print("\\");
				else
					System.out.print(" ");*/
			}
			System.out.println();
		}
		
	}

}
