import java.util.*;
public class Main {

	public static void main(String[] args) {		
		Scanner sc=new Scanner(System.in);
		book b=new book();
		magazine m=new magazine();
		
	int outer;	
	do {
		System.out.println("-----------------------------------------------------");
			System.out.println("\n\n\tCHOOSE ONE OF THE FOLLOWING....\n\n\t1.BOOK \t\t\t2.MAGAZINE"
					+ "\n\n\t3.TOTAL SALE AMOUNT\t4.REVENUE OF PUBLICATION\n\n");
			System.out.print("Choice::");
			System.out.println("-----------------------------------------------------");
			int k=sc.nextInt();
			int a;
			aa:
				
			if(k==1) {
				
				
				do {
				int c;
				System.out.print("\n\t\tMENU   FOR   BOOK\n");
				System.out.print("\t1.read book \t\t2.display \n\t3.sale copies \t\t4.order copies");
				System.out.print("\n\tChoice::");
				c=sc.nextInt();
				switch (c){
				
				case 1:
					System.out.println("==============================================================================\n");
					b.read_book();
					System.out.println("==============================================================================\n");
					break;
				case 2:
					System.out.println("==============================================================================\n");
					b.display_book();
					System.out.println("==============================================================================\n");
					break;
				case 3:
					System.out.println("==============================================================================\n");
					System.out.print("HOW MANY COPIES YOU(for customer) WANT : ");
					int n1=sc.nextInt();
					b.sale_copy(n1);
					System.out.println("==============================================================================\n");
					break;
				case 4:
					System.out.println("==============================================================================\n");
					System.out.print("ENTER COPIES WANT TO ORDER(for shop): ");
					int n2=sc.nextInt();
					b.order_copies(n2);
					System.out.println("==============================================================================\n");
					break;
				default:
					System.out.println("invalid");
					
				}
				System.out.println("Do you want to continue with book section[1/0]\n\t1.YES \t\t0.NO");
				System.out.print("\tChoice::");
				a=sc.nextInt();
				if(a==0)
					 break aa;
			
			}while(a==1);
				
			}
			
			else if(k==2)
			{
				
				
				mm:
				do {
				System.out.println("\n\t\tMENU   FOR   MAGAZINE...\n\n\t1.READ  \t\t2.DISPLAY \n\t3.SALE MAGAZINE COPIES \t4.RECEIVE NEW ISSUE\n");
				int d;
				System.out.print("\n\tChoice::");
				d=sc.nextInt();
				switch(d) {
				case 1:
					System.out.println("==============================================================================\n");
					m.read_mag();
					System.out.println("==============================================================================\n");
					break;
				case 2:
					System.out.println("==============================================================================\n");
					m.display_mag();
					System.out.println("==============================================================================\n");
					break;
				case 3:
					System.out.println("==============================================================================\n");
					System.out.println("HOW MANY COPIES YOU WANT(customer)??  ");
					int n3=sc.nextInt();
					m.sale_copy(n3);
					System.out.println("==============================================================================\n");
					break;
				case 4:
					System.out.println("==============================================================================\n");
					System.out.println("ENTER THE NEW ISSUE DATE [dd/mm/yyyy]: ");
					String date=sc.next();
					m.receive_issue(date);
					System.out.println("==============================================================================\n");
					break;
				}
				System.out.println("DO YOU WANT TO CONTINUE WITH MAGAZINE SECTION [1/0]\n\t1.YES\t0.NO");
				System.out.print("\tChoice::");
				a=sc.nextInt();
				if(a==0)
					break mm;
				
			}while(a==1);
			}
			
			else if (k==3) {
				System.out.println("\n\tTOTAL SALE AMOUNT IS(to be paid by customer)  = "+(b.getTotal()+m.getTotal())+ "  ");
			}
			
			else if(k==4) {
				System.out.println("\n\tTOTAL REVENUE OF PUBLICATION IS  :  "+ (b.getCopies()*b.getprice() + m.getCopies()*m.getprice()));
			}
			
			else
				System.out.println("invalid key....");
			System.out.println("DO YOU WANT TO CONTINUE WITH PUBLICATION???\n\t1.CONTINUE \t0.TERMINATE");
			outer=sc.nextInt();
	}while(outer!=0);
	sc.close();
	}
}
/*
-----------------------------------------------------


	CHOOSE ONE OF THE FOLLOWING....

	1.BOOK 			2.MAGAZINE

	3.TOTAL SALE AMOUNT	4.REVENUE OF PUBLICATION


Choice::-----------------------------------------------------
1

		MENU   FOR   BOOK
	1.read book 		2.display 
	3.sale copies 		4.order copies
	Choice::1
==============================================================================

		-----------------------------------------------------
		Enter title : Wings-of-Fire
		Enter price:  450
		Enter copies: 2
		-----------------------------------------------------
-----------------------------------------------------
enter author book: Abdul-kalam
-----------------------------------------------------
==============================================================================

Do you want to continue with book section[1/0]
	1.YES 		0.NO
	Choice::0
DO YOU WANT TO CONTINUE WITH PUBLICATION???
	1.CONTINUE 	0.TERMINATE
0
*/
