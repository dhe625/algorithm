package 백준;

import java.util.Scanner;

public class Number13398_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int arr[] = new int[n];
		int dp[][] = new int[n][2];
		
		for(int i=0; i<n; i++) {
			arr[i] = scanner.nextInt();
		}
		
		dp[0][0] = dp[0][1] = arr[0];
		
		int ans = arr[0];
		
		for(int i=1; i<n; i++) {
			dp[i][0] = Math.max(arr[i], dp[i-1][0] + arr[i]);
			dp[i][1] = Math.max(dp[i-1][0], dp[i-1][1] + arr[i]);
			
			ans = Math.max(ans, Math.max(dp[i][0], dp[i][1]));
		}
		
		System.out.println(ans);
		scanner.close();
	}
}
