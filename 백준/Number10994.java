package 백준;

import java.io.*;

public class Number10994 {
	static char[][] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int number = Integer.parseInt(br.readLine());
		int length = 4*number-3;
		
		arr = new char [length][length];
		
		star(0, 0, number);
		
		for (int i = 0; i < length; i++) {
			bw.write(arr[i]);
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}
	
	static void star(int x, int y, int number) {
		
		int length = 4*number-3;
		
		if (length == 1) {
			arr[x][y] = '*';
			return;
		}
		
		for (int i = x; i < x + length; i += 1) {
			for (int j = y; j < y + length; j += 1) {
				if (i == x || i == x+length-1 || j == y || j == x+length-1) {
					arr[i][j] = '*';
				} else {
					arr[i][j] = ' ';
				}
			}
		}
		star(x+2,y+2,number-1);
	}
}
