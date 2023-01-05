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
		
		for(int i=0; i<N; i++) { // 수업의 시작시간과 종료시간을 입력으로 받음;
			arr[i][0] = scanner.nextInt();
			arr[i][1] = scanner.nextInt();
		}
		// 종료시간을 기준으로 정렬;
		Arrays.sort(arr, new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				if(a[0] == b[0]) // 종료시간이 같을 경우 시작시간을 기준으로 정렬;
					return a[1] - b[1];
				else
					return a[0] - b[0];
			}
		});
		PriorityQueue <Integer> pq = new PriorityQueue<>();
		// 우선순위큐는 값이 작을수록 우선순위가 높음;
		
		pq.add(arr[0][1]);
		// 시작시간이 가장 빠른 수업의 종료시간을 우선순위큐에 넣음;
		for(int i=1;i<arr.length;i++) {
			if(arr[i][0]>=pq.peek()) 
				pq.poll(); 
			// 큐 맨앞에 있는 수업이 끝난 후 시작 가능한 수업이라면 맨앞 수업을 poll;
			
			pq.add(arr[i][1]); // 해당 수업을 우선순위큐에 넣음;
		}
		System.out.println(pq.size());
		// 우선순위큐에 남아있는 수업들이 곧 최소로 필요한 강의실에 개수이므로 출력;
		scanner.close();
	}
}
