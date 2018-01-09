package Operations;

public class ticketPrices {

	public static void main(String[] args) {
		// an integer to hold our number
		int age = -2;
		boolean isStudent = true;
		
		// if statement (condition)
		if (age < 0) {
			System.out.println("Invalid Age");
		} if (age >= 65) {
			System.out.println("Senior citizen, pay $7");
		} if (isStudent = true) {
			System.out.println("Students, pay $8");
		} if (age <= 12) {
			System.out.println("Children, pay $8");
		}	
			else {
			System.out.println("Everyone else, pay $10");
		}
	}	
}
	

