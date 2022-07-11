package week1.Assignments;

public class OddOrEven {

	// Print if the given number is odd or even

	// Goal: To understand the mod operator(%), conditional statement and logic
	// writing

//	a) Create a class by name: OddOrEven

//	b) Create a main method using shortcut

//	c) Declare a class variable of type of int with a value as input

	static int value = 41752;

	public static void main(String[] args) {
		/*
		 * Scanner s= new Scanner(System.in); System.out.print("Enter your value: ");
		 * int value = s.nextInt();
		 */
		
		int mod = value % 2;
		System.out.println(mod);
		if (mod == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}

	}

//		d) Write a logic to print if the given input is odd or even

}
//	Hint: Divide the given input by 2 and if the remainder is 0 -> even else odd. 
//	Use mod (%) operator to find remainder
