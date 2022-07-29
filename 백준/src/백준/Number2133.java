package 백준;

import java.util.Scanner;

public class Number2133 {
	static int arr[];
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		
		arr = new int[N+2];
		arr[0] = 1;
		arr[2] = 3;
		
		for(int i=4; i<=N; i+=2) {
			int sum = 0;
			
			for(int j=0; j<i; j+=2) {
				if(j==i-2) {
					sum += arr[j]*3;
				} else {
					sum += arr[j]*2;
				}
			}
			
			arr[i] = sum;
		}
		
		System.out.println(arr[N]);
		scanner.close();
	}
}
