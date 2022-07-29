package week3.day1.assignment;

/* the input
int[] arr = {1,2,3,4,7,6,8};
a)Sort the array
b) loop through the array (start i from arr[0] till the length of the array)
c)check if the iterator variable is not equal to the array values respectively
d) print the number
e)once printed break the iteration
		
*/



import java.util.Arrays;

public class MissingElementInAnArray {

public static void main(String[] args) {
int[] arr = {1,2,3,4,7,6,8};
int arrSize = arr.length;
System.out.println("Length of the Array : " +arrSize);

//loop through the array
System.out.print("Array element : ");
for (int i=0; i<arrSize; i++)
{
	System.out.print(arr[i] + " ");
	
}

System.out.println();
System.out.print("Sorted array element : ");
Arrays.sort(arr);
for (int i=0; i<arrSize; i++)
{
	System.out.print(arr[i] + " ");
	
}

System.out.println();
for (int i=1; i<arrSize;i++)
{
	if(arr[i] - arr[i-1] == 1)
	{
		continue;
	}
	else
	{
		System.out.println("Missing Array element : " + (arr[i-1]+1));
		break;
	}
}

}

}
/*
output :
Length of the Array : 7
Array element : 1 2 3 4 7 6 8 
Sorted array element : 1 2 3 4 6 7 8 
Missing Array element : 5
*/