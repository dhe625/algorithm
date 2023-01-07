package 백준;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Number11725 {	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		ArrayList<Integer>[] list = new ArrayList[N+1];
		Queue<Integer> q = new LinkedList<Integer>();
		int[] arr = new int[N+1];
		
		for(int i=1; i<=N; i++) {
			list[i] = new ArrayList<Integer>();
		}
		
		for(int i=1; i<N; i++) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			
			list[x].add(y);
			list[y].add(x);
		}
		
		arr[1]=1;
		while(!list[1].isEmpty()) {
			Integer children = list[1].get(0);
			list[1].remove(0);
			q.offer(children);
			arr[children] = 1;
		}
		
		while(!q.isEmpty()) {
			Integer parent = q.poll();
			
			while(!list[parent].isEmpty()) {
				Integer children = list[parent].get(0);
				list[parent].remove(0);
				if(arr[children]==0) {
					q.offer(children);
					arr[children] = parent;
				}
			}
		}
		
		for(int i=2; i<=N; i++) {
			System.out.println(arr[i]);
		}
		scanner.close();
	}
}
