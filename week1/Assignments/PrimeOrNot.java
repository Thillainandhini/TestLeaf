package week1.Assignments;

public class PrimeOrNot {

	public static void main(String[] args) {

		// * input: 13
		// * output: 13 is a Prime Number
		// Declare an int Input and assign a value 13

		int value = 13;

		// Declare a boolean variable flag as false

		boolean flag = false;

		// Iterate from 2 to half of the input
		// Divide the input with each for loop variable and check the remainder

		// Set the flag as true when there is no remainder

		// break the iterator

		for (int i = 2; i <= value / 2; i++) {
			if (value % i == 0) {
				flag = true;
				break;
			}

		}
		// Check the flag (Provide a condition)

		// Print 'Prime' when the condition matches

		// Print 'Not a Prime' when the condition doesn't match
		if (flag) {
			System.out.println("Not a Prime");
		} else {
			System.out.println("Prime");
		}

	}

}
