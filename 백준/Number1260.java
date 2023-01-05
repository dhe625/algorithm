package 백준;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Number1260 {
	static int N;
	static int M;
	static int [][] arr;
	static boolean [] check1;
	static boolean [] check2;
	
	static void dfs(int V) {
		check1[V] = true;
		System.out.print(V + " ");
		
		for(int i=1; i<=N; i++){ // 재귀;
			if(arr[V][i]==1 && check1[i]==false)
				dfs(i);
		}
	}
	
	static void bfs(int V) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(V);
		check2[V] = true;
		
		while(!q.isEmpty()) { // 큐;
			int number = q.poll();
			System.out.print(number + " ");
			
			for(int i=1; i<=N; i++) {
				if(arr[number][i]==1 && check2[i]==false) {
					q.offer(i);
					check2[i] = true;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		N = scanner.nextInt();
		M = scanner.nextInt();
		int V = scanner.nextInt();
		arr = new int[N+1][N+1];
		check1 = new boolean[N+1];
		check2 = new boolean[N+1];
		
		for(int i=0; i<M; i++) {
			int p1 = scanner.nextInt();
			int p2 = scanner.nextInt();
			
			arr[p1][p2] = 1;
			arr[p2][p1] = 1;
		}
		
		dfs(V);
		System.out.println();
		bfs(V);
		
		scanner.close();
	}
}
