package 백준;

import java.util.Scanner;

public class Number1309 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] arr = new int[3];
		arr[0]=3; arr[1]=7;
		int index = 2;
		
		for(int i=2; i<N; i++) {
			arr[index%3] = (arr[(index-1)%3]*2 + arr[(index-2)%3])%9901;
			index++;
		}
		
		System.out.println(arr[(N-1)%3]);
		scanner.close();
	}
}