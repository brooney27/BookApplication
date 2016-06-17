
public class BookApplication {
	public static void main(String[] args){
		Book book = new Book("Harry Potter");
		book.setAuthor("JK Rowling");
		book.setDescription("Harry does some magic stuff");
		book.setPrice(50);
		book.setIsInStock(true);
		
		book.getDisplayText();
		System.out.println(book.Quote(1));
	}
}
