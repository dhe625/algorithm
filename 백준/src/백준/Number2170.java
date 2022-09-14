package 백준;

import java.io.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.StringTokenizer;

class Line {
	int start, end;
	
	public Line(int start, int end) {
		this.start = start;
		this.end = end;
	}
}

public class Number2170 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
		LinkedList<Line> arr = new LinkedList<Line>();
		StringTokenizer st;
		int ans = 0;
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			
			arr.add(new Line(start, end));
		}
		
		Collections.sort(arr, new Comparator<Line>() { // Tim sort를 사용하여 Arrays.sort()보다 빠름;
			@Override
			public int compare(Line o1, Line o2) {
				if(o1.start == o2.start)
					return o1.end - o2.end;
				else
					return o1.start - o2.start;
			}
		});
		
		int start = arr.get(0).start;
		int end = arr.get(0).end;
		arr.remove(0);
		
		for(Line line : arr) {
			if(line.start > end) {
				ans += end-start;
				start = line.start;
				end = line.end;
			} else if(line.end > end) {
				end = line.end;
			}
		}
		
		ans += end-start;
		
		bw.write(ans + "\n");
	    bw.flush();
	    br.close();
	    bw.close();
	}
}
