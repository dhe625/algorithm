package 백준;

import java.io.*;

public class Number4779 {
	static char[] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str; // br.readline()으로 	받기 위함
		while((str = br.readLine()) != null) {
			int power = Integer.parseInt(str);
			int number = (int)Math.pow(3, power);
			
			arr = new char [number];
			
			bar(0,number,false);
				
			for(int i = 0; i < number; i++) {
				bw.write(arr[i]);
			}
			bw.write("\n");
			bw.flush(); // input을 계속 받음으로 bw.close() 하지 않음
		}
	}
	
	static void bar(int x, int number,boolean blank) {
		
		if(blank) {
			for(int i = x; i < x+number; i++) {
				arr[i] = ' ';
			}
			return;
		}
		
		if(number == 1) {
			arr[x] = '-';
			return;
		}
		
		int size = number/3;
		int count = 0;
		
		for(int i = x; i < x + number; i += size) {
			count++;
			if(count == 2) {
				bar(i,size,true);
			} else {
				bar(i,size,false);
			}
		}
	}
}
