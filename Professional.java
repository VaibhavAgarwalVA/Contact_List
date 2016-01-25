import java.io.*;
import java.util.*;

public final class Professional extends Person
{
	private String interests;
	
	//methods
	void get_det()
	{
		try{
			System.out.println("\n\nEnter the details for your professional contact.");
			System.out.print("Enter your common professional interests: ");
			interests = br.readLine();
		}
		catch(IOException e){
			System.out.println("Please enter all credentials in a string format.");
		}	
	}
	
	void show_det()
	{
		System.out.println("Common Professional Interests: "+ interests);	
		System.out.println("--------------------------------------------");		
	}
}
