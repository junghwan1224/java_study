package java_study4;

import java.util.Scanner;

public class Hw2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		int cnt[] = new int[26];
		for(int i=0; i<26; i++)
			cnt[i] = 0;
		
		
		for(int i=0; i<str.length(); i++){
			String s;
			if(i == str.length()-1)
				s = str.substring(i);
			else
				s = str.substring(i, i+1);
			
			char[] cc = s.toUpperCase().toCharArray();
			
			for(char c='A'; c<='Z'; c++) {
				if(cc[0] == c)
					cnt[(int)(c-65)]++;
			}
		}
		
		for(char c='A'; c<='Z'; c++) {
			System.out.print(c + " ");
			for(int i=0; i<cnt[(int)(c-65)]; i++) {
				System.out.print("-");
			}
			System.out.println();
		}
		
	}

}
