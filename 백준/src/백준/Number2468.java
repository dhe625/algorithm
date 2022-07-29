package 백준;

import java.util.Scanner;

public class Number2468 {
	static int count;
	static int map[][];
	static int transMap[][];
	static int[] ud = {1,-1,0,0};
	static int[] lr = {0,0,-1,1};
	static boolean [][] check;
	static int answer = 0;
	static int Max = 1;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		count = scanner.nextInt();
		map = new int[count][count];
		
		for(int i=0; i<count; i++) { // 배열 채우기;
			for(int j=0; j<count; j++) {
				map[i][j] = scanner.nextInt();
			}
		}
		
		for(int i=1;i<101;i++) {
			transMap = new int[count][count]; // 해당되는 지점을 0 또는 1;
			answer = 0;
			check = new boolean[count][count]; // 지점들의 연결 상황;
			
			for(int j=0; j<count; j++) {
				for(int k=0; k<count; k++) {
					if(map[j][k]<=i) {
						transMap[j][k] = 0;
					} else {
						transMap[j][k] = 1;
					}
				}
			}
			
			for(int j=0; j<count; j++) {
				for(int k=0; k<count; k++) {
					if(transMap[j][k]==1 && !check[j][k]) {
						Search(j,k);
						answer++;
					}
				}
			}
			Max = Math.max(Max, answer);
		}
		System.out.print(Max);
		scanner.close();
	}
	
	public static void Search(int x,int y) {
		check[x][y] = true;
		
		for(int i=0; i<4; i++) {
			int nx = x + ud[i]; // 이웃 지점의 x 좌표;
			int ny = y + lr[i]; // 이웃 지점의 y 좌표;
			
			if(nx>=0 && ny>=0 && nx<count && ny<count) { // index 안에서만;
				if(transMap[nx][ny]==1 && !check[nx][ny]) Search(nx,ny); // 연결시키는 recursion;
			}
		}
	}
}
