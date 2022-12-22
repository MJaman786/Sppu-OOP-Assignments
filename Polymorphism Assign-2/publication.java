//Problem Statement::
/*
Identify commonalities and differences between Publication, Book and Magazine classes. 
Title, Price, Copies are common instance variables and saleCopy is common method.
The differences are, Bookclass has author and orderCopies().
Magazine Class has data members as orderQty, Current issue and method receiveNewissue().Write a program 
to find how many copies of the given books are ordered and display total sale of publication.
*/


import java.util.*;

class publication {
	//private data members
	private  String title;
	private int price;
	private  int copies;
	private int total;

	
	Scanner sc=new Scanner(System.in);//scanner class object
		
	public void settitle(String title) {			
		//setter method for title
		this.title=title;
	}
	

	public void setcopies(int copies) {			
		//setter method for copies
		this.copies=copies;
	}
	
	
	public String gettitle() {			
		//getter method for title
		return title;
	}
	
	public int getTotal() {	
		//getter method for price
		return total;
	}
	
	public int getCopies() {			
		//getter method for copies
		return copies;
	}
	
	public int getprice() {
		return price;
	}
	

	void read_publ() {				
		//read or input method for common data members of magazine and book class
		System.out.println("\t\t-----------------------------------------------------");		
		System.out.print("\t\tEnter title : ");
		title=sc.next();
		System.out.print("\t\tEnter price:  ");
		price=sc.nextInt();
		System.out.print("\t\tEnter copies: ");
		copies=sc.nextInt();
		System.out.println("\t\t-----------------------------------------------------");
	}
	
	void display() {	
		int i=0;
		i++;
		//display method for common data members of book and magazine class
		System.out.println("\t------------------- Detail "+i+ "-------------------------");
		System.out.print(title+"\t"+price+"\t"+copies);
		System.out.println("\t\t-----------------------------------------------------");
	}
	
	
	
	void sale_copy(int number) {			
		//common method to sale book or magazine and generate bill
		if (number <= copies)		
		//if customer needed copies are less than available
		{
			copies=copies-number;
			total=total + number*price;
			System.out.println("\t-----------------------------------------------------");
			System.out.println("\tYOU PURCHASED  "+number +"  COPIES \n\tYOU HAVE TO PAY :  "+(price*number));
			System.out.println("\t-----------------------------------------------------");
		}
		else			//if customer needs copies more than available in stock
			System.out.println("======= INSUFFICIENT STOCK!!! =========");
	}

}