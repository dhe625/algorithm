package 백준;

import java.util.Scanner;

public class Number10830 {
	static int[][] result;
	static int[][] arr;
	
	static int[][] dot(int arr1[][], int arr2[][]) {
		int r_index = 0;
		int c_index = 0;
		int length = arr1.length;
		
		int arr[][] = new int [length][length];
			
		for(int i=0; i<length; i++) { // arr1의 x 좌표;
			for(int j=0; j<length; j++) { // arr2의 x 좌표;
				int sum = 0;
				for(int k=0; k<length; k++) { // y 좌표;
					sum += arr1[i][k] * arr2[k][j];
				}
				
				arr[r_index][c_index++] = sum%1000;
			}
			r_index++;
			c_index = 0;
		}
		r_index = c_index = 0;
		return arr;
	}
	
	// 거듭제곱 분할정복;
	static int[][] find(long B) {
		if(B==1)
			return arr;
		
		result = find(B/2);
		
		if(B%2==0)
			return dot(result, result);
		else
			return dot(result, dot(result, arr));
		}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		long B = scanner.nextLong();
		
		arr = new int [N][N];
		int ans[][] = new int [N][N];
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				arr[i][j] = scanner.nextInt()%1000; // 지수가 1인 경우;
			}
		}
		
		ans = find(B);
		
		// print
		for(int i=0; i < N; i++) {
			for(int j=0; j < N; j++) {
				System.out.print(ans[i][j]);
				if(j<N-1)
					System.out.print(" ");
			}
			if(i<N-1)
				System.out.print("\n");
		}
		scanner.close();
	}
}
