import java.io.*;
import java.util.*;

public class Person 
{
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
	
	//shared by all subclasses
	protected String name;
	protected long mobile_no;
	protected String email;
	
	//methods
	void basic_det(){
		try{
			System.out.println("\n\nEnter the basic details first.");
			System.out.print("Name of contact: ");
			name= br.readLine();
			System.out.print("\nMobile number: ");
			mobile_no= Long.parseLong(br.readLine());
			System.out.print("\nEmail ID: ");
			email= br.readLine();
		}
		catch(Exception e){
			System.out.println("Please enter valid credentials in the apt format"); 
		}
	}
	
	void display_basic(){
		System.out.println("Name : "+ name);
		System.out.println("Mobile Number : "+ mobile_no);
		System.out.println("Email ID : "+ email);
		System.out.println("-----------------------------");
	}
	
	boolean search_name(String n) {
		if(n.equals(name) == true)
			return true;
		return false;	
	}
	
	boolean search_number(long n) {
		if( (n==mobile_no) == true)
			return true;
		return false;	
	}
	
	boolean search_email(String n) {
		if(n.equals(email) == true)
			return true;
		return false;	
	}
}
