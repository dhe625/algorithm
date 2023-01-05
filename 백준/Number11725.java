package 백준;

import java.util.Scanner;

class Node<Key extends Comparable<Key>> {
	public int index = 0;
	private Key item;
	private Node ca[] = new Node[1];
	private Node c;
	public void setChild(Key newItem, Node newNode) {
		item = newItem; c = newNode;
		if(ca[index]!=null) {
			 for(int i=0; i<ca.length; i++) {
				 ca = new Node[index+1];
			 }
		} else {
			ca[index++] = c;
		}
		ca[index++] = c;
	}
}

public class Number11725 {
	public static void main(String[] args) {
	}
}

