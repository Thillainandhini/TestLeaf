package week3.day1.assignment;

/*
 * Pseudo Code
	  //Anagram = two strings anagrams if they contain the same characters but in a different order. 
	  
	 *Declare a String 
		String text1 = "stops";
	 *Declare another String
		String text2 = "potss"; 
	 * a) Check length of the strings are same then (Use A Condition)
	 * b) Convert both Strings in to characters
	 * c) Sort Both the arrays
	 * d) Check both the arrays has same value
	 * 
 */


			
import java.util.Arrays;

public class Anagram {
	  public static void main(String[] args) {
		String str="stops";
		String str1="potss";
		int length=str.length();
		int length1=str1.length();
		
		if(length==length1)
		{
			char[] ch=str.toCharArray();
			Arrays.sort(ch);
			System.out.println(ch);
			
			char[] ch1=str1.toCharArray();
			Arrays.sort(ch1);
			System.out.println(ch1);
			
			if(Arrays.equals(ch,ch1))
			{
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("Not Anagram");
			}
			
			
		}
	}

}
/*output:
 true
stops & potss Strings are anagram
 */