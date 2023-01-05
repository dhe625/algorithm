package 백준;

import java.util.Arrays;
import java.util.Scanner;

public class Number2981 {
	
	static int gcf(int a, int b) {
	    while (b > 0) {
	        int tmp = a;
	        a = b;
	        b = tmp%b;
	    }
	    return a;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = scanner.nextInt();
		}
		
		Arrays.sort(arr);
		
		int c = arr[1]-arr[0];
		
		for(int i=2; i<N; i++) {
			c = gcf(c,arr[i]-arr[i-1]);
		}
		
		for(int i=2; i<=c; i++) {
			if(c%i==0) {
				System.out.print(i);
				
				if(i!=c) {
					System.out.print(" ");
				}
			}
		}
		
		scanner.close();
	}
}
