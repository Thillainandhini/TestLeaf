package week1.Assignments;

public class Calculator {

	// Create a class "Calculator" with below methods
	// (a) add(int num1, int num2, int num3), it should return sum of num1+num2+num3

	int add(int num1, int num2, int num3) {
		int sum = num1 + num2 + num3;
		return sum;
	}

	// (b) sub(int num1, int num2), it should return subtraction of of num1-num2

	int sub(int num1, int num2) {
		int sub = num1 - num2;
		return sub;
	}

	// (c) mul(double num1, double num2), it should return product of num1 * num2

	double mul(double num1, double num2) {
		double mul = (num1 * num2);
		return mul;

	}

	// (d) divide(float num1, float num2), it should return division of num1 / num2

	float divide(float num1, float num2) {
		float divide = num1 / num2;
		return divide;
	}

	//-- Create another class as MyCalculator and call all the methods from Calculator and print the results

}
