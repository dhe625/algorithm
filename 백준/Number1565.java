package 백준;

import java.util.Scanner;

public class Number1565 {
	static int gcd(int a, int b) {
		if(b==0)
			return a;
		
		return gcd(b, a%b);
	}

	static int lcm(int a, int b) {
		return a*b / gcd(a,b);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int s1 = scanner.nextInt();
		int s2 = scanner.nextInt();
		
		int[] D = new int[s1];
		int[] M = new int[s2];
		
		for(int i=0; i<s1; i++) {
			D[i] = scanner.nextInt();
		}
		
		for(int i=0; i<s2; i++) {
			M[i] = scanner.nextInt();
		}
		
		int N1 = D[0]; int N2 = M[0];
		
		for(int i=0; i<s1; i++) {
			N1 = lcm(N1,D[i]);
		}
		
		for(int i=0; i<s2; i++) {
			N2 = gcd(N2,M[i]);
		}
		
		int result = 0;
		
		for(int i=N1; i<=N2; i+=N1) {
			if(N2%i==0) {
				result++;
			}
		}
		
		System.out.println(result);
		scanner.close();
	}
}