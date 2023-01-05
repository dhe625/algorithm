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
		
		// 회의의 시작시간과 종료시간을 입력으로 받음;
		for(int i=0; i<c; i++) {
			arr[i][0] = scanner.nextInt();
			arr[i][1] = scanner.nextInt();
		}
		
		// 종료시간을 기준으로 정렬;
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] t1, int[] t2) {
				if(t1[1] == t2[1]) {
					return t1[0] - t2[0];
				} // 종료시간이 같을 경우 시작시간을 기준으로 정렬;
				return t1[1] - t2[1];
			}
		});
		
		int min = arr[0][1]; // 시작시간이 가장 빠른 회의의 종료시간;
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i][0] >= min) { // 이어서 회의를 열 수 있는지 확인;
				ans++; // 회의를 열 수 있으므로 회의의 개수 갱신;
				min = arr[i][1]; // 그 회의의 종료시간으로 갱신;
			}
		}
		
		System.out.println(ans); // 최대 사용할 수 있는 회의의 최대 개수 출력;
		scanner.close();
	}
}
