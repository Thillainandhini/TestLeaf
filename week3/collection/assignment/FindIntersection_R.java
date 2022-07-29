package week3.collection.assignment;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindIntersection_R {

	public static void main(String[] args) {
		Integer[] arr1 =	{3,2,11,4,6,7};	 
		Integer[] arr2 =   {1,2,8,4,9,7};
	
	   Set<Integer> set1 = new HashSet<Integer>();
	   Set<Integer> set2 = new HashSet<Integer>();
	   
	   set1.addAll(Arrays.asList(arr1));
	   System.out.print("1st set : ");
	   System.out.print(set1);
	   
	   set2.addAll(Arrays.asList(arr2));
	   System.out.print("\n"+"2nd set : ");
	   System.out.print(set2);
	   
	   System.out.print("\n"+"Intersection of two sets : ");
	   set1.retainAll(set2);
	   System.out.print(set1);
	}

}
/*output:
 1st set : [2, 3, 4, 6, 7, 11]
2nd set : [1, 2, 4, 7, 8, 9]
Intersection of two sets : [2, 4, 7]
*/