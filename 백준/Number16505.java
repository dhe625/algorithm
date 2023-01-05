package 백준;

import java.io.*;
import java.util.*;

public class Number16505 {
	static char[][] arr;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int power = Integer.parseInt(br.readLine());
		int number = (int)Math.pow(2, power);
		
		arr = new char[number][];
		int count = number;
		for(int i=0; i<number; i++) {
			arr[i] = new char [number-i];
			count--;
		} // 계단식 배열 생성
		
		for(int i=0; i<number; i++) {
			Arrays.fill(arr[i], ' '); // 배열의 원소를 ' '로 채움
		}
		
		star(0, 0, number);
		
		for(int i = 0; i < number; i++) {
			bw.write(arr[i]);
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}
		
	static void star(int x, int y, int size) {
		
		if(size == 1) {
			arr[x][y] = '*';
			return;
		}
		
		size = size/2;
		star(x,y,size);
		star(x,y+size,size);
		star(x+size,y,size);
	}
}
