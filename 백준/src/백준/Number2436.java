package 백준;

import java.util.Scanner;

public class Number2436 {
	static long N,M;
	static int gcf(int a, int b) {
	    while (b > 0) {
	        int tmp = a;
	        a = b;
	        b = tmp%b;
	    }
	    return a;
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt(); // 최대공약수;
		int B = scanner.nextInt(); // 최소공배수;
		
		int C = B/A; // i*j;
		long min = Long.MAX_VALUE;
	
		
		for(int i=1; i<=C; i++) {
			if(C%i!=0)
				continue;
			
			int j = C/i;
			
			if(A*(i+j) < min && gcf(i, j)==1) { // i,j가 서로소여야 함;
				min = A*(i+j);
				N = A*i;
				M = A*j;
			}
		}
		
		System.out.println(N + " " + M);
		scanner.close();
	}
}
