
public class BookApplication {
	public static void main(String[] args){
		Book book = DataBase.getBook("Java1001");
		
		System.out.println(book.getDisplayText());
		System.out.println(book.Quote(1));
		
	}
}
