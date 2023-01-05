package 백준;

import java.util.Scanner;

public class Number13398 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int arr[] = new int[n];
		int max1 = -1000;
		int max2 = -1000;
		int min = 1000;
		
		for(int i=0; i<n; i++) {
			arr[i] = scanner.nextInt();
			
			min = Math.min(min, arr[i]);

			for(int j=0; j<=i; j++) { // 변수의 갯수만큼 돎;
				int p = 0;
				for(int k=i; k>=j; k--) {
					p += arr[k];
				}
				max1 = Math.max(max1, p);
			}
		}
		
		for(int i=0; i<n; i++) {
			if(arr[i]==min) {
				for(int j=i+1; j<n; j++) {
					arr[j-1] = arr[j];
				}
				break;
			}
		}
		
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<=i; j++) { // 변수의 갯수만큼 돎;
				int p = 0;
				for(int k=i; k>=j; k--) {
					p += arr[k];
				}
				max2 = Math.max(max2, p);
			}
		}
		
		System.out.println(Math.max(max1, max2));
		scanner.close();
	}
}
