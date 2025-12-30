import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    //first let Get user name
	    System.out.print("Enter your name: ");
	    String name = scanner.nextLine();
	    //second let get user birthday 
	    System.out.print("Enter your birthday (yyyy-MM-dd): ");
	    String birthdayinput = scanner.nextLine();
	    
	    
	    // third let Parse the input string into a localDate object
	    
	    LocalDate birthdate = LocalDate.parse(birthdayinput);
	    
	    
	    // Define the output format
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MM dd, yyyy");
	    
	    // format the birthdate using the defined formatter
	    
	    String formattedbirthdate = birthdate.format(formatter);
	    
	    // Display the result 
		System.out.println("Hello "+ name + "! Your birthdate is: " + formattedbirthdate);
		// close the scanner
		
		scanner.close();
	}
}
