import java.io.*;
import java.util.*;

public final class Relatives extends Person
{
	private String dob;
	private String last_meet;
	
	//methods
	void get_det()
	{
		try{
			System.out.println("\n\nEnter the details for your relative.");
			System.out.print("Enter the date of birth of the contact: ");
			dob = br.readLine();
			System.out.print("\nNow please enter the date of your last meeting: ");
			last_meet = br.readLine();
		}
		catch(IOException e){
			System.out.println("Please enter all credentials in a string format.");
		}	
	}
	
	void show_det()
	{
		System.out.println("Date of birth: "+ dob);	
		System.out.println("Last meeting date: "+ last_meet);	
		System.out.println("--------------------------------------------");		
	}
}

