package week1.Assignments;

public class MyMobile {

	// create variables for the class
	int num = 10;
	String name = "test";
	float obj = 2.2568155f;
	double value = 2.56;
	char letter = 'h';
	boolean visible = true;

	// Create 2 public methods (makeCall() , sendMsg()) with simple print statement
	public void makeCall() {
		System.out.println("making call");
	}

	public void sendMsg() {
		System.out.println("messgae sent");
	}

	// Create a private method payBills() with simple print statement
	private void payBills() {
		System.out.println("bill paid");
	}

	// Create main method
	public static void main(String[] args) {

		// Create object for "MyMobile" class and call the methods and variables using
		// the object
		MyMobile phone = new MyMobile();

		phone.makeCall();
		phone.sendMsg();
		phone.payBills();

		// Execute the class and get the result in console
		System.out.println(phone.num);
		System.out.println(phone.name);
		System.out.println(phone.obj);
		System.out.println(phone.value);
		System.out.println(phone.letter);
		System.out.println(phone.visible);
	}
}
