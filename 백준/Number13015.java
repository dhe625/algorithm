package 백준;

import java.util.Scanner;

public class Number13015 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		
		int a = 0;
		int b = N-1;
		int c = 3*N-3;
		int d = 4*N-4;
		
		for(int i=0; i<2*N-1; i++) {
			if(i==0 || i==2*N-2) {
				for(int j=0; j<4*N-3; j++) {
					if(j>=a && j<=b || j>=c && j<=d) {
						System.out.print("*");
					} else if(j<d) {
						System.out.print(" ");
					}
				}
			} else if(i==N-1) {
				for(int j=0; j<4*N-3; j++) {
					if(j==a || j==b || j==d) {
						System.out.print("*");
					} else if(j<d) {
						System.out.print(" ");
					}
				}
			} else {
				for(int j=0; j<4*N-3; j++) {
					if(j==a || j==b || j==c || j==d) {
						System.out.print("*");
					} else if(j<d) {
						System.out.print(" ");
					}
				}
			}
			
			if(i<N-1) {
				a++; b++;
				c--; d--;
			} else {
				a--; b--;
				c++; d++;
			}
			
			System.out.println();
		}
		scanner.close();
	}
}
