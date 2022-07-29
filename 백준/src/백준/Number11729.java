package 백준;

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Number11729 {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		bw.write((int)(Math.pow(2,number)-1)+"\n");
		top(number,1,2,3);
		bw.flush();
		bw.close();
		scanner.close();
	}
	public static void top(int n, int start, int mid, int to) throws IOException {
		if(n==1) {
			bw.write(start + " " + to + "\n");
			return;
		}
		top(n-1,start,to,mid);
		bw.write(start + " " + to + "\n");
		top(n-1,mid,start,to);
	}
}