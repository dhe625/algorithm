package 백준;

import java.util.Scanner;

public class Number2293 {
	static int arr[];
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		arr = new int[k+1];
		
		for(int i=0; i<n; i++) {
			int c = scanner.nextInt();
			for(int j=1; j<=k; j++) {
				if(j>c) {
					arr[j] = arr[j] + arr[j-c];
				} else if(j==c) {
					arr[j] += 1;
				}
			}
		}
		
		System.out.println(arr[k]);
		scanner.close();
	}
}
