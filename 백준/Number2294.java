package 백준;

import java.util.Scanner;

public class Number2294 {
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
					if(arr[j-c]==0) {
						continue;
					} else if(1 + arr[j-c] < arr[j] || arr[j]==0) {
						arr[j] = 1 + arr[j-c];
					}
				} else if(j%c==0) {
					if((int) j/c < arr[j] || arr[j]==0)
						arr[j] = (int) j/c;
				}
			}
		}
		
		if(arr[k]==0) {
			System.out.println(-1);
		} else {
			System.out.println(arr[k]);
		}

		scanner.close();
	}
}
