package week1.Assignments;

public class NegativeNumberToPositiveNumber {

	public static void main(String[] args) {
		// 1. Initialize an integer with a negative number like,

		int number = -40;

		// * 2. Check if the number is a negative number
		// * Hint : any number that is lesser than zero is a negative number

		if (number < 0) {
			System.out.println("Negative Number");
			number = number * -1;

			// * 3. If so, convert the number to a positive number

			// * 4. Print the converted positive number
			System.out.println("converted positive number :" + number);

		}

	}

}
