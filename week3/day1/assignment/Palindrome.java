package week3.day1.assignment;

/*find the given string is palindrome or not
/*
* Pseudo Code

* a) Declare A String value as"madam"
* b) Declare another String rev value as ""
* c) Iterate over the String in reverse order
* d) Add the char into rev
* e) Compare the original String with the reversed String, if it is same then print palinDrome 

* Hint: Use .equals or .equalsIgnoreCase when you compare a String 
*/



public class Palindrome {

public static void main(String[] args) {
   
	//Declare A String value as"madam"
	String str = "madam";
	//Declare another String rev value as ""
	String rev = "";
	
	int strLength = str.length();
	//Iterate over the String in reverse order
	for (int i=strLength-1; i >= 0; i--)
	{
		//Add the char into rev
		rev = str.charAt(i) + rev;
	}
	System.out.println("Original String : " +str);
	System.out.println("Reverse String  :  " +rev);
	
	//Compare the original String with the reversed String
	if(str.equalsIgnoreCase(rev))
	{
		System.out.println( str +" is a palindrome String");
	}
	else
	{
		System.out.println(str + " is a not palindrome String");
	}
	
}
}

/*output:
Original String : madam
Reverse String  :  madam
madam is a palindrome */