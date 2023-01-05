package 백준;

import java.util.Scanner;

public class Number10844 {
	final static long mod = 1000000000;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		long arr[][] = new long[N+1][10]; // index 0은 사용하지 않음;
		
		for(int i=1; i<10; i++) { // N==1일 경우
			arr[1][i] = 1;
		}
		
		for(int i=2; i<=N; i++) { // N>=2일 경우
			for(int j=0; j<10; j++) {
				if(j==0) {
					arr[i][0] = arr[i-1][1] % mod;
				}
				else if(j==9) {
					arr[i][9] = arr[i-1][8] % mod;
				}
				else {
					arr[i][j] = (arr[i-1][j-1] + arr[i-1][j+1]) % mod;
				}
			}
		}
		
		long ans = 0;
		
		for(int i=0; i<10; i++) {
			ans += arr[N][i];
		}
		System.out.println(ans % mod);
		scanner.close();
	}
}
