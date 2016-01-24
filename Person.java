import java.io.*;
import java.util.*;

public class Person 
{
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
	
	//shared by all subclasses
	protected String name;
	protected long mobile_no;
	protected String email;
	
	void basic_det()throws IOException{
		System.out.println("Enter the basic details:");
		System.out.println("Enter:");
		System.out.println("Name of contact:");
		name= br.readLine();
		System.out.println("Mobile number:");
		mobile_no= Long.parseLong(br.readLine());
		System.out.println("Email ID:");
		email= br.readLine();
	}
}
