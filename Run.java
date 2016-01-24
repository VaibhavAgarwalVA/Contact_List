import java.io.*;
import java.util.*;

public class Run
{
	public static Vector<Relatives>	rel= new Vector<Relatives>();
	public static Vector<Personal>	per= new Vector<Personal>();
	public static Vector<Professional>	pro= new Vector<Professional>();
	public static Vector<Casual>	cas= new Vector<Casual>();
	
	public static void main(String args[])throws Exception{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\n\n-- Welcome to Contact details portal --");
		System.out.println("This setup will guide you to do all actions on your contact list");
		
		System.out.println("\n\nEnter: ");
		System.out.println("1 - Create New Contact");
		System.out.println("2 - Delete Existing Contact");
		System.out.println("3 - Display all contacts");
		System.out.println("4 - Display particular contacts");
		System.out.println("5 - Search for a particular contact");
		
		int choice;
		choice= Integer.parseInt(br.readLine());
		switch(choice)
		{
			case 1: System.out.println("\n\n");
					System.out.println("Create New Contact Wizard");
					System.out.println("\n-- Choose a type of contact: ");
					System.out.println("1- Relatives");
					System.out.println("2- Personal Contact");
					System.out.println("3- Professional Contact");
					System.out.println("4- Casual Contact");
					int choice1;
					choice1 = Integer.parseInt(br.readLine());
					
					switch(choice1)
					{
						case 1: Relatives cc1= new Relatives();
								rel.add(cc1);
								cc1.basic_det();
								//
								
								break;
								
						case 2: Personal cc2= new Personal();
								per.add(cc2);
								cc2.basic_det();
								//
								
								break;
						
						case 3: Professional cc3= new Professional();
								pro.add(cc3);
								cc3.basic_det();
								//
								
								break;
						
						case 4: Casual cc4= new Casual();
								cas.add(cc4);
								cc4.basic_det();
								//
								
								break;	
						
						default: System.out.println("Please enter valid credentials..\n");
													
					}	
			
			
		}
		 	
	}
	
}
