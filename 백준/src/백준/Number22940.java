package 백준;

import java.util.Scanner;

public class Number22940 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		double arr[][] = new double[count][count+1];
		double answer[] = new double[count];
		
		for(int i=0; i<count; i++) {
			for(int j=0; j<count+1; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}
		
		int index = 0;
		while(true) {
			if(index==count-1) break;
			for(int i=index+1; i<count; i++) {
				double n = arr[index][index] / arr[i][index];
				for(int j=0; j<count+1; j++) {
					arr[i][j] = arr[index][j] - arr[i][j] * n;
				}
			}
			index++;
		}
		
		for(int i=count; i>0; i--) {
			answer[i-1] = arr[i-1][count] / arr[i-1][i-1];
			for(int j=0; j<i-1; j++) {
				arr[j][count] = arr[j][count] - arr[j][i-1] * answer[i-1];
				arr[j][i-1] = 0;
			}
		}
		
		for(int i=0; i<answer.length; i++) {
			if(i==answer.length) {
				System.out.print(Math.round(answer[i]));
			} else {
				System.out.print(Math.round(answer[i]) + " ");
			}
		}
		scanner.close();
	}
}
