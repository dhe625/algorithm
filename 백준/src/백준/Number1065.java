package 백준;

import java.util.Scanner;

public class Number1065 {
	public static int hansoo(String n) {
		if(Integer.parseInt(n)<100) return Integer.parseInt(n);
		else if(Integer.parseInt(n)==1000) return 144;
		
		int result = 0;
		for(int i=100; i<=Integer.parseInt(n); i++) {
			String newI = String.valueOf(i);
			int s1 = newI.charAt(0) - '0'; // char to int
			int s2 = newI.charAt(1) - '0';
			int s3 = newI.charAt(2) - '0';
			if(Math.abs(s1-s2) == Math.abs(s2-s3)) {
				if(s1==s2 && s2==s3 && s1==s3) result++;
				else if(Math.abs(s1-s2)+s2 == s3) {
					if(s1<s2 && s1<s3 && s2<s3) result++;
				} else if(s2-Math.abs(s1-s2) == s3) {
					if(s1>s2 && s1>s3 && s2>s3) result++;
				}
			}
		}
		return result + 99;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String n = scanner.next();
		System.out.println(hansoo(n));
		scanner.close();
	}
}
