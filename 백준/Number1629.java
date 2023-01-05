package 백준;

import java.util.Scanner;

public class Number1629 {
	static long result;
	
	static long pow(int A, int B, int C) {
		
		if(B==1)
			return A % C;
		
		result = pow(A, B/2, C);
		
		if(B%2==0) {
			return result * result % C;
		} else {
			return (result * result % C) * A % C;
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		
		System.out.println(pow(A,B,C));
		scanner.close();
	}
}
