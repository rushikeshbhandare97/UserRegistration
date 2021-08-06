package regex;

public class NameValidation {
	
		   public static void main( String[] args ) {
		      System.out.println(firstName("Rushikesh"));
		      
		   }
		   // validate first name
		   public static boolean firstName( String firstName ) {
		      return firstName.matches( "[A-Z][a-z]*" );
          }
}
	
	
	

