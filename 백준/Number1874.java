package 백준;

import java.util.Scanner;

class ArrayStack {
	private int s[];
	private int top;
	public ArrayStack(int c) {
		s = new int[c];
		top = -1;
	}
	public int size() {return top+1;}
	public int peek() {
		return s[top];
	}
	
	public void push(int newItem) {
		s[++top] = newItem;
	}
	
	public int pop() {
		int item = s[top];
		s[top--] = 0;
		return item;
	}
}


public class Number1874 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cnt = scanner.nextInt();
		ArrayStack s = new ArrayStack(cnt);
		char c[] = new char[cnt*2];
		int index = 0;
		int number = 1;
		
		for(int i=0; i<cnt; i++) {
			int n = scanner.nextInt();
			
			if(s.size() == 0  || s.peek() <= n) {
				if(s.size() == 0 || s.peek() < n) {
					while(number<=n) {
						s.push(number++);
						c[index++] = '+';
					}
				}
				if(s.peek()==n) {
					s.pop();
					c[index++] = '-';
				}
			}
		}
		
		if(s.size() != 0) {
			System.out.println("NO");
		} else {
			for(int i=0; i<c.length; i++) {
				System.out.println(c[i]);
			}
		}
		scanner.close();
	}
}