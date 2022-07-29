package 백준;

import java.util.Scanner;

public class Number15828 <E> {
	private E[] q;
	private int front, rear, length, q_size;
	public Number15828(int size) {
		q = (E[]) new Object[size];
		front = rear = length = 0;
		q_size = size;
	}
	
	public int length() {return length;}
	
	public void add(E newItem) {
		if(q_size != length) {
			rear = (rear+1) % q_size;
			q[rear] = newItem;
			length++;
		}
	}
	
	public E remove() {
		front = (front+1) % q_size;
		E item = q[front];
		q[front] = null;
		length--;
		return item;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		Number15828<Integer> q = new Number15828<Integer>(size);
		
		while(true) {
			int data = scanner.nextInt();
			
			if(data == -1) {
				break;
			} else if(data == 0) {
				q.remove();
			} else {
				q.add(data);
			}
		}
		
		if(q.length == 0) {
			System.out.println("empty");
		} else {
			while(true) {
				System.out.print(q.remove());
				if(q.length != 0) {
					System.out.print(" ");
				} else {
					break;
				}
			}
		}
		scanner.close();
	}
}