package 백준;

import java.util.Scanner;

public class Number9251 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String A = scanner.next();
		String B = scanner.next();
		
		int arr[] = new int[A.length()];
		int value = 0;
		
		for(int i=0; i<B.length(); i++) {
			value = 0;
			
			for(int j=0; j<A.length(); j++) {
				
				if(value < arr[j]) {
					value = arr[j];
					continue;
				}
				
				if(B.charAt(i)==A.charAt(j)) {
					arr[j] = value + 1;
				}
			}
		}
		
		int ans = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(ans < arr[i])
				ans = arr[i];
		}
		
		System.out.println(ans);
		scanner.close();
	}
}
