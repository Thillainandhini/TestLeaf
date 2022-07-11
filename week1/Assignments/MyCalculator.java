package week1.Assignments;

public class MyCalculator {

	public static void main(String[] args) {

		// -- Create another class as MyCalculator and call all the methods from
		// Calculator and print the results

		Calculator calci = new Calculator();

		System.out.println("calculator :: add : " + calci.add(2, 3, 1));
		System.out.println("calculator :: sub :" + calci.sub(10, 5));
		System.out.println("calculator :: mul:" + calci.mul(10, 2));
		System.out.println("calculator :: divide:" + calci.divide(10, 2));
	}

}
