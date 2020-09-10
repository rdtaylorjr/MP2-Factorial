package factorial;

import java.util.Scanner;

/*
 * Programmer: Russell Taylor  Date: 5/20/2020
 * Calculates the factorial of values input by the user
 */

public class Factorial {
	
	public static void main(String[] args) {
		long n, factorial;
		String again = "y";
		Scanner in = new Scanner(System.in);
		
		while (again.equals("y")) {
			// prompt user to enter an integer
			System.out.print("Enter N: ");
			n = in.nextLong();

			// calculate factorial
			if (n == 0) factorial = 1;
			else factorial = n;
			while (n > 1) factorial = factorial * --n;
			
			// display factorial
			System.out.println("Factorial = " + factorial);

			// ask user whether to continue
			System.out.print("Do you want to continue? (y/n) ");
			in.nextLine();
			again = in.nextLine();
			System.out.println();
		}
		
		System.out.println("Have a good day");
			
		in.close();
	}
	
}
