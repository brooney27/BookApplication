
public class Book{
		private String title;
		private String author;
		private String description;
		private double price;
		private boolean isInStock;
		
		//get and set
		public void setTitle(String input){
			title = input;
		}
		public String getTitle(){
			return title;
		}
		
		public void setAuthor(String input){
			author = input;
		}
		public String getAuthor(){
			return author;
		}
		
		public void setDescription(String input){
			description = input;
		}
		public String getDescription(){
			return description;
		}
		
		public void setPrice(double input){
			price = input;
		}
		public double getPrice(){
			return price;
		}
		
		public void setIsInStock(boolean input){
			isInStock = input;
		}
		public boolean getIsInStock(){
			return isInStock;
		}
		
		//constructor
		public Book(){
			title = "blank";
			author = "blank";
			description = "blank";
			price = 0;
			isInStock = false;
		}
		
		public Book(String title){
			this.title = title;
			author = "blank";
			description = "blank";
			price = 0;
			isInStock = false;
		}
		
		public void getDisplayText(){
			System.out.println("Author" + author + "Title: " + title + " Decription: " + description);
		}
		
		public String Quote(int quant){
			if(isInStock)return "" + (price * quant);
			return "Book not in stock";
		}
}