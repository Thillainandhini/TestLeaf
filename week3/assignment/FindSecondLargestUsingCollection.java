package week3.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestUsingCollection {

	public static void main(String[] args) {
		Integer[] data = {3,2,11,4,6,7};
		
		List<Integer> list = new ArrayList<Integer>();
		list.addAll(Arrays.asList(data));
		System.out.println(list);
		
		int totalLength = list.size();
		
		System.out.print("Sorted List :");
		Collections.sort(list);
		for(int i=0;i<totalLength;i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		System.out.println("SecondLargest Element : "+(list.get(totalLength-2)));
		
	}
}
	
	
	
/*output:
[3, 2, 11, 4, 6, 7]
Sorted List :2 3 4 6 7 11 
SecondLargest Element : 7
*/
