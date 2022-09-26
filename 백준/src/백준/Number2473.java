package 백준;

import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Number2473 {
	static StringTokenizer st;
	static int front; static int center; static int rear;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int [] arr = new int[N];
		
		st = new StringTokenizer(br.readLine(), " ");
		
		int cnt = 0;
		while(st.hasMoreTokens()) {
			arr[cnt++] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		long min = 3000000001L;
		
		for(int i=0; i<N-2; i++) {
			int left = i+1;
			int right = N-1;
			
			while(left < right) {
				long sum = (long) arr[i] + arr[left] + arr[right];
				
				if(Math.abs(sum) < min) {
					min = Math.abs(sum);
					
					front = arr[i];
					center = arr[left];
					rear = arr[right];
				}
				
				if(sum > 0)
					right--;
				else
					left++;
			}
		}

		bw.write(front + " " + center + " " + rear);
		bw.flush();
		br.close();
		bw.close();
	}
}