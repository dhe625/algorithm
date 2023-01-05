package 백준;

import java.util.Scanner;

public class Number1699_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int ans[] = new int[N+1];
		ans[1] = 1;
		
		for(int i=2; i<=N; i++) {
			ans[i] = i; // 전부 1^2일 경우;
			
			for(int j=1; j*j<=i; j++) {
				ans[i] = Math.min(ans[i-j*j]+1,ans[i]); //제곱수를 하나 빼주므로 +1;
			}
		}
		
		System.out.println(ans[N]);
		scanner.close();
	}
}
