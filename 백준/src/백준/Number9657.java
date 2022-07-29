package 백준;

import java.util.Scanner;

public class Number9657 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt() % 7;
		
		if(N==0 || N==2)
			System.out.println("CY");
		else
			System.out.println("SK");

		scanner.close();
	}
}
