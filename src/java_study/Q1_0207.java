package java_study;

public class Q1_0207 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		//int j=0;
		
		while(i<=10) {
			int j=0;
			while(j<=i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
