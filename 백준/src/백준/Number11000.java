package 백준;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Number11000 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int arr[][] = new int[N][2];
		
		for(int i=0; i<N; i++) {
			arr[i][0] = scanner.nextInt();
			arr[i][1] = scanner.nextInt();
		}
		
		Arrays.sort(arr, new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				if(a[0] == b[0])
					return a[1] - b[1];
				else
					return a[0] - b[0];
			}
		});
		
		PriorityQueue <Integer> pq = new PriorityQueue<>(); // 값이 작을수록 우선순위가 높음;
		
		pq.add(arr[0][1]);
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i][0]>=pq.peek())
				pq.poll();

			pq.add(arr[i][1]);
		}
		
		System.out.println(pq.size());
		scanner.close();
	}
}
