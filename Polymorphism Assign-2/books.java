class book extends publication {
	
	 private String author;		
	 //data member of book class only

	        
	void order_copies(int number) {		//increase available copies of book by ordering 
		int x=getCopies()+number;
		setcopies(getCopies()+number);		
		//as data members are private, we access them with the help of methods
		System.out.println("-----------------------------------------------------");
		System.out.println("\n\tORDER SUCESSFUL....");
		System.out.println("\tCOPIES AVAILABLE : "+x);
		System.out.println("-----------------------------------------------------");
	}
	
	void read_book() {			
		//method calling read method of publication class and also reading author
		read_publ();
		System.out.println("-----------------------------------------------------");
		System.out.print("enter author book: ");
		author=sc.next();
		System.out.println("-----------------------------------------------------");
	}
	
	void display_book(){
		System.out.println("-----------------------------------------------------");
		System.out.println("title \tprice \tcopy \tauthor");
		display();//call to display defined in publication class
		System.out.println("\t"+author);
		System.out.println("-----------------------------------------------------");
	}
}

