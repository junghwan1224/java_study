package java_study3;

public class CompactDisc extends Product {

	public String albumTitle;
	public String singer;
	
	public CompactDisc(int id) {
		super(id);
	}
	
	public void inputContent() {
		super.inputContent();
		
		System.out.print("앨범 제목 >> ");
		String album = sc.nextLine();
		this.albumTitle = album;
		
		System.out.print("가수 >> ");
		String singer = sc.nextLine();
		this.singer = singer;
	}
	
	public void print() {
		super.print();
		
		System.out.println("앨범 제목 >> " + this.albumTitle);
		System.out.println("가수 >>" + this.singer);
	}
}
