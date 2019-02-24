package java_study3;

public class ConversationBook extends Book {

	protected String lang;
	
	public ConversationBook(int id) {
		super(id);
	}
	
	public void inputContent() {
		super.inputContent();
		
		System.out.print("언어 >> ");
		String lang = sc.nextLine();
		this.lang = lang;
	}
	
	public void print() {
		super.print();
		
		System.out.println("언어 >> " + this.lang);
	}
}
