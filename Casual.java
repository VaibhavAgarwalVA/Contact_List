import java.io.*;
import java.util.*;

public final class Casual extends Person {
	private String when;
	private String where;
	private String how;
	private String info;
	
	//methods
	void get_det()
	{
		try{
			System.out.println("\n\nEnter the details for your casual contact.");
			System.out.print("Enter in a few words when you met: ");
			when = br.readLine();
			System.out.print("\nNow please enter where you first met: ");
			where = br.readLine();
			System.out.print("\nEnter in a few words how you met: ");
			how = br.readLine();
			System.out.print("\nEnter other useful information you wish to save: ");
			info = br.readLine();
		}
		catch(IOException e){
			System.out.println("Please enter all credentials in a string format.");
		}	
	}
	
	void show_det()
	{
		System.out.println("When you met: "+ when);	
		System.out.println("Where you met: "+ where);	
		System.out.println("How you met: "+ how);	
		System.out.println("Additional Info: "+ info);
		System.out.println("--------------------------------------------");		
	}
	
}
