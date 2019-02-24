package java_study2_1;

import java.util.Scanner;

public class Q1_0212 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String sr = sc.nextLine();
		
		System.out.println(sr.replaceAll("\\D", ""));
	}

}
