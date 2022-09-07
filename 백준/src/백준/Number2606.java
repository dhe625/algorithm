package 백준;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Number2606 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int cnt = scanner.nextInt();
		int[][] arr = new int[N+1][N+1];
		
		for(int i=0; i<cnt; i++) { // Adjacency matrix
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			
			arr[a][b] = 1;
			arr[b][a] = 1;
		}
		
		boolean [] check = new boolean [N+1];
		Queue<Integer> q = new LinkedList<>();
		
		q.add(1);
		check[1] = true;
		
		int ans = 0;
		while(!q.isEmpty()) {
			int head = q.poll();
			
			for(int i=1; i<=N; i++) {
				if(arr[head][i] == 1 && !check[i]) {
					q.add(i);
					check[i] = true;
					ans++;
				}
			}
		}
		
		System.out.println(ans);
		scanner.close();
	}
}
