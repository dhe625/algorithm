package 백준;

import java.util.Scanner;

public class Number1105 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String L = scanner.next();
		String R = scanner.next();
		int ans = 0;
		
		if(L.length()!=R.length()) System.out.println(ans);
		else {
			for(int i=0; i<L.length(); i++) {
				if(L.charAt(i)==R.charAt(i) && L.charAt(i)=='8') ans++;
				else if(L.charAt(i)!=R.charAt(i)) break;
			}
			System.out.println(ans);
		}
		scanner.close();
	}
}
