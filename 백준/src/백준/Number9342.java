package 백준;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Number9342 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		String arr[] = new String[N];
		
		Pattern p1 = Pattern.compile("[BCDEF]?");
		Pattern p2 = Pattern.compile("A+");
		Pattern p3 = Pattern.compile("F+");
		Pattern p4 = Pattern.compile("C+");
		Pattern p5 = Pattern.compile("[ABDEF]?");
		
		
		for(int i=0; i<N; i++) {
			String s = scanner.next();
			
			Matcher m1 = p1.matcher(s);
			Matcher m2 = p2.matcher(s);
			Matcher m3 = p3.matcher(s);
			Matcher m4 = p4.matcher(s);
			Matcher m5 = p5.matcher(s);
			
			if(m1.find()) {
				if(m2.find() && m3.find()) {
					if(m2.end() == m3.start()) {
						if(m4.find()) {
							if(m3.end() == m4.start()) {
								if(m5.find(m4.end()) && m4.end()==s.length()) {
									arr[i] = "Infected!";
									continue;
								}
							}
						}
					}
				}
			}
			
			arr[i] = "Good";
		}
		
		for(int i=0; i<N; i++) {
			System.out.println(arr[i]);
		}
		
		scanner.close();
	}
}
