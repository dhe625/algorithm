package 백준;

import java.util.Scanner;

public class Number17213 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		
		long top = 1; long bottom = 1;
		int f = M-N+N-1;
		int r = M-N;
		
		if(f-r < r)
			r = f-r;
		
		int c = r;
		
		for(int i=0; i<c; i++) {
			top *= f;
			f--;
		}
		
		for(int i=0; i<c; i++) {
			bottom *= r;
			r--;
		}
		
		System.out.println((int)(top/bottom));
		scanner.close();
	}
}
