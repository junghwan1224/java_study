package java_study;
import java.util.Random;
import java.util.Scanner;

public class Q3_0207 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
//		System.out.print(n);
		int[] lotto = new int[6];
		String str = "[";
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<6; j++) {
				lotto[i] = random.nextInt(45)+1;
				if (j == 5) {
					str += String.valueOf(lotto[i])+"";
				}
				else {
					str += String.valueOf(lotto[i])+", ";
				}
			}
			str += "]";
			
			System.out.println((i+1) + "번째 : " + str);
			str = "[";
		}
	}

}
