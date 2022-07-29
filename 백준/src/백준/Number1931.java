package 백준;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Number1931 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int c = scanner.nextInt();
		int arr[][] = new int[c][2];
		int ans = 1;
		
		for(int i=0; i<c; i++) {
			arr[i][0] = scanner.nextInt();
			arr[i][1] = scanner.nextInt();
		}
		
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] t1, int[] t2) {
				if(t1[1] == t2[1]) { // 종료 시간이 같을 경우;
					return t1[0] - t2[0];
				}
				return t1[1] - t2[1];
			}
		});
		
		int min = arr[0][1];
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i][0] >= min) {
				ans++;
				min = arr[i][1];
			}
		}
		
		System.out.println(ans);
		scanner.close();
	}
}
