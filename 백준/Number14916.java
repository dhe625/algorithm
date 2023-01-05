package 백준;

import java.util.Scanner;

public class Number14916 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int ans = 0;
		
		if((n%5)%2==1) {
			ans = n/5-1;
			ans += (n%5+5)/2;
		} else {
			ans = n/5;
			ans += (n%5)/2;
		}
		
		if(n==1 || n==3)
			ans = -1;
		
		System.out.println(ans);
		scanner.close();
	}
}
