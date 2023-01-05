package 백준;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Number2164 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int capacity = scanner.nextInt();
		Queue<Integer> q = new LinkedList<>();
		
		for(int i=1; i<=capacity; i++) {
			q.add(i);
		}
		
		while(q.size()>1) {
			q.poll();
			q.add(q.poll());
		}
		System.out.println(q.poll());
		scanner.close();
	}
}
