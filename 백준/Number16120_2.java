package 백준;

import java.io.InputStreamReader;
import java.io.BufferedReader;

class Stack {
	private char s[];
	private int top;
	public Stack(int size) {
		s = new char[size];
		top = -1;
	}
	
	public int size() {return top+1;}
	
	public void push(char newItem) {
		s[++top] = newItem;
	}
	
	public char pop() {
		char item = s[top];
		s[top--] = 0;
		return item;
	}
}

public class Number16120_2 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		Stack st = new Stack(s.length());
		
		for(int i=0; i<s.length(); i++) {
			char temp = s.charAt(i);
			
			if(temp=='P') st.push('P');
			else {
				if(st.size()>=2 && i<s.length()-1 && s.charAt(i+1)=='P') {
					st.pop();
					st.pop();
				} else {
					System.out.println("NP");
					return;
				}
			}
		}
		if(st.size()==1) System.out.println("PPAP");
		else System.out.println("NP");
	}
}
