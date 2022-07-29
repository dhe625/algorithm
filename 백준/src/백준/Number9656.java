package 백준;

import java.util.Scanner;

public class Number9656 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		String arr[] = new String[N+1];
		arr[0] = "SK";
		arr[1] = "CY";
		
		for(int i=1; i<=N; i++) {
			int index = i;
			if(index >= 6) index %= 6; // 둘 다 3
			if(index >= 4) index %= 4; // 하나는 1 하나는 3
			if(index >= 2) index %= 2; // 둘 다 1
			arr[i] = arr[index];
		}
		
		System.out.println(arr[N]);
		scanner.close();
	}
}
