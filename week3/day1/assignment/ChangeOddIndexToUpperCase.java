package week3.day1.assignment;

/*
Pseudo Code
* Declare String Input as Follow
* String test = "changeme";

* a) Convert the String to character array
* b) Traverse through each character (using loop)
* c)find the odd index within the loop (use mod operator)
* d)within the loop, change the character to uppercase, if the index is odd else don't change
*/



public class ChangeOddIndexToUpperCase {

public static void main(String[] args) {
	//Declare String
	String test = "changeme";
	//Convert the String to character array
   char[] charArray = test.toCharArray();
   //Traverse through each character (using loop)
   for(int i=0;i<charArray.length;i++)
   {
   	char c = charArray[i];
   	//find the odd index within the loop (use mod operator)
   	if(i%2!=0)
   	{
   		System.out.print(charArray[i] + " " + " \t");
   		//charArray[i].toUpperCase();  .......//can't invoke toUpperCase() on primitive data type
   		c = Character.toUpperCase(c);
   		System.out.println(c + " ");
   	}
   }
}

}
/*output:
h  	H 
n  	N 
e  	E 
e  	E 
*/