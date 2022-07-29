package 백준;

import java.util.Scanner;

public class Number2740 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int m1 = scanner.nextInt();
		int a[][] = new int[n][m1];
		for(int i=0; i<n; i++) {
			for(int j=0; j<m1; j++) {
				a[i][j] = scanner.nextInt();
			}
		}
		
		int m2 = scanner.nextInt();
		int k = scanner.nextInt();
		int b[][] = new int[m2][k];
		for(int i=0; i<m2; i++) {
			for(int j=0; j<k; j++) {
				b[i][j] = scanner.nextInt();
			}
		}
		
		int result[] = new int[n*k];
		int rindex = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<k; j++) {
				int number = 0;
				for(int l=0; l<m2; l++) {
					number += a[i][l] * b[l][j];
				}
				result[rindex++] = number;
			}
		}
		
		for(int i=0; i<result.length; i++) {
			System.out.print(result[i]);
			if(i == result.length-1) break;
			if((i+1)%k==0) {
				System.out.println();
			} else {
				System.out.print(" ");
			}
		}
		scanner.close();
	}
}
