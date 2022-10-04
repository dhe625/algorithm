package 백준;

import java.util.Scanner;

public class Number24398 {
	static int left;
	static int right;
	static int cnt;
	static int K;
	
	static void swap(int[] A, int i, int j) {
		
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
		
		cnt++;
		
		if(cnt==K) {
			left = A[i];
			right = A[j];
		}
	}
	
	static int select(int[] A, int p, int r, int q) {
		
	    if (p == r)
	    	return A[p];
	    
	    int t = partition(A, p, r);
	    int k = t - p + 1;
	    
	    if (q < k)
	    	return select(A, p, t - 1, q);
	    else if (q == k)
	    	return A[t];
	    else
	    	return select(A, t + 1, r, q - k);
	}

	static int partition(int[] A, int p, int r) {
	    int x = A[r];
	    int i = p-1;
	    
	    for(int j=p; j<r; j++) {
	    	if (A[j] <= x) {
	    		swap(A,++i,j);
	    	}
	    }
		
	    if (i+1 != r) {
	    	swap(A,i+1,r);
	   	}
	   	
	    return i+1;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int Q = scanner.nextInt();
		K = scanner.nextInt();
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = scanner.nextInt();
		}
		
		int ans = select(arr, 0, N-1, Q);

		if(cnt<K)
			System.out.println(-1);
		else {
			System.out.println(ans);
			System.out.println(left + " " + right);
		}
		
		scanner.close();
	}
}