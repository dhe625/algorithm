package 백준;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Number10997 {
	static char arr[][];
	
	static void star(int x, int y,int N) {
		
		if(N==1) {
			arr = new char[1][1];
			arr[x][y] = '*';
			return;
		}
		
		if(N>=2) {
			for(int i=x; i<x+4*N-1; i++) { // row
				for(int j=y; j<y+4*N-3; j++) { // col
					if(i==x || i==x+4*N-2 || j==y || j==y+4*N-4) { // 테두리
						if(i==x+1 && j>y+1) {
							continue;
						} else arr[i][j] = '*';
					} else {
						if(i==x+2 && j==y+4*N-5) {
							arr[i][j] = '*'; // 꺽인 별 하나
						} else {
							if(i!=x+1)
								arr[i][j] = ' ';
						}
					}
				}
			}
		}
		
		if(N==2) {
			for(int i=0; i<=2; i++) { // 중심 별 3개
				arr[x+2+i][y+2] = '*';
			}
			return;
		}
		
		star(x+2,y+2,N-1);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		
		arr = new char [4*N-1][4*N-3];
		
		star(0,0,N);
		
		for (int i = 0; i < arr.length; i++) {
			if(i!=0)
				bw.write("\n");
			bw.write(arr[i]);
		}
		bw.flush();
		bw.close();
	}
}
