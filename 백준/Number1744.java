package 백준;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Number1744 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		List<Integer> over = new ArrayList<>();
		List<Integer> under = new ArrayList<>();
		int ans = 0;
		
		for(int i=0; i<N; i++) {
			Integer num = scanner.nextInt();
			
			if(num>0) {
				over.add(num);
			} else {
				under.add(num);
			}
		}

		Collections.sort(over, Collections.reverseOrder());
		Collections.sort(under);
		
		int i = 0;
		
		while(i < over.size()) {
			if(i+1 < over.size() && over.get(i)!=1 && over.get(i+1)!=1)
				ans += over.get(i++)*over.get(i++);
			else
				ans += over.get(i++);
		}
		
		i = 0;
		
		while(i < under.size()) {
			if(i+1 < under.size())
				ans += under.get(i++)*under.get(i++);
			else
				ans += under.get(i++);
		}
		
		System.out.println(ans);
		scanner.close();
	}
}
