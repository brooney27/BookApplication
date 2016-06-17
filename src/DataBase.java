
public class DataBase {
	public Book getBook(String code){
		Book book = new Book();
		switch(code){
		case "Java1001": book.setTitle("Head First Java");
			book.setAuthor("Kathy Sierra and Bert Bates");
			book.setDescription("Easy to read Java workbook");
			book.setPrice(47.5);
			break;
		case "Java1002": book.setTitle("Thinking in Java");
			book.setAuthor("Bruce Eckel");
			book.setDescription("Details about Java under the hood");
			book.setPrice(20);
			break;
		case "Orcl1003": book.setTitle("(OCP: Oracle Certified Professional Java SE");
			book.setAuthor("Jeanne Boyarsky");
			book.setDescription("Everything you need to know in one place");
			book.setPrice(45);
			break;
		case "Python1004": book.setTitle("Automate the Boring Stuff with Python");
			book.setAuthor("Al Sweigart");
			book.setDescription("Fun with Python");
			book.setPrice(10.5);
			break;
		case "Zombie1005": book.setTitle("The Maker's Guide to the Zombie Apocalypse");
			book.setAuthor("Simon Monk");
			book.setDescription("Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi");
			book.setPrice(16.5);
			break;
		case "Rasp1006": book.setTitle("Raspberry Pi Projects for the Evil Genius");
			book.setAuthor("Donald Norris");
			book.setDescription("A dozen fiendishly fun projects for the Raspberry Pi!");
			book.setPrice(14.75);
			break;
		}
		
		
		
		return book;
	}
}
