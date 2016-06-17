import java.text.NumberFormat;
import java.util.Scanner;

public class Invoice {
	private Book[] books = new Book[100];
	private int[] amount = new int[100];
	private boolean[] taxable = new boolean[100];
	private int count = 0;
	
	public Invoice(){
		Scanner in = new Scanner(System.in);
		String input = "";
		while(input!="done"){
			
			//get book
			System.out.println("Enter item code: ");
			input = in.next();
			if(input.equals("done"))break;
			books[count] = DataBase.getBook(input);

			//get quantity
			System.out.println("Enter quantity: ");
			input = in.next();
			amount[count] = Integer.parseInt(input);
			
			//get taxable
			System.out.println("Enter taxable(t/f): ");
			input = in.next();
			if(input.equals("t"))taxable[count]=true;
			else taxable[count]=false;
			count++;
		}
		in.close();
	}
	
	public void PrintInvoice(){
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		//print headings
		System.out.println("Item\tQuantity\tDescription\t\tPrice\tTotal");
		//print line items
		double taxed = 0;
		double notax = 0;
		for(int i = 0; i < count; i++){
			Book curr=books[i];
			double currP = books[i].getPrice();
			int currQ = amount[i];
			if(taxable[i])taxed+=currP*currQ;
			else notax += currP*currQ;
			System.out.println(curr.getTitle()+"\t"+currQ+"\t"+curr.getDescription()+currency.format(currP)+"\t"+currency.format(currQ*currP));
		}
		System.out.println("Taxable total: " + currency.format(taxed));
		System.out.println("Nontaxable total: " + currency.format(notax));
		System.out.println("Taxed amount: " + currency.format(taxed*.06));
		System.out.println("Grand Total: " + currency.format((taxed*1.06)+notax));
	}
}
