package 백준;

import java.util.Scanner;

public class Number1431 {
	
	static void swap(String arr[], int min, int n) {
		String a = arr[min];
		arr[min] = arr[n];
		arr[n] = a;
	}
	
	static int search(String arr[], int min, int n) {
		int A = 0;
		int B = 0;
		
		for(int i=0; i<arr[min].length(); i++) {
			for(int j=1; j<10; j++) {
				if(j == arr[min].charAt(i) - '0')
					A+= j;
				if(j == arr[n].charAt(i) - '0')
					B+= j;
			}
		}
		
		if(A>B) {
			return 1;
		} else if(A==B) {
			return 0;
		} else return -1;
	}
	
	static boolean dic(String arr[], int min, int n) {
		for(int i=0; i<arr[min].length(); i++) {
			if(arr[min].charAt(i) > arr[n].charAt(i)) {
				return true;
			} else if(arr[min].charAt(i) < arr[n].charAt(i)) {
				return false;
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		String arr[] = new String[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = scanner.next();
		}
		
		int min = 0;
		
		while(min<N) {
			
			for(int i=min+1; i<N; i++) {
				if(arr[min].length() < arr[i].length()) {
					continue;
				} else if(arr[min].length() > arr[i].length()) {
					swap(arr, min, i);
				} else if(search(arr, min, i)==1) {
					swap(arr, min, i);
				} else if(search(arr, min, i)==-1) {
					continue;
				} else if(dic(arr, min, i)) {
					swap(arr, min, i);
				}
			}
			
			min++;
		}
		
		for(int i=0; i<N; i++) {
			System.out.println(arr[i]);
		}
		
		scanner.close();
	}
}
