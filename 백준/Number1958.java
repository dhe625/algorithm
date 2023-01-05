package 백준;

import java.util.Scanner;

public class Number1958 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String A = scanner.next();
		String B = scanner.next();
		String C = scanner.next();
		
		int[][][] memo = new int[A.length()+1][B.length()+1][C.length()+1];
		
		for(int i=1; i<=A.length(); i++) {
			for(int j=1; j<=B.length(); j++) {
				for(int k=1; k<=C.length(); k++) {
					if(A.charAt(i-1) == B.charAt(j-1) && B.charAt(j-1) == C.charAt(k-1))
						memo[i][j][k] = memo[i-1][j-1][k-1] +1;
					else 
						memo[i][j][k] = Math.max(Math.max(memo[i-1][j][k], memo[i][j-1][k]), memo[i][j][k-1]);
				}
			}
		}
		
		System.out.println(memo[A.length()][B.length()][C.length()]);
		scanner.close();
	}
}
