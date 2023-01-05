package 백준;

import java.util.Scanner;

public class Number2503 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int check[] = new int[1000];
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				if(i!=j) {
					for(int k=1; k<=9; k++) {
						if(k!=i && k!=j) {
							check[i*100 + j*10 + k] = 1;
						}
					}
				}
			}
		}
		
		int c = scanner.nextInt();
		for(int i=0; i<c; i++) {
			String str = scanner.next();
			int s = scanner.nextInt();
			int b = scanner.nextInt();
			
			for(int j=123; j<=987; j++) {
				if(check[j]==1) {
					String a = Integer.toString(j);
					int strike = 0;
					int ball = 0;
					for(int k=0; k<3; k++) {
						if(a.charAt(k)==str.charAt(k)) {
							strike++;
						}
					}
					if (a.charAt(0) == str.charAt(1) || a.charAt(0) == str.charAt(2)) {
						ball++;
					}
					if (a.charAt(1) == str.charAt(0) || a.charAt(1) == str.charAt(2)) {
						ball++;
					}
					if (a.charAt(2) == str.charAt(0) || a.charAt(2) == str.charAt(1)) {
						ball++;
					}

					if (strike != s || ball != b) {
						check[j] = 0;
					}
				}
			}
		}
		
		int answer = 0;
		for(int i=123; i<=987; i++) {
			if(check[i]==1) {
				answer++;
			}
		}
		System.out.println(answer);
		scanner.close();
	}
}