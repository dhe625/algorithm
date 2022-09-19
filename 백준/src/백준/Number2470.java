package 백준;

import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Number2470 {
	static StringTokenizer st;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int [] arr = new int[N];
		int min = 2000000000;
		int front = 0; int rear = 0;
		
		st = new StringTokenizer(br.readLine(), " ");
		
		int cnt = 0;
		while(st.hasMoreTokens()) {
			arr[cnt++] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int left = 0;
		int right = N-1;
		
		while(left < right) {
			int sum = arr[left] + arr[right];
			
			if(Math.abs(sum) < min) {
				min = Math.abs(sum);
				front = arr[left];
				rear = arr[right];
			}
			
			if(sum > 0)
				right--;
			else
				left++;
		}

		bw.write(front + " " + rear);
		bw.flush();
		br.close();
		bw.close();
	}
}
