package 백준;

import java.util.Scanner;

public class Number1699 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int ans[] = new int[N+1];
		ans[1] = 1;
		
		for(int i=2; i<=N; i++) {
			int minimum = 100000;
			
			if(Math.sqrt(i) == (int)Math.sqrt(i)) {
				ans[i] = 1;
			} else {
				for(int j=1; j<=i/2; j++) {
					int c = Math.min(ans[i-j]+ans[j],minimum);
					if(c < minimum)
						minimum = c;
				}
				ans[i] = minimum;
			}
		}
		
		System.out.println(ans[N]);
		scanner.close();
	}
}
