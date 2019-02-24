package java_study3;

import java.util.Scanner;
import java.util.ArrayList;

public class Hw2 {

	static int id = 1;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Product> prod = new ArrayList<Product>();
		
		boolean flag = true;
		
		
		while(flag) {
			System.out.print("1.상품추가 | 2.상품조회 | 3.끝내기 >> ");
			
			Scanner sc = new Scanner(System.in);
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				setProduct(prod);
				break;
			case 2:
				readProduct(prod);
				break;
			case 3:
			default:
					flag = false;
					break;
			}
		}
	}
	
	static void setProduct(ArrayList<Product> prod) {
		
		System.out.print(">> 1.책 | 2.음악CD | 3.회화책 >> ");
		Scanner prod_sc = new Scanner(System.in);
		int prod_num = prod_sc.nextInt();
		if(prod.size() >= 10)
			System.out.println("over 10");
		
		else{
			
			switch(prod_num) {
			case 1:
				Book book = new Book(id);
				book.inputContent();
				prod.add(book);
				id++;
				break;
			case 2:
				CompactDisc cd = new CompactDisc(id);
				cd.inputContent();
				prod.add(cd);
				id++;
				break;
			case 3:
				ConversationBook cbook = new ConversationBook(id);
				cbook.inputContent();
				prod.add(cbook);
				id++;
				break;
			default:
				System.out.println("wrong product");
				break;
			}
			
		}
		
	}
	static void readProduct(ArrayList<Product> prod) {
		if(prod.size() == 0)
			System.out.println("No product");
		
		else{
			for(Product pr: prod) {
				pr.print();
				System.out.println();
			}
		}
		
	}

}
