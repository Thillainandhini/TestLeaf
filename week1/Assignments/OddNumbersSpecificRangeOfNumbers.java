package week1.Assignments;

public class OddNumbersSpecificRangeOfNumbers {

	public static void main(String[] args) {
		// Input: range of numbers (starting to end) [1 to 20]
		// * Output: Printing only odd numbers [1,3,5,7,9...,19]

//		Iterate from 1 to 20 (tip: using loop concept)
		// Within loop -> check whether the integer is odd (tip: use mod operator % )

		// Within loop -> print the odd integer

		for (int i = 1; i <= 20; i++) {
			if (i % 2 != 0) {
				System.out.println("Printing only the odd numbers from 1 to 20   " + i);
			}

		}

	}

}
