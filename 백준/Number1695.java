package 백준;

import java.util.Scanner;

public class Number1695 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int arr1[] = new int[N+1];
		int arr2[] = new int[N+1];
		int ans[][] = new int[N+1][N+1];
		
		for(int i=1; i<N+1; i++) {
			arr1[i] = arr2[N+1-i] = scanner.nextInt();
		}
		
		for(int i=1; i<N+1; i++) {
			for(int j=1; j<N+1; j++) {
				if(arr1[i]==arr2[j]) {
					ans[i][j] = ans[i-1][j-1] + 1;
				} else {
					ans[i][j] = Math.max(ans[i-1][j], ans[i][j-1]);
				}
			}
		}
		
		System.out.println(N - ans[N][N]);
		scanner.close();
	}
}
