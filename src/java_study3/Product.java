package java_study3;

import java.util.Scanner;

public class Product {
	
	protected int id;
	protected String description;
	protected String production;
	protected int price;
	
	public Product(int id) {
		this.id = id;
	}
	
	Scanner sc = new Scanner(System.in);
	
	public void inputContent() {
//		Scanner sc = new Scanner(System.in);
		
		System.out.print("상품 설명 >> ");
		String desc = sc.nextLine();
		this.description = desc;
		
		System.out.print("생산자 >> ");
		String production = sc.nextLine();
		this.production = production;
		
		System.out.print("가격 >> ");
		int price = sc.nextInt();
		this.price = price;
		
		sc.nextLine();
		
	}
	
	public void print() {
		System.out.println("상품 설명 >> " + this.description);
		System.out.println("생산자 >> " + this.production);
		System.out.println("가격 >> " + this.price);
	}
}
