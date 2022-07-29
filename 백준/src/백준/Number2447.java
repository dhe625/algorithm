package 백준;

import java.io.*;

public class Number2447 {
	static char[][] arr;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int number = Integer.parseInt(br.readLine());
		
		arr = new char [number][number];
		
		star(0, 0, number, false);
		
		for (int i = 0; i < number; i++) {
			bw.write(arr[i]);
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}
	
	static void star(int x, int y, int number, boolean blank) {
		// 5번 째 블록일 경우
		if(blank) {
			for (int i = x; i < x + number; i++) {
				for (int j = y; j < y + number; j++) {
					arr[i][j] = ' ';
				}
			}
			return;
		}
		
		// number가 1일 경우
		if (number == 1) {
			arr[x][y] = '*';
			return;
		}
		
		// 9등분이 기본 전제
		int size = number / 3; // 블록의 size
		int count = 0; // 블록의 index
		
		for (int i = x; i < x + number; i += size) {
			for (int j = y; j < y + number; j += size) {
				count++;
				if (count == 5) { // 공백 칸일 경우
					star(i, j, size, true);
				} else {
					star(i, j, size, false);
				}
			}
		}
	}
}