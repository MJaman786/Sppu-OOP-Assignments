class magazine extends publication{			
	//magazine class is inherited from publication
	
	private int order_qty;	//data members
	private String issue_date;
	
	void receive_issue(String new_issue_date) {		
		//method to issue new or upgraded magazine
		System.out.println("-----------------------------------------------------");
		System.out.println("ENTER NEW COPIES ORDERED: ");
		order_qty=sc.nextInt();			
	
		setcopies(order_qty);		
		//setting values to copies by setter method
		
		issue_date=new_issue_date;
		System.out.println("-----------------------------------------------------");
		System.out.println("\tTHE MAGAZINE "+gettitle()+" \n\t WITH ISSUE DATE "+issue_date+"AVAILABLE");
		System.out.println("-----------------------------------------------------");
	}
	
	void read_mag() {		//method to read or input magazine details
		read_publ();		//call to read method defined in publication class
		System.out.println("-----------------------------------------------------");
		System.out.print("Enter THe Current Issue Date [dd/mm/yyyy]");
		issue_date=sc.next();
		System.out.println("-----------------------------------------------------");
	}
	
	void display_mag() {		//display method to display 
		System.out.println("-----------------------------------------------------");
		System.out.println("title \tprice \tcopy \tdate");
		display();
		System.out.println("\t"+issue_date);
		System.out.println("-----------------------------------------------------");
	}
}