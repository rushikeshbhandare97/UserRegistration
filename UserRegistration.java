package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	
     	   public static void main( String[] args ) {
		      System.out.println(firstName("Rushikesh"));
		      System.out.println(lastName("Bhandare"));
		      
		      
		      Scanner sc = new Scanner(System.in);
		      System.out.println("Enter your email id: ");
		      String phone = sc.next();
		      //Regular expression to accept valid email id
		      String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
		      //Creating a pattern object
		      Pattern pattern = Pattern.compile(regex);
		      //Creating a Matcher object
		      Matcher matcher = pattern.matcher(phone);
		      //Verifying whether given phone number is valid
		      
		     

		  	    if(matcher.matches()) {
		        System.out.println("Given email id is valid");
		      } else {
		         System.out.println("Given email id is not valid");
		      }
		  	    
		  	    
		  	//mobile number to check      
			  	String str = " 917743928819";  
			  	//method calling  
			  	if (isValidMobileNo(str))  
			  	System.out.println("It is a valid mobile number.");   
			  	else  
			  	System.out.println("Entered mobile number is invalid.");      
			  	} 
  
		   
		
		   
		   // validate first name
		   public static boolean firstName( String firstName ) {
		      return firstName.matches( "[A-Z][a-z]*" );
		   }
		   // validate last name
		   public static boolean lastName( String lastName ) {
		      return lastName.matches( "[A-Z]+([ '-][a-zA-Z]+)*" );
		   }
		   
		   
		   public static boolean isValidMobileNo(String str)  
			{  
			//(0/91): number starts with (0/91)  
			//[0-9]: then contains digits 0 to 9  
			Pattern ptrn = Pattern.compile("(0/91)?[0-9]{9}");  
			//the matcher() method creates a matcher that will match the given input against this pattern  
			Matcher match = ptrn.matcher(str);  
			//returns a boolean value  
			return (match.find() && match.group().equals(str));  
			}  
			
}


