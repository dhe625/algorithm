package 백준;

import java.util.Scanner;
import java.util.Arrays;

public class Number2108 {
	
	/*
	static void swap(int arr[], int min, int n) {
		int a = arr[min];
		arr[min] = arr[n];
		arr[n] = a;
	}
	*/
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int arr[] = new int[N];
		int sum = 0;
		int[] check = new int[8001];
		
		for(int i=0; i<N; i++) {
			int c = scanner.nextInt();
			
			arr[i] = c;
			sum += c;
			check[c + 4000]++;
		}

		/*
		for(int i=0; i<N; i++) {
			int min = i;
			for(int j=i+1; j<N; j++) {
				if(arr[min] > arr[j])
					swap(arr,min,j);
			}
		}
		*/
		
		Arrays.sort(arr);
		
		int max = 0;
		int mode = 0;
		int chance = 2;
		
		/*
		for(int i=0; i<N; i++) {
			int cnt = 0;
			for(int j=i; j<N; j++) {
				if(arr[i]==arr[j])
					cnt++;
			}
			
			if(max < cnt) {
				max = cnt;
				mode = i;
				chance = 2;
			} else if(max == cnt && chance > 1) {
				mode = i;
				chance--;
			}
		}
		*/
		
		for(int i=0; i<8001; i++)
			max = Math.max(max, check[i]);
		
		for(int i=0; i<8001; i++)
			if(check[i] == max && chance > 0) {
				mode = i-4000;
				chance--;
			}
		
		System.out.println((int)Math.round((double)sum/N));
		System.out.println(arr[N/2]);
		System.out.println(mode);
		System.out.println(arr[N-1] - arr[0]);
		
		scanner.close();
	}
}
