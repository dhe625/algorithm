package 백준;

import java.util.Scanner;

public class Number13270 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int answer[][] = new int[N+1][2];
		
		for(int i=2; i<=N; i++) {
			
			if(i==2) {
				answer[i][0] = answer[i][1] = 1;
				continue;
			}
			
			if(i==3) {
				answer[i][0] = answer[i][1] = 2;
				continue;
			}
			
			answer[i][0] = answer[i-2][0]+1;
			answer[i][1] = answer[i-3][1]+2;
		}
		
		System.out.print(answer[N][0]);
		System.out.print(" ");
		System.out.print(answer[N][1]);
		
		scanner.close();
	}
}
