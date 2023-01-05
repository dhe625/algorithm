package 백준;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Number13015 {
	static char[][] arr;
	
	static void star(int x,int y, int N_X, int N_Y, int N) {
		
		for (int i = y; i < N_Y; i++) {
			for (int j = x; j < N_X ; j++) {
				
				if(i == 0 || i == 2*(N-1)) { // 가장자리 case
					if(0<=j && j<N || 4*N-3-N<=j && j<4*N-3) {
						arr[i][j] = '*';
					} else {
						arr[i][j] = ' ';
					}
				} else if(i == y || i == N_Y-1) { // 내부 case
					if(j == x || j == x+(N-1) || j == N_X-(N-1)-1 || j == N_X-1) {
						arr[i][j] = '*';
					} else {
						arr[i][j] = ' ';
					}
				} else if(j < N){
					arr[i][j] = ' ';
				}
			}
		}
		
		if(N_Y==1) return;
		
		star(x+1,y+1,N_X-1,N_Y-1,N);
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		
		arr = new char [N*2-1][4*N-3];
		
		star(0,0,4*N-3,2*N-1,N);
		
		for (int i = 0; i < N*2-1; i++) {
			bw.write(arr[i]);
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}
}
