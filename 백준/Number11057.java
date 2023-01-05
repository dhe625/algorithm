package 백준;

import java.util.Scanner;

public class Number11057 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int arr[][] = new int[N+1][10];
		
		for(int i=0; i<10; i++) {
			arr[0][i] = 1;
		}
		
		for(int i=1; i<=N; i++) {
			for(int j=0; j<10; j++) {
				int sum = 0;
				for(int k=j; k<10; k++) {
					sum += arr[i-1][k] % 10007;
				}
				arr[i][j] = sum % 10007;
			}
		}
		
		System.out.println(arr[N][0]);
		scanner.close();
	}
}
