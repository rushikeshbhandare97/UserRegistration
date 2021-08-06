package regex;

public class LastNameValidation {
	
	public static void main(String[] args) {
		
		
		 System.out.println(lastName("Bhandare"));
		
	  }
	
	
		// validate last name
	   public static boolean lastName( String lastName ) {
	      return lastName.matches( "[A-Z][a-z]*" );
	      
	   }
	}


