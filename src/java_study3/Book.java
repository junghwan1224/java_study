package java_study3;


public class Book extends Product {
	
	protected String isbn;
	protected String author;
	protected String bookTitle;
	
	public Book(int id) {
		super(id);
	}
	
	public void inputContent() {
		super.inputContent();
		
		System.out.print("ISBN >> ");
		String isbn = sc.nextLine();
		this.isbn = isbn;
		
		System.out.print("작가 >> ");
		String author = sc.nextLine();
		this.author = author;
		
		System.out.print("제목 >> ");
		String title = sc.nextLine();
		this.bookTitle = title;
	}
	
	public void print() {
		super.print();
		
		System.out.println("ISBN >> " + this.isbn);
		System.out.println("작가 >> " + this.author);
		System.out.println("제목 >> " + this.bookTitle);
	}

}
