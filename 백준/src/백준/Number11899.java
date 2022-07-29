package 백준;

import java.util.Scanner;

public class Number11899<E> {
	private E s[];
	private int top;
	public Number11899() {
		s = (E[]) new Object[50];
		top = -1;
	}
	
	public int size() {return top+1;}
	
	public E peek() {return s[top];}
	
	public void push(E newItem) {
		s[++top] = newItem;
	}
	
	public E pop() {
		E item = s[top];
		s[top--] = null;
		return item;
	}
	
	public static void main(String[] args) {
		Number11899<String> s = new Number11899<String>();
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
		
		for(int i=0; i<string.length(); i++) {
			
			if(s.size() == 0) {
				s.push(String.valueOf(string.charAt(i)));
				continue;
			}
			
			if(s.peek().equals("(") && String.valueOf(string.charAt(i)).equals(")")) {
				s.pop();
			} else {
				s.push(String.valueOf(string.charAt(i)));
			}
		}
		System.out.println(s.size());
		scanner.close();
	}
}
