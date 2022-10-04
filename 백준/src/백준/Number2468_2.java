package 백준;

import java.util.Scanner;

public class Number2468_2 {
	static boolean[][] checked;
	static int[][] loc;
	
	static int dfs(int[][] arr, int i, int j, int height, int N) {
		checked[i][j] = true;
		
		for(int k=0; k<4; k++) {
			int new_i = i + loc[k][0];
			int new_j = j + loc[k][1];
			
			if(new_i<0 || new_j<0 || new_i>N-1 || new_j>N-1)
				continue;
			
			if(checked[new_i][new_j])
				continue;
			
			if(arr[new_i][new_j] > height)
				dfs(arr, new_i, new_j, height, N);
		}
		return 1;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[][] arr = new int[N][N];
		int max_h = -1;
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				arr[i][j] = scanner.nextInt();
				
				max_h = Math.max(arr[i][j], max_h);
			}
		}
		
		loc = new int[4][2];
		loc[0][0] = 1; loc[0][1] = 0;
		loc[1][0] = -1; loc[1][1] = 0;
		loc[2][0] = 0; loc[2][1] = 1;
		loc[3][0] = 0; loc[3][1] = -1;
		
		int ans = 0;
		for(int height=0; height<=max_h; height++) {
			checked = new boolean[N][N];
			int cnt = 0;
			
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					if(!checked[i][j] && arr[i][j] > height) {
						cnt+=dfs(arr, i, j, height, N);
					}
				}
			}
			ans = Math.max(ans, cnt);
		}
		
		System.out.println(ans);	
		scanner.close();
	}
}
