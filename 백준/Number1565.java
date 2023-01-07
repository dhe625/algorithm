package 백준;

import java.util.Scanner;
import java.util.ArrayList;

public class Number1565 {
	static int gcd;
	static int lcm;
	
	static int GCD(int m, int n) {
		int tmp1;
		
		if(m<n) {
			int tmp2 = m;
			m = n;
			n = tmp2;
		}
		
		while(n!=0) {
			tmp1 = m % n;
			m = n;
			n = tmp1;
		}
		return m;
	}
	
	static int LCM(int m, int n) {
		int gcd = GCD(m,n);
		
		int M = m / gcd;
		int N = n / gcd;
		
		return M*N*gcd;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int cnt = 0;
		
		int d = scanner.nextInt();
		int m = scanner.nextInt();
		
		for(int i=0; i<d; i++) {
			int D = scanner.nextInt();
			
			if(i==0) {
				lcm = D;
			} else {
				lcm = LCM(lcm,D);
			}
		}
		
		for(int i=0; i<m; i++) {
			int M = scanner.nextInt();
			
			if(i==0) {
				gcd = M;
			} else {
				gcd = GCD(gcd,M);
			}
		}
		
		for(int i=1; i*i<=gcd; i++) {
			if(gcd%i==0) {
				if(i*i==gcd) {
					list.add(i);
				} else {
					list.add(i);
					list.add(gcd/i);
				}
			}
		}
		
		for(Integer i : list) {
			if(i%lcm==0)
				cnt++;
		}	
		
		System.out.println(cnt);
		scanner.close();
	}
}
