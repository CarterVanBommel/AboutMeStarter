/*
 * Programmer: Carter Van Bommel
 * Date: September 22, 2020
 * Purpose: To demonstrate the  
 */

public class AboutMe {

	public static void main(String[] args) {

		// Declaring the variables
		final String MY_NAME = "Carter";
		int myAge = 16;
		double myHeightInMetres = 1.78;
		
        // Print the values
        System.out.println("Hi, my name is " + MY_NAME + ".");
        System.out.println("I am " + myAge + " years old.");
        System.out.println("My height is " + myHeightInMetres + " m.");

        // Change the variables
        myAge = 18;
        myHeightInMetres = 1.83;

        // Print the new values
		System.out.println("Some time passes...");
		System.out.println("I am now " + myAge + " years old.");
		System.out.println("I have grown and am " + myHeightInMetres + " m tall.");
				
	}

}