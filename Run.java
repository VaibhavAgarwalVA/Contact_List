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
		
		
		do{
		 
		System.out.println("This setup will guide you to do all actions on your contact list");
		System.out.println("\nEnter: ");
		System.out.println("1 - Create New Contact");
		System.out.println("2 - Delete Existing Contact");
		System.out.println("3 - Display all contacts");
		System.out.println("4 - Display particular contacts");
		System.out.println("5 - Search for a particular contact");
		
		int choice = 0;
		try{
			choice= Integer.parseInt(br.readLine());
		}
		catch(IOException e){
			System.out.println("Please enter a valid integer.");
		}	
		
		switch(choice)
		{
			case 1: System.out.println("\n\n");
					System.out.println("Create New Contact Wizard");
					System.out.println("\n-- Choose a type of contact: ");
					System.out.println("1- Relatives");
					System.out.println("2- Personal Contact");
					System.out.println("3- Professional Contact");
					System.out.println("4- Casual Contact");
					int choice1 = 0;
					try {
						choice1 = Integer.parseInt(br.readLine());
					}
					catch(Exception e){
						System.out.println("Please enter a valid integer.");
					}
					switch(choice1)
					{
						case 1: Relatives cc1= new Relatives();
								rel.add(cc1);
								cc1.basic_det();
								cc1.get_det();
								rel.addElement(cc1);
								//push rel to file
								break;
								
						case 2: Personal cc2= new Personal();
								per.add(cc2);
								cc2.basic_det();
								cc2.get_det();
								per.addElement(cc2);
								//push per to file
								break;
						
						case 3: Professional cc3= new Professional();
								pro.add(cc3);
								cc3.basic_det();
								cc3.get_det();
								pro.addElement(cc3);
								//push pro to file
								break;
						
						case 4: Casual cc4= new Casual();
								cas.add(cc4);
								cc4.basic_det();
								cc4.get_det();
								cas.addElement(cc4);
								//push cas to file
								break;	
						
						default: System.out.println("Please enter valid credentials..\n");
													
					}	
					System.out.println("\n --------------------- \n\n");
					break;
			
			case 2: System.out.println("\n\n");
					System.out.println("Create Delete Contact Wizard");
					System.out.println("\n-- Choose the type of contact to delete: ");
					System.out.println("1- Relatives");
					System.out.println("2- Personal Contact");
					System.out.println("3- Professional Contact");
					System.out.println("4- Casual Contact");
					choice1 = 0;
					try {
						choice1 = Integer.parseInt(br.readLine());
					}
					catch(Exception e){
						System.out.println("Please enter a valid integer.");
					}
					int nn;
					
					switch(choice1)
					{
						case 1: //read rel from file
								System.out.println("Reading... Relative contacts: "+ rel.capacity() + " in size");
								Relatives cc1= new Relatives();
								for(int i=0;i< rel.capacity(); i++){
									cc1= rel.elementAt(i);
									System.out.println("Contact # "+ (i+1));
									cc1.display_basic();
								}
								System.out.println("\n-- Select the number of contact to delete --");
								nn= 0;
								try{
									nn= Integer.parseInt(br.readLine());
								}
								catch(Exception e){
									System.out.println("Please enter a valid integer.");
								}
								rel.remove(nn-1);
								System.out.println("Deleted. Relative contacts: "+ rel.capacity() + " in size");
								break;
								
						case 2: //read per from file
								System.out.println("Reading... Personal contacts: "+ per.capacity() + " in size");
								Personal cc2= new Personal();
								for(int i=0;i< per.capacity(); i++){
									cc2= per.elementAt(i);
									System.out.println("Contact # "+ (i+1));
									cc2.display_basic();
								}
								System.out.println("\n-- Select the number of contact to delete --");
								nn= 0;
								try{
									nn= Integer.parseInt(br.readLine());
								}
								catch(Exception e){
									System.out.println("Please enter a valid integer.");
								}
								per.remove(nn-1);
								System.out.println("Deleted. Personal contacts: "+ per.capacity() + " in size");
								break;
						
						case 3: //read pro from file
								System.out.println("Reading... Professional contacts: "+ pro.capacity() + " in size");
								Professional cc3= new Professional();
								for(int i=0;i< pro.capacity(); i++){
									cc3= pro.elementAt(i);
									System.out.println("Contact # "+ (i+1));
									cc3.display_basic();
								}
								System.out.println("\n-- Select the number of contact to delete --");
								nn= 0;
								try{
									nn= Integer.parseInt(br.readLine());
								}
								catch(Exception e){
									System.out.println("Please enter a valid integer.");
								}
								pro.remove(nn-1);
								System.out.println("Deleted. Professional contacts: "+ pro.capacity() + " in size");
								break;
						
						case 4: //read cas from file
								System.out.println("Reading... Casual contacts: "+ cas.capacity() + " in size");
								Casual cc4= new Casual();
								for(int i=0;i< cas.capacity(); i++){
									cc4= cas.elementAt(i);
									System.out.println("Contact # "+ (i+1));
									cc4.display_basic();
								}
								System.out.println("\n-- Select the number of contact to delete --");
								nn= 0;
								try{
									nn= Integer.parseInt(br.readLine());
								}
								catch(Exception e){
									System.out.println("Please enter a valid integer.");
								}
								cas.remove(nn-1);
								System.out.println("Deleted. Casual contacts: "+ cas.capacity() + " in size");
								break;	
						
						default: System.out.println("Please enter valid credentials..\n");
													
					}	
					System.out.println("\n --------------------- \n\n");
					break;			
					
			
			case 3: System.out.println("Displaying all contacts");
					//read rel from file
					//read pro from file
					//read per from file
					//read cas from file
					System.out.println("\n-- Relatives --\n");
					for(int i = 0; i< rel.capacity(); i++){
						rel.elementAt(i).display_basic();
						rel.elementAt(i).show_det();
					}		
					System.out.println("******************************");
					
					System.out.println("\n-- Personal Contacts --\n");
					for(int i = 0; i< per.capacity(); i++){
						per.elementAt(i).display_basic();
						per.elementAt(i).show_det();
					}		
					System.out.println("******************************");
					
					System.out.println("\n-- Professional Contacts --\n");
					for(int i = 0; i< pro.capacity(); i++){
						pro.elementAt(i).display_basic();
						pro.elementAt(i).show_det();
					}		
					System.out.println("******************************");
					
					System.out.println("\n-- Casual Contacts --\n");
					for(int i = 0; i< cas.capacity(); i++){
						cas.elementAt(i).display_basic();
						cas.elementAt(i).show_det();
					}		
					System.out.println("******************************");
					 
					break;
			
			case 4: System.out.println("\nEnter the type of contacts to be displayed.");
					System.out.println("\n-- Choose the type of contact to delete: ");
					System.out.println("1- Relatives");
					System.out.println("2- Personal Contact");
					System.out.println("3- Professional Contact");
					System.out.println("4- Casual Contact");
					choice1 = 0 ;
					try{
						choice1 = Integer.parseInt(br.readLine());
					}
					catch(Exception e){
						System.out.println("Incorrect input");
					}
					switch(choice1)
					{
						case 1: //read rel from file
								System.out.println("\n-- Relatives --\n");
								for(int i = 0; i< rel.capacity(); i++){
									rel.elementAt(i).display_basic();
									rel.elementAt(i).show_det();
								}		
								System.out.println("******************************");
								break;
								
						case 2: //read per from file
								System.out.println("\n-- Personal Contacts --\n");
								for(int i = 0; i< per.capacity(); i++){
									per.elementAt(i).display_basic();
									per.elementAt(i).show_det();
								}		
								System.out.println("******************************");
								break;
						
						case 3: //read pro from file
								System.out.println("\n-- Professional Contacts --\n");
								for(int i = 0; i< pro.capacity(); i++){
									pro.elementAt(i).display_basic();
									pro.elementAt(i).show_det();
								}		
								System.out.println("******************************");
								break;
						
						case 4: //read cas from file
								System.out.println("\n-- Casual Contacts --\n");
								for(int i = 0; i< cas.capacity(); i++){
									cas.elementAt(i).display_basic();
									cas.elementAt(i).show_det();
								}		
								System.out.println("******************************");
								break;	
						
						default: System.out.println("Please enter valid credentials..\n");
													
					}	
					System.out.println("\n --------------------- \n\n");
					break;	
					
			
			case 5: System.out.println("\nSearch for a contact");
					System.out.println("Press: ");
					System.out.println("1 - Search by name ");
					System.out.println("2 - Search by mobile number");
					System.out.println("3 - Search by email-id");
					int cho;
					String srch;
					boolean vv;
					cho = 0;
					try{
						cho= Integer.parseInt(br.readLine());
					}
					catch(Exception e){
						System.out.println("Incorrect input");
					}
					
					switch(cho)
					{
						case 1: System.out.println("Enter search query.");
								srch = br.readLine();
								//read rel from file
								 vv = false;
								for(int i = 0; i< rel.capacity(); i++){
									boolean v = rel.elementAt(i).search_name(srch);
									if(v == true){
										vv= true;
										System.out.println("-- Match Found !!! --");
										rel.elementAt(i).display_basic();
										rel.elementAt(i).show_det();
									}	
								}
								for(int i = 0; i< pro.capacity(); i++){
									boolean v = pro.elementAt(i).search_name(srch);
									if(v == true){
										vv= true;
										System.out.println("-- Match Found !!! --");
										pro.elementAt(i).display_basic();
										pro.elementAt(i).show_det();
									}	
								}
								for(int i = 0; i< per.capacity(); i++){
									boolean v = per.elementAt(i).search_name(srch);
									if(v == true){
										vv= true;
										System.out.println("-- Match Found !!! --");
										per.elementAt(i).display_basic();
										per.elementAt(i).show_det();
									}	
								}
								for(int i = 0; i< cas.capacity(); i++){
									boolean v = cas.elementAt(i).search_name(srch);
									if(v == true){
										vv= true;
										System.out.println("-- Match Found !!! --");
										cas.elementAt(i).display_basic();
										cas.elementAt(i).show_det();
									}	
								}
								
								if( vv == false )
									System.out.println(" Sorry ! No match found... ");
										
								break;
						
						
						case 2: System.out.println("Enter search query.");
								long src = 0;
								try{
									src = Long.parseLong(br.readLine());
								}
								catch(Exception e) {
									System.out.println("Incorrect Data-type");
								}
								//read rel from file
								vv = false;
								for(int i = 0; i< rel.capacity(); i++){
									boolean v = rel.elementAt(i).search_number(src);
									if(v == true){
										vv= true;
										System.out.println("-- Match Found !!! --");
										rel.elementAt(i).display_basic();
										rel.elementAt(i).show_det();
									}	
								}
								for(int i = 0; i< pro.capacity(); i++){
									boolean v = pro.elementAt(i).search_number(src);
									if(v == true){
										vv= true;
										System.out.println("-- Match Found !!! --");
										pro.elementAt(i).display_basic();
										pro.elementAt(i).show_det();
									}	
								}
								for(int i = 0; i< per.capacity(); i++){
									boolean v = per.elementAt(i).search_number(src);
									if(v == true){
										vv= true;
										System.out.println("-- Match Found !!! --");
										per.elementAt(i).display_basic();
										per.elementAt(i).show_det();
									}	
								}
								for(int i = 0; i< cas.capacity(); i++){
									boolean v = cas.elementAt(i).search_number(src);
									if(v == true){
										vv= true;
										System.out.println("-- Match Found !!! --");
										cas.elementAt(i).display_basic();
										cas.elementAt(i).show_det();
									}	
								}
								
								if( vv == false )
									System.out.println(" Sorry ! No match found... ");
										
								break;
						
						case 3: System.out.println("Enter search query.");
								srch = br.readLine();
								//read rel from file
								vv = false;
								for(int i = 0; i< rel.capacity(); i++){
									boolean v = rel.elementAt(i).search_email(srch);
									if(v == true){
										vv= true;
										System.out.println("-- Match Found !!! --");
										rel.elementAt(i).display_basic();
										rel.elementAt(i).show_det();
									}	
								}
								for(int i = 0; i< pro.capacity(); i++){
									boolean v = pro.elementAt(i).search_email(srch);
									if(v == true){
										vv= true;
										System.out.println("-- Match Found !!! --");
										pro.elementAt(i).display_basic();
										pro.elementAt(i).show_det();
									}	
								}
								for(int i = 0; i< per.capacity(); i++){
									boolean v = per.elementAt(i).search_email(srch);
									if(v == true){
										vv= true;
										System.out.println("-- Match Found !!! --");
										per.elementAt(i).display_basic();
										per.elementAt(i).show_det();
									}	
								}
								for(int i = 0; i< cas.capacity(); i++){
									boolean v = cas.elementAt(i).search_email(srch);
									if(v == true){
										vv= true;
										System.out.println("-- Match Found !!! --");
										cas.elementAt(i).display_basic();
										cas.elementAt(i).show_det();
									}	
								}
								
								if( vv == false )
									System.out.println(" Sorry ! No match found... ");
										
								break;						
										
						default: System.out.println("Incorrect choice");
										
					}
			
			default: System.out.println(" Incorrect choice. Please retry. "); 								 
			
		} //switch ends here
		
	
		System.out.println("Do you wish to perform another task ? (1/0) ");
		int ce = 0;
		try{
			ce = Integer.parseInt(br.readLine());
		}
		catch(Exception e){
			System.out.println("Integer expected.");
		}
		
		if( ce == 0 )
			break;
			
		} while(true);     //end of do-while construct	
		 	
	}   // end of main
}   //end of class
