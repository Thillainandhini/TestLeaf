package week3.day1.assignment;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		int[] data = {3,2,11,4,6,7};
		int dataLenght = data.length;
		System.out.println("Length of the Array : "+dataLenght);
		Arrays.sort(data);
		System.out.print("Sorted Array Elements : ");
		
		for(int i=0 ; i<dataLenght ; i++)
		{
			System.out.print(data[i] + " ");
		}
		System.out.println();
		System.err.print("Second Largest Element : "+data[dataLenght-2]);
		
		
	}

}
/*output:
Length of the Array : 6
Sorted Array Elements : 2 3 4 6 7 11 
Second Largest E*/