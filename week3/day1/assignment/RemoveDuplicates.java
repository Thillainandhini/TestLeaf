package week3.day1.assignment;

/*
 * Pseudo code 
 
 * a) Use the declared String text as input
	String text = "We learn java basics as part of java sessions in java week1";		
 * b) Initialize an integer variable as count	  
 * c) Split the String into array and iterate over it 
 * d) Initialize another loop to check whether the word is there in the array
 * e) if it is available then increase and count by 1. 
 * f) if the count > 1 then replace the word as "" 
 
 * g) Displaying the String without duplicate words	
*/



public class RemoveDuplicates {
	 public static void main(String[] args) {
		String text="We learn java basics as part of java sessions in java week1";
		int count=1;
		String[] str=text.split(" ");
		for(int i=0;i<str.length;i++)
		{
			for(int j=0;j<str.length;j++)
			{
				if(str[i].equals(str[j])){
					count++;
					
					
				}
			}
			if(count>1) {
				System.out.print(str[i].replace("java"," "));
		}
		
	}
	 }
	}
/*output:
Original String :we learn java basics as part of java sessions in java week1
Duplicate word from the String : java java java 
Duplicate word count is : 3
String without duplicate words : we learn  basics as part of  sessions in  week1
*/