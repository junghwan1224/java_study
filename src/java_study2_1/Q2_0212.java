package java_study2_1;

import java.util.Scanner;

public class Q2_0212 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String sr = sc.nextLine();
		String str = "";
		
		char c = sr.charAt(0);
		str += c;
		int cnt = 1;
		for(int i=1; i<sr.length(); i++) {
			
			if(sr.charAt(i) == c) {
				cnt++;
			}
			else {
				c = sr.charAt(i);
				str += Integer.toString(cnt) + c;
				cnt = 1;
			}
		}
		str += cnt;
		
		System.out.println(str);
	}

}
