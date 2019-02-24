package java_study3;

import java.util.Scanner;
import java.util.ArrayList;

public class Hw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr;
		
		System.out.print("게임에 참가하는 인원 >> ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		arr = new ArrayList<String>();
		
		sc.nextLine();
		
		int i = 0;
		while(i < num) {
			System.out.print("참가자의 이름 입력 >> ");
			arr.add(sc.nextLine());
			
			i++;
		}
		
		System.out.println("시작하는 단어는 abc");
		String start = "abc";
		boolean flag = true;
		
		i = 0;
		while(flag) {
			System.out.print(arr.get(i%num) + " >> ");
			String comp = sc.nextLine();
			
			if(start.charAt(start.length()-1) != comp.charAt(0))
			{
				System.out.println(arr.get(i%num) + "님이 졌습니다.");
				flag = false;
			}
			else {
				start = comp;
			}
			
			i++;
		}
	}

}
